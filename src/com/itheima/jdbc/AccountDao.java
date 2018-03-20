package com.itheima.jdbc;

/**
 * Created by ningli on 2018/3/20.
 */
public interface AccountDao {
    public int addAccount(Account account);
    public int updateAccount(Account account);
    public int deleteAccount(int  id);
}
