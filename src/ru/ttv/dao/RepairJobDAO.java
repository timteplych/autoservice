package ru.ttv.dao;

import ru.ttv.accountentities.RepairJob;

/**
 * Created by user1 on 04.07.2015.
 */
public interface RepairJobDAO {
    public int insertRepairJob();
    public boolean deleteRepairJob();
    public RepairJob findRepairJob();
    public boolean updateRepairJob();
}
