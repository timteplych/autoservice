package ru.ttv.dao;

import ru.ttv.accountentities.Staff;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLStaffDAO implements StaffDAO {
    @Override
    public int insertStaff() {
        return 0;
    }

    @Override
    public boolean deleteStaff() {
        return false;
    }

    @Override
    public Staff findStaff(String id, Connection conn) {
        return null;
    }

    @Override
    public boolean updateStaff() {
        return false;
    }

    @Override
    public Map<Integer, String> getStaffList(Connection conn) {
        return null;
    }
}
