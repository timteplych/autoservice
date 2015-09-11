package ru.ttv.dao;

import ru.ttv.accountentities.Customer;


import java.sql.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user1 on 03.07.2015.
 */
public class OracleCustomerDAO implements CustomerDAO{
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
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
    public Customer findCustomer(String id, Connection conn){
        String query = "SELECT ID, \n" +
                "  NAME,\n" +
                "  CREATIONDATE,\n" +
                "  BANK,\n" +
                "  AUTHOR,\n" +
                "  ADRESS,\n" +
                "  PHONES,\n" +
                "  FULLNAME,\n" +
                "  OTHERCONTACTS\n" +
                "from CUSTOMER WHERE ID = ?";
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(id));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                Customer customer = new Customer();
                customer.setName(rs.getString("NAME"));
                customer.setId(rs.getInt("ID"));
                customer.setCreationDate(rs.getDate("CREATIONDATE"));
                customer.setBank(rs.getString("BANK"));
                customer.setAuthor(rs.getInt("AUTHOR"));
                customer.setAdress(rs.getString("ADRESS"));
                customer.setPhones(rs.getString("PHONES"));
                customer.setFullName(rs.getString("FULLNAME"));
                customer.setOthercontacts(rs.getString("OTHERCONTACTS"));

                return customer;
            }else{
                return null;
            }
        }catch (SQLException ex){
            return null;
        }

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
