package com.dimomass.pinko.common.repository;

import com.dimomass.pinko.common.model.ContactEntry;
import org.springframework.ldap.core.LdapTemplate;

import java.util.List;

import static org.springframework.ldap.query.LdapQueryBuilder.query;

/**
 * Created by dimomass on 24.10.18.
 */
public class ContactEntryMicrosoftRepo implements ContactEntryRepo {


    private LdapTemplate ldapTemplate;

    public ContactEntryMicrosoftRepo(LdapTemplate ldapTemplate) {
        this.ldapTemplate = ldapTemplate;
    }

    @Override
    public ContactEntry create(ContactEntry contactEntry) {
        return null;
    }

    @Override
    public ContactEntry update(ContactEntry contactEntry) {
        return null;
    }

    @Override
    public ContactEntry save(ContactEntry contactEntry) {
        return null;
    }

    @Override
    public void delete(ContactEntry contactEntry) {

    }

    @Override
    public ContactEntry findOneByDn(String dn) {
        return null;
    }

    @Override
    public List<ContactEntry> findAll() {
        return ldapTemplate.search("", "(objectClass=person)", new ContactEntryMicrosoftAttributeMapper());
    }
}
