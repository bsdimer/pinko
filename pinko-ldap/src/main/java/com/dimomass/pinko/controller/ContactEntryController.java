package com.dimomass.pinko.controller;

import com.dimomass.pinko.common.model.ContactEntry;
import com.dimomass.pinko.common.repository.ContactEntryOdmRepo;
import com.dimomass.pinko.common.repository.ContactEntryRepo;
import com.dimomass.pinko.common.serializer.ContactEntryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.InvalidNameException;
import java.util.List;

/**
 * Created by dimomass on 20.10.18.
 */

@RestController
@RequestMapping(value = "/contact")
public class ContactEntryController {

    private ContactEntryRepo contactEntryOdmRepo;

    @Autowired
    public ContactEntryController(ContactEntryOdmRepo contactEntryOdmRepo) {
        this.contactEntryOdmRepo = contactEntryOdmRepo;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ContactEntry save(@RequestBody ContactEntryDto contactEntryDto) throws InvalidNameException {
        return contactEntryOdmRepo.save(contactEntryDto.toContactEntry());
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestParam(value = "dn") String dn) {
        contactEntryOdmRepo.delete(contactEntryOdmRepo.findOneByDn(dn));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ContactEntry> findAll() {
        return contactEntryOdmRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findOneByDn")
    public ContactEntry findOneByDn(String dn) {
        return contactEntryOdmRepo.findOneByDn(dn);
    }
}
