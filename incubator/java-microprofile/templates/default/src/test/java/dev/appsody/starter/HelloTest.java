package dev.appsody.starter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

    private Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @Test
    void testHello() {
        assertThat(hello.hello()).containsExactly("Hello", "Vienna");
//        assertThat(hello.hello()).containsExactly("Hello", "World");
    }

}