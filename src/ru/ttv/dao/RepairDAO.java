package ru.ttv.dao;

import ru.ttv.accountentities.Repair;

/**
 * Created by user1 on 04.07.2015.
 */
public interface RepairDAO {
    public int insertRepairState();
    public boolean deleteRepairState();
    public Repair findRepairState();
    public boolean updateRepairState();
}
