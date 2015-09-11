package ru.ttv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user1 on 30.06.2015.
 */
public class OracleDAOFactory extends DAOFactory {
    public static final String driver = "oracle.jdbc.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:autoservice";
    public static final String username = "tim";
    public static final String password = "trance";
    public static Connection connection = null;

    public static Connection createConnection(){
        if (connection == null){
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("connecting: " + url);

            }catch (ClassNotFoundException e){

            }catch (SQLException e){

            }
        }
        return connection;
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return new OracleCustomerDAO();
    }

    @Override
    public CarDAO getCarDAO() {

        return new OracleCarDAO();
    }

    @Override
    public CarModelsDAO getCarModelsDAO() {

        return new OracleCarModelsDAO();
    }

    @Override
    public UserDAO getUserDAO() {

        return new OracleUserDAO();
    }

    @Override
    public UserPrivilegesDAO getUserPrivilegesDAO() {

        return new OracleUserPrivilegesDAO();
    }

    @Override
    public StaffDAO getStaffDAO() {

        return new OracleStaffDAO();
    }

    @Override
    public ContactHistoryDAO getContactHistoryDAO() {

        return new OracleContactHistoryDAO();
    }

    @Override
    public JobDAO getJobDAO() {

        return new OracleJobDAO();
    }

    @Override
    public GoodsDAO getGoodsDAO() {

        return new OracleGoodsDAO();
    }

    @Override
    public RepairStateDAO getRepairStateDAO() {

        return new OracleRepairStateDAO();
    }

    @Override
    public RepairDAO getRepairDAO() {

        return new OracleRepairDAO();
    }

    @Override
    public RepairJobDAO getRepairJobDAO() {

        return new OracleRepairJobDAO();
    }

    @Override
    public RepairGoodsDAO getRepairGoodsDAO() {

        return new OracleRepairGoodsDAO();
    }

    @Override
    public RepairJobEmployeeDAO getRepairJobEmployeeDAO() {

        return null;
    }
}
