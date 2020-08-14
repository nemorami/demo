package com.example.demo

import org.hamcrest.CoreMatchers.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
class RestControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun welcome_with_object() {
        mockMvc.get("/rest-with-object") {
            accept(MediaType.APPLICATION_JSON)
        }
                .andExpect { status { isOk() } }
                .andExpect { content { string(containsString("Hello World")) } }

    }

    @Test
    fun rest_name_var() {
        mockMvc.get("/rest/name/Buddy") {
            accept(MediaType.APPLICATION_JSON)
        }
                .andExpect { status { isOk() } }
                .andExpect { content { string(containsString("Hello World Buddy")) } }
    }
}
