package com.eft.person.dao;

import com.eft.person.domain.Person;

import java.util.List;

public interface PersonDao {
    void createPerson(Person person);
    List<Person> findPersonList();
    void modifyPerson(Person person);
    void deletePerson(Integer id);
    Integer countPerson();

    Person findPerson(Integer id);
}
