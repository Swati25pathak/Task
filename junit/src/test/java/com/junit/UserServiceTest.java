package com.junit;
import com.junit.entity.User;
import com.junit.repository.UserRepository;
import com.junit.service.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository; 

    @InjectMocks
    private UserService userService; 

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setId(1L);
        user.setName("swati");
        user.setEmail("swati.pathak@gmail.com");
    }

    @Test
    public void testGetUserById() {
  
        when(userRepository.getById(1L)).thenReturn(user);

        User result = userService.getUserById(1L);
        System.out.println(result.toString());
        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("swati", result.getName());
        assertEquals("swati.pathak@gmail.com", result.getEmail());

        verify(userRepository, times(1)).getById(1L);
    }

}


