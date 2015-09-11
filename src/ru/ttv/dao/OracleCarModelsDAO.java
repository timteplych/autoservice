package ru.ttv.dao;

import ru.ttv.accountentities.CarModel;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleCarModelsDAO implements CarModelsDAO {
    PreparedStatement preparedStatement = null;
    Statement statement = null;
    ResultSet rs = null;
    @Override
    public int insertModel() {
        return 0;
    }

    @Override
    public boolean deleteModel() {
        return false;
    }

    @Override
    public CarModel findModel(String id, Connection conn) {
        String query = "select ID,\n" +
                "  MODELNAME\n" +
                "from CARMODELS where id = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                CarModel carModel = new CarModel();
                carModel.setModelName(rs.getString("MODELNAME"));
                carModel.setId(rs.getInt("ID"));
                return carModel;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }

    @Override
    public boolean updateModel() {
        return false;
    }

    @Override
    public Map<Integer, String> getCarModelsList(Connection conn) {
        Map<Integer,String> carList = new HashMap<>();
        String query = "select id, modelname as name from CARMODELS";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                carList.put((Integer) rs.getInt("id"), rs.getString("name"));
            }
        }catch (SQLException ex){

        }

        return carList;
    }
}
