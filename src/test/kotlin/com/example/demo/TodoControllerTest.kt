package com.example.demo

import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.skyscreamer.jsonassert.JSONAssert
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.on
import java.util.*

@SpringBootTest
@AutoConfigureMockMvc
class TodoControllerTest {
    @Autowired
    lateinit var mvc: MockMvc

    @MockBean
    lateinit var service: TodoService


    @Test
    fun retrieveTodos() {
        val mockList: List<Todo> = listOf(Todo(1, "Jack", "Learn Spring MVC", Date(), false),
        Todo(2, "Jack", "Learn Struts", Date(), false))

       `when`(service.retrieveTodos(anyString())).thenReturn(mockList)

        val result = mvc.get("/users/Jack/todos") {
            accept(MediaType.APPLICATION_JSON)
        }.andExpect { status { isOk() } }.andReturn()

        val expected = "[{id:1,user:Jack,desc:\"Learn Spring MVC\",done:false},{id:2,user:Jack,desc:\"Learn Struts\",done:false}]"

        JSONAssert.assertEquals(expected, result.response.contentAsString, false)
    }
}