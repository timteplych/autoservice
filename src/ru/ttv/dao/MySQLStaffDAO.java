package ru.ttv.dao;

import ru.ttv.accountentities.Staff;

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
    public Staff findStaff() {
        return null;
    }

    @Override
    public boolean updateStaff() {
        return false;
    }
}
