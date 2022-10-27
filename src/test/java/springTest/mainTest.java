package springTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.logging.Logger;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/*-context.xml"})
public class mainTest {
/*    @Autowired
    private DataSource ds;

    @Test
    public void testConnection() {
        try (Connection con = ds.getConnection()) {
            System.out.println(("DB 연결 성공 : " + con));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    private Logger logger = Logger.getLogger(String.valueOf(mainTest.class));
    @Test
    public void userLogger(){
    logger.info("INFO121");
    logger.warning("warmming");
    }
}
