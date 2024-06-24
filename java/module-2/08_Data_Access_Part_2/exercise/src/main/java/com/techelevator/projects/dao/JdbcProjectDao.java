package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.CannotAcquireLockException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.exception.DaoException;
import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final String PROJECT_SELECT = "SELECT p.project_id, p.name, p.from_date, p.to_date FROM project p";

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProjectById(int projectId) {
		Project project = null;

		try{
			String sql = PROJECT_SELECT +
					" WHERE p.project_id=?";

			SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
			if (results.next()) {
				project = mapRowToProject(results);
			}
		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Cannot connect to database or server",e);
		} catch (DataIntegrityViolationException e){
			throw new DaoException("HELLO",e);
		}


		return project;
	}

	@Override
	public List<Project> getProjects() {
		List<Project> allProjects = new ArrayList<>();

		try{
			String sql = PROJECT_SELECT;

			SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
			while (results.next()) {
				Project projectResult = mapRowToProject(results);
				allProjects.add(projectResult);
			}
		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Cannot connect to database or server",e);
		}


		return allProjects;
	}

	@Override
	public Project createProject(Project newProject) {
        Project createProject;
        try {
            createProject = null;

            String sql = "INSERT INTO project (name, from_date, to_date)";
            sql += "VALUES (?,?,?) RETURNING project_id;";

            int createProjectId = jdbcTemplate.queryForObject(sql, int.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate());
            createProject = getProjectById(createProjectId);
        } catch (CannotGetJdbcConnectionException e) {
            throw new DaoException("Cannot connect to database or server", e);
        } catch (DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}
        return createProject;
    }
	
	@Override
	public void linkProjectEmployee(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee (employee_id, project_id) VALUES (?,?);";

		try{
			jdbcTemplate.update(sql,employeeId,projectId);

		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Cannot connect to database or server",e);
		} catch(DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}

	}

	@Override
	public void unlinkProjectEmployee(int projectId, int employeeId) {
		String sql = "DELETE FROM project_employee WHERE employee_id = ? AND project_id = ?;";

		try{
			jdbcTemplate.update(sql,employeeId, projectId);
		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Cannot connect to database or server",e);
		} catch(DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}

	}

	@Override
	public Project updateProject(Project project) {
		//String sql = "UPDATE department SET name = ? WHERE department_id = ?;";
		Project updatedProject = null;

		try{
			String sql = "UPDATE project SET name = ?, from_date = ?, to_date = ? WHERE project_id = ?;";

			jdbcTemplate.update(sql,project.getName(),project.getFromDate(),project.getToDate(),project.getId());
			updatedProject = getProjectById(project.getId());
		}catch (CannotGetJdbcConnectionException e){
			throw new DaoException("Cannot connect to database or server",e);
		}catch(DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}
		return updatedProject;
	}
	@Override
	public int deleteProjectById(int projectId) {
		int numberOfRows = 0;
		String deleteProjectEmployeeSql = "DELETE FROM project_employee WHERE project_id = ?";
		String deleteProjectSql = "DELETE FROM project WHERE project_id = ?";

		try {
			jdbcTemplate.update(deleteProjectEmployeeSql, projectId);
			numberOfRows = jdbcTemplate.update(deleteProjectSql,projectId);
		} catch (CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		} catch(DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}

		return numberOfRows;
	}
	
	private Project mapRowToProject(SqlRowSet results) {
		Project project = new Project();
		project.setId(results.getInt("project_id"));
		project.setName(results.getString("name"));
		if (results.getDate("from_date") != null) {
			project.setFromDate(results.getDate("from_date").toLocalDate());
		}
		if (results.getDate("to_date") != null) {
			project.setToDate(results.getDate("to_date").toLocalDate());
		}
		return project;
	}

}
