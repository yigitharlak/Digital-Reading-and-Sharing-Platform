package com.readShare.Dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.readShare.Model.User;
import com.readShare.Model.Login;

public class UserDao {

    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    //insert the new user into database
    public int register(User user) {
        String query = "INSERT INTO user values(?,?,?,?,?,?)";
        return jdbcTemplate.update(query, new Object[] {user.getId(), user.getPassword(), user.getName(),
                user.getLastName(), user.getEmail()});
    }

    //Validate the registered User
    public User validate(Login login) {

        String query = "SELECT * FROM user WHERE email ='"+ login.getEmail()+ "'AND password='"
                +login.getPassword()+"";
        List<User> users = jdbcTemplate.query(query, new UserMapper());

        return users.size() > 0 ? users.get(0) : null;
    }

    //Get the id specified User from the database
    public User get(int index) {
        User user = new User();
        String query = "SELECT * FROM user WHERE user_id= " + user.getId();
        List <User> userList = jdbcTemplate.query(query, new UserMapper());

        return userList.size() > 0 ? userList.get(0) : null;
    }


}

//A UserMapper to get user information from database
class UserMapper implements RowMapper<User>{

    public User mapRow(ResultSet resultSet, int arg1)
            throws SQLException {

        User user = new User();
        user.setId(resultSet.getInt("user_id"));
        user.setPassword(resultSet.getString("password"));
        user.setName(resultSet.getString("name"));
        user.setLastName(resultSet.getString("last_name"));
        user.setEmail(resultSet.getString("email"));

        return user;
    }
}
