package com.dimomass.pinko.common.repository;

import com.dimomass.pinko.common.model.ContactEntry;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;

import javax.naming.Name;
import java.util.List;
import java.util.Map;

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
        return ldapTemplate.search(query().where("(").is("person"), new ContactEntryMicrosoftAttributeMapper());
    }

    @Override
    public List<ContactEntry> findAll(String base, String filter) {

        /*LdapQuery query = query()
                .where("objectclass").is("person");
                *//*.and("givenName").is(filter.get("f")[0])
                .and("sn").is(filter.get("l")[0])
                .and("ipPhone").is(filter.get("n")[0]);*/



        return ldapTemplate.search(base, filter, new ContactEntryMicrosoftAttributeMapper());

        // return ldapTemplate.search(query, new ContactEntryMicrosoftAttributeMapper());
    }
}
