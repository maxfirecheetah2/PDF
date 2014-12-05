
import com.max.dao.BookDao;
import com.max.entity.Book;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/applicationContext.xml")
public class BookDaoImplTest extends AbstractJUnit4SpringContextTests {

    final Logger logger = LoggerFactory.getLogger(BookDaoImplTest.class);
    private static Map<Integer,Book> books = new HashMap<Integer, Book>();

    @Autowired
    private BookDao bookDao;

    @BeforeClass
    public static void runBeforeClass() throws Exception {
        Book book1 = new Book("Harry Potter and Prisoner Of Askaban", "Joan Rolling", "", "", "", "", null);
        Book book2 = new Book("Harry Potter and the Chamber og Secrets", "Joan Rolling", "", "", "", "", null);
        books.put(1, book1);
        books.put(2, book2);
    }
//
//    @AfterClass
//    public static void runAfterClass() throws Exception {
//
//    }
    @Test
    public void testGetBook() throws Exception {

    }

    @Test
    public void testLoadBook() throws Exception {

    }

    @Test
    public void testSaveBook() throws Exception {
        System.out.println(bookDao);
        Book book = books.get(1);
        bookDao.save(book);
    }

    @Test
    public void testGetAllBooks() throws Exception {

    }

    @Test
    public void testUpdateBook() throws Exception {

    }

    @Test
    public void testSaveOrUpdateBook() throws Exception {

    }

    @Test
    public void testDeleteBook() throws Exception {

    }

    @Test
    public void testGetDataColumn() throws Exception {

    }
}