package com.dimomass.pinko.common.repository;

import com.dimomass.pinko.common.model.ContactEntry;
import org.springframework.ldap.core.LdapTemplate;

import java.util.List;

/**
 * Created by dimomass on 24.10.18.
 */
public interface ContactEntryRepo {

    ContactEntry create(ContactEntry contactEntry);

    ContactEntry update(ContactEntry contactEntry);

    ContactEntry save(ContactEntry contactEntry);

    void delete(ContactEntry contactEntry);

    ContactEntry findOneByDn(String dn);

    List<ContactEntry> findAll();
}
