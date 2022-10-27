package springTest.controller;

import org.apache.log4j.LogManager;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springTest.model.LoginInfo;
import springTest.model.UserData;
import springTest.service.UserService;
import springTest.service.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

import static jdk.nashorn.internal.objects.NativeFunction.bind;

@Controller
public class loginController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    private Logger logger = Logger.getLogger(String.valueOf(loginController.class));

    @RequestMapping(value="/login")
    public String login(String id, String pw , HttpSession session , HttpServletResponse response) throws Exception {
      /*  System.out.println(loginInfo.getId() + loginInfo.getPw());*/
logger.info("여기는 ~ loginController : >>>>");
        String path ="";

        LoginInfo vo = new LoginInfo();
        vo.setId(id);
        vo.setPw(pw);


        int result = userServiceImpl.Login(vo);
        PrintWriter out = response.getWriter();		//alert창 띄우기 위해서 선언

        if(result == 1){
            session.setAttribute("user_info" , vo);
            logger.info("session >>> " + session.getAttribute("user_info"));

            path = "index";
        }else{
            out.println("<script> alert('아이디 또는 비밀번호가 틀립니다.');");
            out.println("history.go(-1); </script>");
            out.close();
        }
        return path;
    }
    @RequestMapping(value="/register")
    public String join(HttpServletRequest request , UserData datas) throws Exception {
        /*  System.out.println(loginInfo.getId() + loginInfo.getPw());*/
        logger.info("여기는 ~ join : >>>>");

        String birth = request.getParameter("yy") + request.getParameter("mm") + request.getParameter("dd");
        logger.info("birthdata = "+ birth);
        logger.info("name = "+ request.getParameter("name"));
        datas.setBirth(birth);
        logger.info("data = "+ datas.getBirth() + datas.getName() + " / " + datas.toString());

        userServiceImpl.user_insert(datas);

        return "index";
    }


}
