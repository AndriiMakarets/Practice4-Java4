package com.example.mystarterclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import library.MyLibraryClass;

@SpringBootApplication
public class MyStarterClientApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyStarterClientApplication.class, args);

        MyLibraryClass myLibraryClassByClass = applicationContext.getBean(MyLibraryClass.class);
        myLibraryClassByClass.printInfo();

        MyLibraryClass myLibraryClass = (MyLibraryClass) applicationContext.getBean("myLibraryClass");
        myLibraryClass.printInfo();
    }


}
