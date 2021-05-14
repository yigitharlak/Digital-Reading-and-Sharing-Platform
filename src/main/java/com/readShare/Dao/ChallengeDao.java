package com.readShare.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.readShare.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.readShare.Model.Challenge;

public class ChallengeDao {
    @Autowired
    DataSource datasource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    //insert the new challenge into database
    public int addChallenge(Challenge challenge) {
        String query = "INSERT INTO challenge values(?,?,?,?,?)";
        return jdbcTemplate.update(query, new Object[] {challenge.getId(), challenge.getChallengeDate(),
                challenge.getDuration(), challenge.getWinner(), challenge.getParticipantNumber()});
    }

    //Get id specified challenge
    public Challenge getBook(Challenge challenge) {

        String query = "SELECT * FROM challenge WHERE id ="+ challenge.getId();
        List<Challenge> challenges = jdbcTemplate.query(query, new ChallengeMapper());

        return challenges.size() > 0 ? challenges.get(0) : null;
    }
}

//A ChallengeMapper to get user information from database
class ChallengeMapper implements RowMapper<Challenge> {

    public Challenge mapRow(ResultSet resultSet, int arg1)
            throws SQLException {

        Challenge challenge = new Challenge();

        challenge.setId(resultSet.getInt("challenge_id"));
        challenge.setChallengeDate(resultSet.getDate("challenge_date"));
        challenge.setDuration(resultSet.getInt("duration"));
        challenge.setWinner((User)resultSet.getObject("winner"));                   // !
        challenge.setParticipantNumber(resultSet.getInt("participant_number"));

        return challenge;
    }
}