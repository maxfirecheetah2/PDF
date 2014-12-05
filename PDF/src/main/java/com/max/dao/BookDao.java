package com.max.dao;

import com.max.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by mtsylko on 12/3/2014.
 */
@Repository
public interface BookDao extends GenericDao<Book, Integer>  {
}
