package ru.ttv.dao;

import ru.ttv.accountentities.User;

/**
 * Created by user1 on 03.07.2015.
 */
public interface UserDAO {
    public int insertUser();
    public boolean deleteUser();
    public User findUser();
    public boolean updateUser();
    //public RowSet selectCarsRS();
}
