package com.dimomass.pinko.common.repository;

import com.dimomass.pinko.common.model.ContactEntry;
import org.springframework.ldap.core.LdapTemplate;

import java.util.List;
import java.util.Map;

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

    List<ContactEntry> findAll(String base, String filter);
}
