package ru.ttv.dao;

import ru.ttv.accountentities.Customer;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleCustomerDAO implements CustomerDAO{
    private Statement statement = null;
    private ResultSet rs = null;
    private String query;

    @Override
    public int insertCustomer(){
        return 1;
    }
    @Override
    public boolean deleteCustomer(){
        return true;
    }
    @Override
    public Customer findCustomer(){
        return new Customer();
    }
    @Override
    public boolean updateCustomer(){
        return true;
    }

    @Override
    public Map<Integer,String> getCustomerList(Connection conn){
        Map<Integer,String> customerList = new HashMap<>();
        String query = "select id, name from customer";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()){
                customerList.put((Integer) rs.getInt("id"), rs.getString("name"));
            }
        }catch (SQLException ex){

        }

        return customerList;
    }
}
