package ru.ttv.dao;

import ru.ttv.accountentities.Car;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleCarDAO implements CarDAO {
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;
    private Statement statement = null;

    @Override
    public int insertCar() {
        return 1;
    }

    @Override
    public boolean deleteCar() {
        return true;
    }

    @Override
    public Car findCar(String id, Connection conn) {
        String query = "select ID,\n" +
                "  NAME,\n" +
                "  MODEL,\n" +
                "  CUSTOMER,\n" +
                "  AUTHOR,\n" +
                "  STATENUMBER,\n" +
                "  VIN\n" +
                "from car where id = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                Car car = new Car();
                car.setName(rs.getString("NAME"));
                car.setId(rs.getInt("ID"));
                car.setModel(rs.getInt("MODEL"));
                car.setCustomer(rs.getInt("CUSTOMER"));
                car.setAuthor(rs.getInt("AUTHOR"));
                car.setStateNumber(rs.getString("STATENUMBER"));
                car.setVIN(rs.getString("VIN"));
                return car;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }

    @Override
    public Map<Integer, String> getCarList(Connection conn) {
        Map<Integer,String> carList = new HashMap<>();
        String query = "select id, name from car";
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

    @Override
    public boolean updateCar() {
        return true;
    }


}
