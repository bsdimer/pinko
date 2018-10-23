package com.dimomass.pinko;

import com.dimomass.pinko.model.ContactEntry;
import com.dimomass.pinko.repository.ContactEntryOdmRepo;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;

/**
 * Created by dimomass on 21.10.18.
 */
@Service
public class Importer {


    @Autowired
    ContactEntryOdmRepo contactEntryOdmRepo;

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
