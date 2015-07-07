package ru.ttv.dao;

import ru.ttv.accountentities.Customer;

import javax.sql.RowSet;

/**
 * Created by user1 on 30.06.2015.
 */
public interface CustomerDAO {
    public int insertCustomer();
    public boolean deleteCustomer();
    public Customer findCustomer();
    public boolean updateCustomer();
    //public RowSet selectCustomersRS();

}
