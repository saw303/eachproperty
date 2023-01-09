package io.wangler.graalvm;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller
public class MyController implements Operations {


    private final List<Person> persons;

    public MyController(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String hello() {
        return "Hello, we've got " + this.persons.size() + " persons on board.";
    }

    @Override
    public List<Person> persons() {
        return this.persons;
    }
}