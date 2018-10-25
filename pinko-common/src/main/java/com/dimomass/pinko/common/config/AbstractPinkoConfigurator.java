package com.dimomass.pinko.common.config;

import com.dimomass.pinko.common.repository.ContactEntryMicrosoftRepo;
import com.dimomass.pinko.common.repository.ContactEntryOdmRepo;
import com.dimomass.pinko.common.repository.ContactEntryRepo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.ldap.core.LdapTemplate;

/**
 * Created by dimomass on 24.10.18.
 */
public class AbstractPinkoConfigurator {

    @Value("${directory.type:openldap}")
    String directoryType;

    @Bean
    public ContactEntryRepo contactEntityOdmRepo(LdapTemplate ldapTemplate){
        if (directoryType.equals("microsoft")) return new ContactEntryMicrosoftRepo(ldapTemplate);
        return new ContactEntryOdmRepo(ldapTemplate);
    }

}
