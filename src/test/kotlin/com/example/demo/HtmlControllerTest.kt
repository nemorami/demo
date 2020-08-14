package com.example.demo

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders

@SpringBootTest
@AutoConfigureMockMvc
class HtmlControllerTest{

    private lateinit var mockMvc: MockMvc

    @BeforeAll
    fun init() {
        mockMvc = MockMvcBuilders.standaloneSetup(HtmlController()).build()
    }
    @Test
    fun welcome_test() {
        this.mockMvc.get("/welcome") {
            accept(MediaType.APPLICATION_JSON)
        }

                .andExpect {
                    status { isOk() }
                }
                .andExpect { content { string("Welcome to Spring MVC") } }

    }

    @Test
    fun welcome_view() {
        this.mockMvc.get("/welcome-view") {accept = MediaType.parseMediaType ("application/html;charset=UTF-8")}
                .andExpect { view { name("welcome") } }
    }

    @Test
    fun welcome_model_view() {
        this.mockMvc.get("/welcome-model-view")
                .andExpect { model { attribute("name", "YuSangSun") }
                view { name("welcome_model_view") }}
    }
}

