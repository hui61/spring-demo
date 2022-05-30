package demo.impl;

import demo.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("hello world");
    }
}
