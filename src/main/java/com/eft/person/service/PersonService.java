package com.eft.person.service;

import com.eft.person.domain.Person;
import com.eft.person.utils.PageBean;

public interface PersonService {
    void createPerson(Person person);

    PageBean<Person> findPersonList(Integer currentPage, Integer pageSize);

    void modifyPerson(Person person);

    void deletePerson(Integer id);

    Person findPerson(Integer id);
}
