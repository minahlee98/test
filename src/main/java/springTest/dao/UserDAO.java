package springTest.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import springTest.model.LoginInfo;
import springTest.model.UserData;

@Repository
public class UserDAO {

    @Autowired
    private SqlSessionTemplate mybatis;

    public int Login(LoginInfo vo) throws Exception{
        return mybatis.selectOne("springTest.mappers.user.userLogin",vo);
    }

    public void user_insert(UserData userData) throws Exception {
        mybatis.insert("springTest.mappers.user.insertUser",userData);
    }
}
