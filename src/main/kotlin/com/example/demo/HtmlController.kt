package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

@Controller
class HtmlController {
    @GetMapping("/")
    fun blog(model: Model): String {
        model.addAttribute("title", "Blog")
        return "blog"
    }

    @RequestMapping("/welcome")
    @ResponseBody
    fun welcome(): String {
        return "Welcome to Spring MVC"
    }

    @GetMapping("/welcome-view")
    fun welcome_view(): String {
        return "welcome"
    }

    @GetMapping("/welcome-model-map")
    fun welcome_model_map(model: ModelMap): String {
        model.put("name", "XYZ")
        return "welcome-model-map"
    }

    @GetMapping("/welcome-model-view")
    fun welcome_model_view(model: ModelMap): ModelAndView {
        model.put("name", "YuSangSun")
        return ModelAndView("welcome-model-view", model)
    }
}