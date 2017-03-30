package com.inspiry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class Provider implements CommandLineRunner{
    public static void main( String[] args ) {
        SpringApplication.run(Provider.class, args);
        System.out.println( "[demo2-provider] Hello World!" );
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("service[demo2-provider] started");
    }

//    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
//        context.start();
//
//        System.in.read();
//    }
}
