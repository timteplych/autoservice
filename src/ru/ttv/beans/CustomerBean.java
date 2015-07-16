package ru.ttv.beans;

import ru.ttv.dao.CustomerDAO;
import ru.ttv.dao.DAOFactory;
import ru.ttv.dao.OracleDAOFactory;

import java.sql.Connection;
import java.util.Map;

/**
 * Created by user1 on 13.07.2015.
 */
public class CustomerBean{
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer,String> getCustomerList() {
        OracleDAOFactory daoFactory = (OracleDAOFactory)DAOFactory.getDAOFactory(DAOFactory.oracle);
        Connection conn = daoFactory.createConnection();
        CustomerDAO customerDAO = daoFactory.getCustomerDAO();

        return customerDAO.getCustomerList(conn);
    }
}
