package ru.ttv.beans;

import ru.ttv.accountentities.*;
import ru.ttv.dao.*;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 13.07.2015.
 */

public class EntityBean {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomerByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        CustomerDAO customerDAO = daoFactory.getCustomerDAO();
        return customerDAO.findCustomer(id, conn);
    }

    public Car getCarByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        CarDAO carDAO = daoFactory.getCarDAO();
        return carDAO.findCar(id, conn);
    }

    public CarModel getCarModelByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        CarModelsDAO carModelsDAO = daoFactory.getCarModelsDAO();
        return carModelsDAO.findModel(id, conn);
    }

    public Goods getGoodsItemByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        GoodsDAO goodsDAO = daoFactory.getGoodsDAO();
        return goodsDAO.findGoodsItem(id, conn);
    }

    public Job getJobByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        JobDAO jobDAO = daoFactory.getJobDAO();
        return jobDAO.findJob(id, conn);
    }

    public Staff getStaffByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        StaffDAO staffDAO = daoFactory.getStaffDAO();
        return staffDAO.findStaff(id, conn);
    }

    public User getUserByID(String id){
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        UserDAO userDAO = daoFactory.getUserDAO();
        return userDAO.findUser(id, conn);
    }

    public Map<Integer,String> getEntityList(String entityType) {
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        switch (entityType){
            case "customers": {
                CustomerDAO customerDAO = daoFactory.getCustomerDAO();

                return customerDAO.getCustomerList(conn);
            }
            case "cars": {
                CarDAO carDAO = daoFactory.getCarDAO();
                return carDAO.getCarList(conn);
            }
            case "models": {
                CarModelsDAO carModelsDAO = daoFactory.getCarModelsDAO();
                return carModelsDAO.getCarModelsList(conn);
            }
            case "goods": {
                GoodsDAO goodsDAO = daoFactory.getGoodsDAO();
                return goodsDAO.getGoodsList(conn);
            }
            case "jobs": {
                JobDAO jobDAO = daoFactory.getJobDAO();
                return jobDAO.getJobList(conn);
            }
            case "staff": {
                StaffDAO staffDAO = daoFactory.getStaffDAO();
                return staffDAO.getStaffList(conn);
            }
            case "users": {
                UserDAO userDAO = daoFactory.getUserDAO();
                return userDAO.getUsersList(conn);
            }
            default: return null;
        }

    }

    public String getCaption(String entityType){
        switch (entityType){
            case "customers": return "Покупатели";
            case "cars": return "Автомобили";
            case "models": return "Модели автомобилей";
            case "goods": return "Товары";
            case "jobs": return "Работы";
            case "staff": return "Сотрудники";
            case "users": return "Пользователи";
            default: return "Ошибка";
        }
    }
}
