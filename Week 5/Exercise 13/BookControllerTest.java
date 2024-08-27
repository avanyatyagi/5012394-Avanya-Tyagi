public class BookControllerTest {
    package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.dto.BookDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookController bookController;

    @Test
    public void testGetBookById() throws Exception {
        when(bookController.getBookById(1L)).thenReturn(new BookDTO(1L, "Title", "Author", 29.99));

        mockMvc.perform(get("/books/1"))
                .andExpect(status().isOk());

        verify(bookController, times(1)).getBookById(1L);
    }
}

}
