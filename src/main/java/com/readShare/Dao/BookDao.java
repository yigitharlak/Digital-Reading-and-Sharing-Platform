package com.readShare.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.readShare.Model.Book;
public class BookDao {

    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    //insert the new user into database
    public int addBook(Book book) {
        String query = "INSERT INTO book values(?,?)";
        return jdbcTemplate.update(query, new Object[] {book.getId(), book.getTitle()});
    }

    //Get id specified book
    public Book getBook(Book book) {

        String query = "SELECT * FROM book WHERE id ="+ book.getId();
        List<Book> books = jdbcTemplate.query(query, new BookMapper());

        return books.size() > 0 ? books.get(0) : null;
    }

}

//A UserMapper to get user information from database
class BookMapper implements RowMapper<Book> {

    public Book mapRow(ResultSet resultSet, int arg1)
            throws SQLException {

        Book book = new Book();
        book.setId(resultSet.getInt("book_id"));
        book.setTitle(resultSet.getString("title"));

        return book;
    }
}

