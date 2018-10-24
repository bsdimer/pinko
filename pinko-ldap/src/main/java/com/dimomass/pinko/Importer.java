package com.dimomass.pinko;

import com.dimomass.pinko.common.repository.ContactEntryOdmRepo;
import com.dimomass.pinko.common.repository.ContactEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dimomass on 21.10.18.
 */
@Service
public class Importer {


    @Autowired
    ContactEntryRepo contactEntryOdmRepo;

    /*@PostConstruct
    private void init() {

        for (int i = 0; i < 100000; i++) {
            ContactEntry contactEntry = new ContactEntry();
            String randomString = RandomStringUtils.randomAlphabetic(10);
            String randomNumber = RandomStringUtils.randomAlphanumeric(10);
            contactEntry.setGivenName(randomString);
            contactEntry.setSn(randomString);
            contactEntry.setTelephoneNumber(randomNumber);
            contactEntry.setDisplayName(randomNumber + randomNumber + randomString);
            contactEntryOdmRepo.create(contactEntry);
            System.out.print(i + "\n");
        }
    }*/

}
