package service;

import dao.UserDao;
import model.User;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IService<User>{
    UserDao userDao = new UserDao();

    @Override
    public List<User> getList() throws SQLException {
        return  userDao.getList();
    }

    @Override
    public void save(User user) throws SQLException {
        userDao.insert(user);
        getList();

    }

    @Override
    public void update(int id, User user) throws SQLException {
        userDao.update(id,user);
        getList();
    }

    @Override
    public void delete(int id) throws SQLException {
        userDao.delete(id);
        getList();
    }
    public User checkLogin(String userName, String password) throws SQLException {
        for (User u:getList()) {
            if(userName.equals(u.getUserName()) && password.equals(u.getPassword())){
                return u;
            }
        }
        return null;
    }
}
