package ru.ttv.dao;

import ru.ttv.accountentities.Customer;

/**
 * Created by user1 on 03.07.2015.
 */
public class MySQLCustomerDAO implements CustomerDAO {
    @Override
    public int insertCustomer() {
        return 1;
    }

    @Override
    public boolean deleteCustomer() {
        return true;
    }

    @Override
    public Customer findCustomer() {
        return new Customer();
    }

    @Override
    public boolean updateCustomer() {
        return true;
    }
}
