package ru.ttv.dao;

/**
 * Created by user1 on 30.06.2015.
 */
public abstract  class DAOFactory {
    public static final int oracle = 1;
    public static final int mysql = 2;

    public abstract CustomerDAO getCustomerDAO();
    public abstract CarDAO getCarDAO();
    public abstract CarModelsDAO getCarModelsDAO();
    public abstract UserDAO getUserDAO();
    public abstract UserPrivilegesDAO getUserPrivilegesDAO();
    public abstract StaffDAO getStaffDAO();
    public abstract ContactHistoryDAO getContactHistoryDAO();
    public abstract JobDAO getJobDAO();
    public abstract GoodsDAO getGoodsDAO();
    public abstract RepairStateDAO getRepairStateDAO();
    public abstract RepairDAO getRepairDAO();
    public abstract RepairJobDAO getRepairJobDAO();
    public abstract RepairGoodsDAO getRepairGoodsDAO();
    public abstract RepairJobEmployeeDAO getRepairJobEmployeeDAO();



    public static DAOFactory getDAOFactory(int whichFactory){
        switch (whichFactory){
            case oracle: return new OracleDAOFactory();
            case mysql: return new MySQLDAOFactory();
            default: return null;
        }
    }

}
