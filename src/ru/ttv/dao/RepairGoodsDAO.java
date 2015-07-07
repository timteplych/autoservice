package ru.ttv.dao;

import ru.ttv.accountentities.RepairGoods;

/**
 * Created by user1 on 04.07.2015.
 */
public interface RepairGoodsDAO {
    public int insertRepairGoods();
    public boolean deleteRepairGoods();
    public RepairGoods findRepairGoods();
    public boolean updateRepairGoods();
}
