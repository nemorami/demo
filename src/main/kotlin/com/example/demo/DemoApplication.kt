package com.example.demo

import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication

class DemoApplication

fun main(args: Array<String>) {
//	val ctx = SpringApplication.run(DemoApplication::class.java, *args)
//	for (bean_name in ctx.beanDefinitionNames) {
//		println(bean_name)
//	}
	runApplication<DemoApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}/*.beanDefinitionNames.sorted().forEach {
		println(it)
	}*/
}
