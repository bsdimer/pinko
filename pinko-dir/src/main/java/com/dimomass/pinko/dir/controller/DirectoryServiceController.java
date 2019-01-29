package com.dimomass.pinko.dir.controller;

import com.dimomass.pinko.common.repository.ContactEntryRepo;
import com.dimomass.pinko.dir.config.Directory;
import com.dimomass.pinko.dir.utils.FilterUtils;
import com.dimomass.pinko.dir.utils.Page;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

import static org.springframework.ui.freemarker.FreeMarkerTemplateUtils.processTemplateIntoString;


/**
 * Created by dimomass on 24.10.18.
 */

@Controller
@RequestMapping("/ccmcip")
public class DirectoryServiceController {

    private Directory directory;
    private ContactEntryRepo contactEntryRepo;
    private Configuration freemarkerConfiguration;


    @Autowired
    public DirectoryServiceController(Directory directory,
                                      ContactEntryRepo contactEntryRepo,
                                      Configuration freemarkerConfiguration) {
        this.directory = directory;
        this.contactEntryRepo = contactEntryRepo;
        this.freemarkerConfiguration = freemarkerConfiguration;
    }

    @RequestMapping(value = "/{tenant}/xmldirectory", produces = {MediaType.TEXT_XML_VALUE})
    public void getXmlDirectory(@PathVariable("tenant") String tenant, HttpServletResponse response) throws IOException, TemplateException {
        String result = processTemplateIntoString(freemarkerConfiguration.getTemplate("xmldirectory.ftl"), new HashMap<String, Object>() {{
            put("directory", directory);
        }});
        response.setContentType(MediaType.TEXT_XML_VALUE);
        ServletOutputStream outStream = response.getOutputStream();
        outStream.println(result);
        outStream.flush();
        outStream.close();
    }

    @RequestMapping(value = "/{tenant}/xmldirectoryinput", produces = {MediaType.TEXT_XML_VALUE})
    public void getXmlDirectoryInput(@PathVariable("tenant") String tenant, HttpServletResponse response) throws IOException, TemplateException {
        String result = processTemplateIntoString(freemarkerConfiguration.getTemplate("xmldirectoryinput.ftl"), new HashMap<String, Object>() {{
            put("directory", directory);
        }});
        response.setContentType(MediaType.TEXT_XML_VALUE);
        ServletOutputStream outStream = response.getOutputStream();
        outStream.println(result);
        outStream.flush();
        outStream.close();
    }

    /* ToDo: must implement multitenancy for directory configuration */
    @RequestMapping(value = "/{tenant}/xmldirectorylist", produces = {MediaType.TEXT_XML_VALUE})
    public void getXmlDirectoryList(@PathVariable("tenant") String tenant, HttpServletRequest request, HttpServletResponse response) throws IOException, TemplateException {
        String result = processTemplateIntoString(freemarkerConfiguration
                .getTemplate("xmldirectorylist.ftl"), new HashMap<String, Object>() {{
            put("directory", directory);
            // ToDo: Must implement page seter
            put("page", Page.from(contactEntryRepo.findAll(directory.getBase(),
                    FilterUtils.request(request.getParameterMap()).filter()), 1));
        }});
        response.setContentType(MediaType.TEXT_XML_VALUE);
        ServletOutputStream outStream = response.getOutputStream();
        outStream.println(result);
        outStream.flush();
        outStream.close();
    }

}
