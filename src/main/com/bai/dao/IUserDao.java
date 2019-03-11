package bai.dao;


import bai.model.User;

public interface IUserDao {

    User selectUser(long id);

}