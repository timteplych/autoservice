package ru.ttv.dao;

import ru.ttv.accountentities.Staff;

/**
 * Created by user1 on 03.07.2015.
 */
public interface StaffDAO {
    public int insertStaff();
    public boolean deleteStaff();
    public Staff findStaff();
    public boolean updateStaff();
    //public RowSet selectCarsRS();    
}
