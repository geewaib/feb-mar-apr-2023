package com.herbalife.springbootutapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SampleController.class)
public class SampleControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RegistrationService registrationService;

    @Test
    public void sayHello() throws Exception {
        mockMvc
                .perform(get("/hello"))
                .andExpect(content().string("Hello"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void sayHelloWithName() throws Exception {
        mockMvc
                .perform(get("/hello/Sam"))
                .andExpect(content().string("Hello Sam"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void sayByeWithName() throws Exception {
        mockMvc
                .perform(post("/bye/Sam"))
                .andExpect(content().string("Bye bye Sam"))
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void registerForTraining() throws Exception {
        when(registrationService.register("sam@yahoo.com")).thenReturn(true);
        mockMvc
                .perform(post("/registration")
                        .param("email", "sam@yahoo.com"))
                .andExpect(status().is2xxSuccessful());
        verify(registrationService, times(1)).register("sam@yahoo.com");
    }
}
