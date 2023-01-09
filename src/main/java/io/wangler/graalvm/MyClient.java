package io.wangler.graalvm;

import io.micronaut.http.client.annotation.Client;

@Client("/")
public interface MyClient extends Operations {

}
