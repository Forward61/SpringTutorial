package com.itheima.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by ningli on 2018/3/20.
 */
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAccount(Account account) {
        String sql = "insert into account(username,balance) value(?,?)";
        Object [] objects = new Object[]{account.getUsername(),account.getBalance()};
        int num = this.jdbcTemplate.update(sql,objects);

        return num;
    }

    @Override
    public int updateAccount(Account account) {
        String sql = "update  account set username = ?,balance=? where id = ?";
        Object [] objects = new Object[]{account.getUsername(),account.getBalance(),account.getId()};
        int num = this.jdbcTemplate.update(sql,objects);

        return num;
    }

    @Override
    public int deleteAccount(int id) {
        String sql = "DELETE FROM account WHERE id=?";
        int num = this.jdbcTemplate.update(sql,id);

        return num;
    }


}
