package com.dimomass.pinko.dir.service;

import com.dimomass.pinko.common.model.ContactEntry;
import com.dimomass.pinko.common.repository.ContactEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dimomass on 24.10.18.
 */

@Service
public class LdapPageableService {

    @Autowired
    public LdapPageableService(ContactEntryRepo contactEntryRepo) {

    }
}
