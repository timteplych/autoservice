package ru.ttv.dao;

import ru.ttv.accountentities.UserPrivilege;

/**
 * Created by user1 on 03.07.2015.
 */
public interface UserPrivilegesDAO {
    public int insertUserPrivilege();
    public boolean deleteUserPrivilege();
    public UserPrivilege findUserPrivilege();
    public boolean updateUserPrivilege();
    //public RowSet selectCarsRS();
}
