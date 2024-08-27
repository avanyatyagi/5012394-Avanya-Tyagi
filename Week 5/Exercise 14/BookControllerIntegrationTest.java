public class BookControllerIntegrationTest {
    package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.dto.BookDTO;
import com.example.BookstoreAPI.config.IntegrationTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
public class BookControllerIntegrationTest extends IntegrationTestConfig {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetBookById() throws Exception {
        mockMvc.perform(get("/books/1"))
                .andExpect(status().isOk());
    }
}

}
