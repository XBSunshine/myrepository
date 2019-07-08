package com.eft.person.controller;

import com.eft.person.domain.Person;
import com.eft.person.service.PersonService;
import com.eft.person.utils.PageBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    private Logger logger = LoggerFactory.getLogger(PersonController.class);

    @RequestMapping(value = "/createPerson", method = RequestMethod.POST)
    public String createPerson(@RequestParam("name") String name, @RequestParam("dateTime") Date date, @RequestParam("address") String address) {
        logger.info(name + "---" + date + "---" + address);
        personService.createPerson(new Person(null, name, address, date));
        return "success";
    }

    @RequestMapping(value = "/modifyPerson", method = RequestMethod.POST)
    public String modifyPerson(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("dateTime") Date date, @RequestParam("address") String address) {
        personService.modifyPerson(new Person(id, name, address, date));
        return "success";
    }

    @RequestMapping(value = "/deletePerson", method = RequestMethod.POST)
    public String deletePerson(@RequestParam("id") Integer id) {
        personService.deletePerson(id);
        return "success";
    }

    @RequestMapping(value = "/findPersonList", method = RequestMethod.POST)
    public PageBean<Person> findPersonList(Integer currentPage, Integer pageSize) {

        return personService.findPersonList(currentPage, pageSize);
    }

    @RequestMapping(value = "/findPerson", method = RequestMethod.POST)
    public Person findPerson(Integer id) {

        return personService.findPerson(id);
    }
}
