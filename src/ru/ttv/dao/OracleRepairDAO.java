package ru.ttv.dao;

import ru.ttv.accountentities.Repair;

/**
 * Created by user1 on 04.07.2015.
 */
public class OracleRepairDAO implements RepairDAO {
    @Override
    public int insertRepairState() {
        return 0;
    }

    @Override
    public boolean deleteRepairState() {
        return false;
    }

    @Override
    public Repair findRepairState() {
        return null;
    }

    @Override
    public boolean updateRepairState() {
        return false;
    }
}
