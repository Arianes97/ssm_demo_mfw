
import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import com.chixing.service.NoteService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    @Test
    public void testMybatis(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService customerService = (CustomerService) beanFactory.getBean("customerServiceImpl");
        System.out.println(customerService);
       Customer customer= customerService.getByPhone(123456l);
        System.out.println(customer);


    }
}
