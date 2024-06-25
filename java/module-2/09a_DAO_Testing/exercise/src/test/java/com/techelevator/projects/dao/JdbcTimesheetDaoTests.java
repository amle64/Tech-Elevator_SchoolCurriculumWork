package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private static final Timesheet TIMESHEET_5 = new Timesheet(5, 2, 2,
            LocalDate.parse("2021-02-01"), 1.5, false, "Timesheet 4");

    private static final Timesheet TIMESHEET_1_updated = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 3.5, true, "Timesheet 1");


    private JdbcTimesheetDao dao;


    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheetById_with_valid_id_returns_correct_timesheet() {
        //Assert.fail();


        Timesheet timesheet1 = dao.getTimesheetById(1);
        Timesheet timesheet2 = dao.getTimesheetById(2);
        assertTimeSheetMatch(timesheet1,TIMESHEET_1);
        assertTimeSheetMatch(timesheet2,TIMESHEET_2);

    }

    private void assertTimeSheetMatch (Timesheet expected, Timesheet actual){
        Assert.assertEquals(expected.getTimesheetId(),actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(),actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(),actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(),actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(),actual.getHoursWorked(),0.0001);
        Assert.assertEquals(expected.isBillable(),actual.isBillable());
        Assert.assertEquals(expected.getDescription(),actual.getDescription());

    }

    @Test
    public void getTimesheetById_with_invalid_id_returns_null_timesheet() {
        Timesheet timesheet = dao.getTimesheetById(5);

        Assert.assertNull(timesheet);

    }

    @Test
    public void getTimesheetsByEmployeeId_with_valid_employee_id_returns_list_of_timesheets_for_employee() {
        List<Timesheet> expected = dao.getTimesheetsByEmployeeId(1);
        List<Timesheet> actual = List.of(new Timesheet[]{TIMESHEET_1, TIMESHEET_2});

        assertTimeSheetMatchByProjectOrEmployeeId(expected,actual);
    }

    private void assertTimeSheetMatchByProjectOrEmployeeId(List<Timesheet> expected, List<Timesheet> actual){
        for (int i =0;i<expected.size();i++){
            assertTimeSheetMatch(expected.get(i),actual.get(i));
        }
    }

    @Test
    public void getTimesheetsByEmployeeId_with_invalid_employee_id_returns_empty_list_of_timesheets() {
        List<Timesheet> expected = dao.getTimesheetsByEmployeeId(3);

        Assert.assertNull(expected);
    }

    @Test
    public void getTimesheetsByProjectId_with_valid_project_id_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> expected = dao.getTimesheetsByProjectId(1);
        List<Timesheet> actual = List.of(new Timesheet[] {TIMESHEET_1,TIMESHEET_2,TIMESHEET_3});

        assertTimeSheetMatchByProjectOrEmployeeId(expected,actual);
        // Assert.fail();
    }

    @Test
    public void getTimesheetsByProjectId_with_invalid_project_id_returns_empty_list_of_timesheets() {
        int invalidProjectId =3;
        List<Timesheet> expected = dao.getTimesheetsByProjectId(invalidProjectId);
        Assert.assertNull(expected);
        //Assert.fail();
    }

    @Test
    public void createTimesheet_creates_timesheet() {
        Timesheet expected = TIMESHEET_5;
        Timesheet actual = dao.createTimesheet(TIMESHEET_5);
        assertTimeSheetMatch(expected,TIMESHEET_5);
        //Assert.fail();
    }

    @Test
    public void updateTimesheet_updates_timesheet() {
        Timesheet expected = TIMESHEET_1_updated;
        Timesheet actual =dao.updateTimesheet(TIMESHEET_1_updated);

        assertTimeSheetMatch(expected,actual);


    }

    @Test
    public void deleteTimesheetById_deletes_timesheet() {
        Timesheet timesheet1 = TIMESHEET_1;
        int deletedId = dao.deleteTimesheetById(1);

        Assert.assertNull(dao.getTimesheetById(1));
        //Assert.fail();
    }

    @Test
    public void getBillableHours_returns_correct_total() {
        //2.75 hours employee 1
        double expected = dao.getBillableHours(1,1,true);
        Assert.assertEquals(2.50,expected,0.001);

        double expected2 = dao.getBillableHours(2,2,false);
        Assert.assertEquals(0.00,expected2,0.001);
       // Assert.fail();
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
