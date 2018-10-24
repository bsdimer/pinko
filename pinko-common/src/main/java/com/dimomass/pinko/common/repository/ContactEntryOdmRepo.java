package com.dimomass.pinko.common.repository;

import com.dimomass.pinko.common.model.ContactEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dimomass on 20.10.18.
 */

public class ContactEntryOdmRepo implements ContactEntryRepo {

    private LdapTemplate ldapTemplate;

    public ContactEntryOdmRepo(LdapTemplate ldapTemplate) {
        this.ldapTemplate = ldapTemplate;
    }

    public ContactEntry create(ContactEntry contactEntry) {
        ldapTemplate.create(contactEntry);
        return contactEntry;
    }

    public ContactEntry update(ContactEntry contactEntry) {
        ldapTemplate.update(contactEntry);
        return contactEntry;
    }

    public ContactEntry save(ContactEntry contactEntry) {
        if (contactEntry.getDn() == null) return create(contactEntry);
        return update(contactEntry);
    }

    public void delete(ContactEntry contactEntry) {
        ldapTemplate.delete(contactEntry);
    }

    public ContactEntry findOneByDn(String dn) {
        return ldapTemplate.lookup(dn, new ContactEntryAttributeMapper());
    }

    public List<ContactEntry> findAll() {
        return ldapTemplate.findAll(ContactEntry.class);
    }

}
