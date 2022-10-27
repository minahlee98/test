package springTest.service;

import springTest.model.LoginInfo;
import springTest.model.UserData;

public interface UserService {
     public int Login(LoginInfo vo) throws Exception;

     void user_insert(UserData userData) throws  Exception;
}
