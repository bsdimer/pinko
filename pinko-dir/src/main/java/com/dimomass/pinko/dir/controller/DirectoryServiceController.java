package com.dimomass.pinko.dir.controller;

import com.dimomass.pinko.common.repository.ContactEntryRepo;
import com.dimomass.pinko.dir.config.Directory;
import com.dimomass.pinko.dir.utils.Page;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dimomass on 24.10.18.
 */

@Controller
@RequestMapping("/ccmip")
public class DirectoryServiceController {


    private Directory directory;
    private ContactEntryRepo contactEntryRepo;

    @Autowired
    public DirectoryServiceController(Directory directory, ContactEntryRepo contactEntryRepo) {
        this.directory = directory;
        this.contactEntryRepo = contactEntryRepo;
    }

    @RequestMapping(value = "/xmldirectory.ftl", produces = "application/xml")
    public String getXmlDirectory(Model model) {
        model.addAttribute("directory", directory);
        return "xmldirectory";
    }

    @RequestMapping(value = "/xmldirectoryinput.ftl", produces = "application/xml")
    public String getXmlDirectoryInput(Model model) {
        model.addAttribute("directory", directory);
        return "xmldirectoryinput";
    }

    @RequestMapping(value = "/xmldirectorylist.ftl", produces = "application/xml")
    public String getXmlDirectoryList(Model model,
                                      HttpServletRequest request) {
        model.addAttribute("directory", directory);
        model.addAttribute("page", Page.from(contactEntryRepo.findAll(), 1));
        return "xmldirectorylist";
    }

}
