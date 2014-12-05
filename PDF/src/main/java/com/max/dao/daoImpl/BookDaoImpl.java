package com.max.dao.daoImpl;

import com.max.dao.BookDao;
import com.max.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mtsylko on 12/3/2014.
 */
//@Repository
//@Transactional
public class BookDaoImpl extends GenericDaoImpl<Book, Integer> implements BookDao {

    public BookDaoImpl() {
        super(Book.class);
    }
}
