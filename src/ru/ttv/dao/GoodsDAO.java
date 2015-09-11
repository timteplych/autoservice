package ru.ttv.dao;

import ru.ttv.accountentities.Goods;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public interface GoodsDAO {
    public int insertGoodsItem();
    public boolean deleteGoodsItem();
    public Goods findGoodsItem(String id, Connection conn);
    public boolean updateGoodsItem();
    public Map<Integer,String> getGoodsList(Connection conn);
    //public RowSet selectCarsRS();
}
