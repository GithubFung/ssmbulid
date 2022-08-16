import com.feng.pojo.Books;
import com.feng.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 小冯 on 2022/8/16 16:00
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for(Books books : bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
