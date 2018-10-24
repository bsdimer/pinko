package com.dimomass.pinko.common.repository;

import com.dimomass.pinko.common.model.ContactEntry;
import org.springframework.ldap.core.AttributesMapper;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.ldap.LdapName;

/**
 * Created by dimomass on 21.10.18.
 */
public class ContactEntryAttributeMapper implements AttributesMapper<ContactEntry> {

    @Override
    public ContactEntry mapFromAttributes(Attributes attributes) throws NamingException {
        ContactEntry contactEntry = new ContactEntry();
        NamingEnumeration attrs = attributes.getAll();
        while (attrs.hasMore()) {
            Attribute attribute = (Attribute) attrs.next();
            String id = attribute.getID();
            switch (id) {
                case "dn":
                    contactEntry.setDn(new LdapName(String.valueOf(attribute.get())));
                    break;
                case "givenName":
                    contactEntry.setGivenName(String.valueOf(attribute.get()));
                    break;
                case "sn":
                    contactEntry.setSn(String.valueOf(attribute.get()));
                    break;
                case "middleName":
                    contactEntry.setMiddleName(String.valueOf(attribute.get()));
                    break;
                case "cn":
                    contactEntry.setDisplayName(String.valueOf(attribute.get()));
                    break;
                case "telephoneNumber":
                    contactEntry.setTelephoneNumber((String) attribute.get());
                    break;
                case "mobile":
                    contactEntry.setMobile(String.valueOf(attribute.get()));
                    break;
                case "mail":
                    contactEntry.setMail(String.valueOf(attribute.get()));
                    break;
                case "title":
                    contactEntry.setTitle(String.valueOf(attribute.get()));
                    break;
                case "department":
                    contactEntry.setDepartment(String.valueOf(attribute.get()));
                    break;
                case "manager":
                    contactEntry.setManager(String.valueOf(attribute.get()));
                    break;
            }
        }
        return contactEntry;

    }
}
