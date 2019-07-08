package com.eft.person;

import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonApplicationTests {

    @Test

    public void contextLoads() {
        throwException();
    }
    @SneakyThrows
    public void throwException() {
        System.out.println(111);
        FileReader fileReader = new FileReader(new File(""));

    }

}
