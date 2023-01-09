package io.wangler.graalvm;

import io.micronaut.http.annotation.Get;

import java.util.List;

public interface Operations {
    @Get("/")
    String hello();

    @Get("/more")
    List<Person> persons();
}