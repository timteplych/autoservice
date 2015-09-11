package ru.ttv.dao;

import ru.ttv.accountentities.Customer;

import javax.sql.RowSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by user1 on 30.06.2015.
 */
public interface CustomerDAO {
    public int insertCustomer();
    public boolean deleteCustomer();
    public Customer findCustomer(String id, Connection conn);
    public boolean updateCustomer();
    public Map<Integer,String> getCustomerList(Connection conn);
    //public RowSet selectCustomersRS();

}
