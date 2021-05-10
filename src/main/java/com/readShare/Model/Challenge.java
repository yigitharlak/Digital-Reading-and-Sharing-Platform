package com.readShare.Model;

import java.util.Date;

public class Challenge {
    private int id;
    private Date challengeDate;
    private int duration;
    private User winner;
    private int participantNumber;

    // get and set methods

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Date getChallengeDate() {
        return challengeDate;
    }

    public int getDuration() {
        return duration;
    }

    public User getWinner() {
        return winner;
    }

    public int getParticipantNumber() {
        return participantNumber;
    }

    public void setChallengeDate(Date challengeDate) {
        this.challengeDate = challengeDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    public void setParticipantNumber(int participantNumber) {
        this.participantNumber = participantNumber;
    }
}
