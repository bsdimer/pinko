package com.dimomass.pinko.common.config;

import com.dimomass.pinko.common.repository.ContactEntryOdmRepo;
import com.dimomass.pinko.common.repository.ContactEntryRepo;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.ldap.core.LdapTemplate;

/**
 * Created by dimomass on 24.10.18.
 */
public class AbstractPinkoConfigurator {

    @Bean
    public ContactEntryRepo contactEntityOdmRepo(LdapTemplate ldapTemplate){
        return new ContactEntryOdmRepo(ldapTemplate);
    }

}
