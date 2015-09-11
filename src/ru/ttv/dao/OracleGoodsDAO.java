package ru.ttv.dao;

import ru.ttv.accountentities.Goods;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleGoodsDAO implements GoodsDAO {
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    Statement statement = null;

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
        String query = "select ID,\n" +
                "  NAME,\n" +
                "  PURCHASEPRICE,\n" +
                "  PRICE\n" +
                "from GOODS where id = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                Goods goodsItem = new Goods();
                goodsItem.setId(rs.getInt("ID"));
                goodsItem.setName(rs.getString("NAME"));
                goodsItem.setPurchasePrice(rs.getFloat("PURCHASEPRICE"));
                goodsItem.setPrice(rs.getFloat("PRICE"));

                return goodsItem;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }

    @Override
    public boolean updateGoodsItem() {
        return false;
    }

    @Override
    public Map<Integer, String> getGoodsList(Connection conn) {
        Map<Integer,String> goodsList = new HashMap<>();
        String query = "select id, name as name from GOODS";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                goodsList.put((Integer) rs.getInt("id"), rs.getString("name"));
            }
        }catch (SQLException ex){

        }

        return goodsList;
    }
}
