package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.exception.DaoException;
import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

	private final String DEPARTMENT_SELECT = "SELECT d.department_id, d.name FROM department d ";
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartmentById(int id) {
		Department department = null;
		String sql = DEPARTMENT_SELECT +
				" WHERE d.department_id=?";

		try{
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
			if (results.next()) {
				department = mapRowToDepartment(results);
			}

		} catch (CannotGetJdbcConnectionException e){
			throw new DaoException("unable to connect to server or database",e);
		}
		return department;
	}

	@Override
	public List<Department> getDepartments() {
		List<Department> departments = new ArrayList<>();
		String sql = DEPARTMENT_SELECT;

		try{
			SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
			while (results.next()) {
				departments.add(mapRowToDepartment(results));
			}

		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database",e);
		}


		return departments;
	}

	@Override
	public Department createDepartment(Department department) {
		Department newDepartment = null;
		String sql = "INSERT INTO department (name)";
		sql += "VALUES (?) RETURNING department_id;";
		try {
			int newDepartmentId = jdbcTemplate.queryForObject(sql,int.class,department.getName());
			newDepartment = getDepartmentById(newDepartmentId);
		} catch(DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		} catch (CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database",e);
		}
		return newDepartment;
	}

	@Override
	public Department updateDepartment(Department department) {
		Department updateDepartment = null;
		String sql = "UPDATE department SET name = ? WHERE department_id = ?;";

		try {
			jdbcTemplate.update(sql, department.getName(), department.getId());
			updateDepartment = getDepartmentById(department.getId());
		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Unable to connect to server or database", e);
		} catch (DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}
		return updateDepartment;

	}

	@Override
	public int deleteDepartmentById(int id) {
		int numberOfRows = 0;
		String deleteProjectEmployeeSql = "DELETE FROM project_employee WHERE employee_id IN (SELECT employee_id FROM employee WHERE department_id = ?);";
		String deleteEmployeeSql = "DELETE FROM employee WHERE department_id = ?;";

		String deleteDepartmentSql = "DELETE FROM department WHERE department_id = ?;";
		try {
			//Delete the references in project_employee tables then delete the employee table to finally able to delete all of the department data with the id given.
			jdbcTemplate.update(deleteProjectEmployeeSql,id);
			jdbcTemplate.update(deleteEmployeeSql,id);
			numberOfRows = jdbcTemplate.update(deleteDepartmentSql,id);
		} catch(CannotGetJdbcConnectionException e){
			throw new DaoException("Cannot get connect to server or database",e);
		} catch(DataIntegrityViolationException e){
			throw new DaoException("Data integrity violation",e);
		}
		return numberOfRows;
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department department = new Department();
		department.setId(results.getInt("department_id"));
		department.setName(results.getString("name"));
		return department;
	}

}
