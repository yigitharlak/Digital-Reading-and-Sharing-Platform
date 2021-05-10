package com.readShare.Model;

public class Publisher extends User {
    private String officialName;
    private String webSite;
    private String phoneNumber;

    public Publisher(String name, String lastName, String email, String password, int id,
                     String officialName, String webSite, String phoneNumber ){

        super(name, lastName, email, password, id);
        this.officialName = officialName;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
    }

    //GET AND SET METHODS
    public void setOfficialName(String officialName){
        this.officialName = officialName;
    }

    public String getOfficialName(){
        return this.officialName;
    }

    public void setWebSite(String webSite){
        this.webSite = webSite;
    }

    public String getWebSite(){
        return this.webSite;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

}
