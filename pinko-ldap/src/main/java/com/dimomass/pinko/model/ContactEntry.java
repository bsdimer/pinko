package com.dimomass.pinko.model;

import com.dimomass.pinko.serializer.LdapNameSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.DnAttribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;

/**
 * Created by dimomass on 19.10.18.
 */

@Entry(objectClasses = { "inetOrgPerson", "organizationalPerson", "person", "top" }, base = "ou=contacts")
public class ContactEntry {

    @Id
    @JsonSerialize(using = LdapNameSerializer.class)
    private Name dn;

    @Attribute(name="givenName")
    String givenName;

    @Attribute(name="initials")
    String middleName;

    @Attribute(name="sn")
    String sn;

    @Attribute(name="title")
    String title;

    @Attribute(name="department")
    String department;

    @Attribute(name="mail")
    String mail;

    @Attribute(name="manager")
    String manager;

    @Attribute(name="cn")
    @DnAttribute(value = "cn", index = 0)
    String displayName;

    @Attribute(name="telephoneNumber")
    String telephoneNumber;

    @Attribute(name="mobile")
    String mobile;

    public Name getDn() {
        return dn;
    }

    public void setDn(Name dn) {
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
