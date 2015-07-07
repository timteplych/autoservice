package ru.ttv.dao;

import ru.ttv.accountentities.Goods;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleGoodsDAO implements GoodsDAO {
    @Override
    public int insertGoodsItem() {
        return 0;
    }

    @Override
    public boolean deleteGoodsItem() {
        return false;
    }

    @Override
    public Goods findGoodsItem() {
        return null;
    }

    @Override
    public boolean updateGoodsItem() {
        return false;
    }
}
