package com.learnwithifte.dynamicInsertUpdate;


import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;

import java.time.LocalDate;

@DataJpaTest
@Transactional
@Commit
public class BookTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testDynamicInsertUpdate() {
        Book book = new Book();
        book.setTitle("Test title");
        book.setAuthor("Test author");
        book.setPublishDate(LocalDate.of(2024,8,9));
        bookRepository.save(book);

        book.setAuthor("Introduction to Java");
    }
}
