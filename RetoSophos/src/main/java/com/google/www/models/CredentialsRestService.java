package com.google.www.models;

public class CredentialsRestService {
    private String firstname;
    private  String firstvalue;
    private String lastname;
    private String lastvalue;
    private String gendervalue;
    private String gender;
    private String email;
    private String emailvalue;
    private String requestmethod;

    public CredentialsRestService(String firstname, String firstvalue, String lastname, String lastvalue, String gendervalue, String gender, String email, String emailvalue, String requestmethod) {
        this.firstname = firstname;
        this.firstvalue = firstvalue;
        this.lastname = lastname;
        this.lastvalue = lastvalue;
        this.gendervalue = gendervalue;
        this.gender = gender;
        this.email = email;
        this.emailvalue = emailvalue;
        this.requestmethod = requestmethod;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFirstvalue() {
        return firstvalue;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLastvalue() {
        return lastvalue;
    }

    public String getGendervalue() {
        return gendervalue;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailvalue() {
        return emailvalue;
    }

    public String getRequestmethod() {
        return requestmethod;
    }
}
