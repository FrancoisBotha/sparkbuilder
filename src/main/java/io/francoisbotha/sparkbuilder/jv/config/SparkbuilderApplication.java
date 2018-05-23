package io.francoisbotha.sparkbuilder.jv.config;

import io.francoisbotha.sparkbuilder.sc.GreetingInScala;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SparkbuilderApplication {

    public static void main(String[] args) {

        GreetingInScala greetingInScala = new GreetingInScala();

        SpringApplication.run(SparkbuilderApplication.class, args);

        System.out.println(greetingInScala.greet());
    }
}
