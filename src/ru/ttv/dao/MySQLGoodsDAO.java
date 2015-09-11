package ru.ttv.dao;

import ru.ttv.accountentities.Goods;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLGoodsDAO implements GoodsDAO {
    @Override
    public int insertGoodsItem() {
        return 0;
    }

    @Override
    public boolean deleteGoodsItem() {
        return false;
    }

    @Override
    public Goods findGoodsItem(String id, Connection conn) {
        return null;
    }

    @Override
    public boolean updateGoodsItem() {
        return false;
    }

    @Override
    public Map<Integer, String> getGoodsList(Connection conn) {
        return null;
    }
}
