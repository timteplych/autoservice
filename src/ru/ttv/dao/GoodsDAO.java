package ru.ttv.dao;

import ru.ttv.accountentities.Goods;

/**
 * Created by user1 on 03.07.2015.
 */
public interface GoodsDAO {
    public int insertGoodsItem();
    public boolean deleteGoodsItem();
    public Goods findGoodsItem();
    public boolean updateGoodsItem();
    //public RowSet selectCarsRS();
}
