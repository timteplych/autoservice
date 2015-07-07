package ru.ttv.dao;

import ru.ttv.accountentities.RepairState;

/**
 * Created by user1 on 03.07.2015.
 */
public interface RepairStateDAO {
    public int insertRepairState();
    public boolean deleteRepairState();
    public RepairState findRepairState();
    public boolean updateRepairState();
    //public RowSet selectCarsRS();
}
