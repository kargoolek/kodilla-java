package com.kodilla.good.patterns.challenges.exercise9_2;

public class User {
    long userID;
    String name, surname, nick, address, mobileContact, emailContact;
    int NIP;
    boolean isFirmAccount;

    public User(final long userID, final String name, final String surname, final String nick, final String address, final String mobileContact, final String emailContact, final int NIP, final boolean isFirmAccount) {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.nick = nick;
        this.address = address;
        this.mobileContact = mobileContact;
        this.emailContact = emailContact;
        this.NIP = NIP;
        this.isFirmAccount = isFirmAccount;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(final long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(final String nick) {
        this.nick = nick;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getMobileContact() {
        return mobileContact;
    }

    public void setMobileContact(final String mobileContact) {
        this.mobileContact = mobileContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(final String emailContact) {
        this.emailContact = emailContact;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(final int NIP) {
        this.NIP = NIP;
    }

    public boolean isFirmAccount() {
        return isFirmAccount;
    }

    public void setFirmAccount(final boolean firmAccount) {
        isFirmAccount = firmAccount;
    }
}
