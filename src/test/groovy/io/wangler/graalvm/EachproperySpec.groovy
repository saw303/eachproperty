package io.wangler.graalvm

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import jakarta.inject.Inject

@MicronautTest
class EachproperySpec extends Specification {

    @Inject
    MyClient client

    void 'test it works'() {
        expect:
        client.hello() == "Hello, we've got 2 persons on board."

        and:
        client.persons()*.name.sort() == ['Peter', 'Sarah']
    }

}
