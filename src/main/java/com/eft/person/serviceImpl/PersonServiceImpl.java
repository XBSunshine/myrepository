package com.eft.person.serviceImpl;

import com.eft.person.dao.PersonDao;
import com.eft.person.domain.Person;
import com.eft.person.service.PersonService;
import com.eft.person.utils.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void createPerson(Person person) {
        personDao.createPerson(person);
    }

    @Override
    public PageBean<Person> findPersonList(Integer currentPage, Integer pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);

        List<Person> persons = personDao.findPersonList();        //全部商品
        int countNums = personDao.countPerson();            //总记录数
        PageBean<Person> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(persons);
        return pageData;
    }

    @Override
    public void modifyPerson(Person person) {
        personDao.modifyPerson(person);
    }

    @Override
    public void deletePerson(Integer id) {
        personDao.deletePerson(id);
    }

    @Override
    public Person findPerson(Integer id) {
        return personDao.findPerson(id);
    }
}
