package ru.ttv.dao;

import ru.ttv.accountentities.RepairJob;

/**
 * Created by user1 on 04.07.2015.
 */
public class OracleRepairJobDAO implements RepairJobDAO {
    @Override
    public int insertRepairJob() {
        return 0;
    }

    @Override
    public boolean deleteRepairJob() {
        return false;
    }

    @Override
    public RepairJob findRepairJob() {
        return null;
    }

    @Override
    public boolean updateRepairJob() {
        return false;
    }
}
