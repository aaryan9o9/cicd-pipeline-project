package com.aaryan.cicd_demo;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class HelloControllerTest {

    private final MockMvc mockMvc =
            MockMvcBuilders.standaloneSetup(
                    new HelloController(new GreetingService())).build();

    @Test
    void helloWithName() throws Exception {
        mockMvc.perform(get("/hello").param("name", "Aaryan"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Aaryan!"));
    }

    @Test
    void helloWithoutName() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }
}