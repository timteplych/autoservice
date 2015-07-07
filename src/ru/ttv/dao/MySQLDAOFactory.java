package ru.ttv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLDAOFactory extends DAOFactory {
    public static final String driver = "oracle.jdbc.OracleDriver";
    public static final String url = "jdbc:oracle:thin:@localhost:1521:autoservice";
    public static final String username = "tim";
    public static final String password = "trance";
    public static Connection connection = null;

    public static Connection createConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("connecting: " + url);

        }catch (ClassNotFoundException e){

        }catch (SQLException e){

        }
        return connection;
    }

    @Override
    public CustomerDAO getCustomerDAO() {
        return null;
    }

    @Override
    public CarDAO getCarDAO() {
        return null;
    }

    @Override
    public CarModelsDAO getCarModelsDAO() {
        return null;
    }

    @Override
    public UserDAO getUserDAO() {
        return null;
    }

    @Override
    public UserPrivilegesDAO getUserPrivilegesDAO() {
        return null;
    }

    @Override
    public StaffDAO getStaffDAO() {
        return null;
    }

    @Override
    public ContactHistoryDAO getContactHistoryDAO() {
        return null;
    }

    @Override
    public JobDAO getJobDAO() {
        return null;
    }

    @Override
    public GoodsDAO getGoodsDAO() {
        return null;
    }

    @Override
    public RepairStateDAO getRepairStateDAO() {
        return null;
    }

    @Override
    public RepairDAO getRepairDAO() {
        return null;
    }

    @Override
    public RepairJobDAO getRepairJobDAO() {
        return null;
    }

    @Override
    public RepairGoodsDAO getRepairGoodsDAO() {
        return null;
    }

    @Override
    public RepairJobEmployeeDAO getRepairJobEmployeeDAO() {
        return null;
    }
}
