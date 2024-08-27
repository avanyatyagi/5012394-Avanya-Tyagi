public class IntegrationTestConfig {
    package com.example.BookstoreAPI.config;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public abstract class IntegrationTestConfig {
}

}
