package ru.ttv.dao;

import ru.ttv.accountentities.Staff;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public interface StaffDAO {
    public int insertStaff();
    public boolean deleteStaff();
    public Staff findStaff(String id, Connection conn);
    public boolean updateStaff();
    public Map<Integer,String> getStaffList(Connection conn);
    //public RowSet selectCarsRS();    
}
