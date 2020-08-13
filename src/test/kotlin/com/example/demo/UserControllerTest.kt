package com.example.demo

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post
import org.springframework.test.web.servlet.setup.MockMvcBuilders


class UserControllerTest {
    private var mockMvc: MockMvc = MockMvcBuilders.standaloneSetup(UserController()).build()

    fun user_create_test() {
        mockMvc.post("/create-user")
                .andExpect { status { isOk() } }

    }

}