package com.junit;

import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.junit.entity.User;
import com.junit.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc  
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User(1L, "swati", "swati@gmail.com");
    }

    @Test
    void testGetUser_whenUserExists() throws Exception {
        when(userService.getUserById(1L)).thenReturn(user);

        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/user/{id}", 1L)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk())
              .andExpect(jsonPath("$.id", is(1)))
              .andExpect(jsonPath("$.name", is("swati")))
              .andExpect(jsonPath("$.email", is("swati@gmail.com")));
        assertThat(result.andReturn().getResponse().getStatus(), is(200));
    }
}
