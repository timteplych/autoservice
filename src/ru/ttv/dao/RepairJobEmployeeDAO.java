package ru.ttv.dao;

import ru.ttv.accountentities.RepairJobEmployee;

/**
 * Created by user1 on 04.07.2015.
 */
public interface RepairJobEmployeeDAO {
    public int insertRepairJobEmployee();
    public boolean deleteRepairJobEmployee();
    public RepairJobEmployee findRepairJobEmployee();
    public boolean updateRepairJobEmployee();
}
