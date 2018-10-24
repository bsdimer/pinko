package com.dimomass.pinko.common.serializer;

import com.dimomass.pinko.common.model.ContactEntry;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;

/**
 * Created by dimomass on 22.10.18.
 */
public class ContactEntryDto {

    private String dn;

    private String givenName;

    private String middleName;

    private String sn;

    private String title;

    private String department;

    private String mail;

    private String manager;

    private String displayName;

    private String telephoneNumber;

    private String mobile;

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public ContactEntry toContactEntry() throws InvalidNameException {
        ContactEntry contactEntry = new ContactEntry();
        if (this.getDn() != null) contactEntry.setDn(new LdapName(this.getDn()));
        contactEntry.setManager(this.getManager());
        contactEntry.setMail(this.getMail());
        contactEntry.setDepartment(this.getDepartment());
        contactEntry.setTitle(this.title);
        contactEntry.setDisplayName(this.getDisplayName());
        contactEntry.setGivenName(this.getGivenName());
        contactEntry.setSn(this.getSn());
        contactEntry.setMiddleName(this.getMiddleName());
        contactEntry.setMobile(this.getMobile());
        contactEntry.setTelephoneNumber(this.getTelephoneNumber());
        return contactEntry;
    }
}
