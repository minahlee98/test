package springTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springTest.dao.UserDAO;
import springTest.model.LoginInfo;
import springTest.model.UserData;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDao;
    @Override
    public int Login(LoginInfo vo) throws Exception {
        return userDao.Login(vo);
    }

    public void user_insert(UserData userData) throws Exception {
         userDao.user_insert(userData);
    }
}
