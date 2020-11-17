import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author :fuwei
 * @Date:2020/11/10 16:21
 * @Version 1.0
 */
public class TestIoc01 {
    @Test
    public void test01(){
        ApplicationContext act=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) act.getBean ("userService");
        System.out.println (userService.getName ());

    }

}
