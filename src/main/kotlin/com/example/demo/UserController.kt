package com.example.demo

import org.apache.commons.logging.Log
import org.springframework.stereotype.Controller
import org.apache.commons.logging.LogFactory
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.SessionAttributes

@Controller
@SessionAttributes("USER")
class UserController {
    val logger: Log

    init {
        logger = LogFactory.getLog(UserController::class.java)
    }
    
    @GetMapping("/create-user")
    fun showCreateUserPage(model: ModelMap): String {
        model.addAttribute("user", User("001", "yusangsun", "nemorami", "j5nfants", "j5nfants"))
        model.put("USER", "yusangsun")
        return "user"
    }
    
    @PostMapping("/create-user")
    fun addUser(user: User): String {
        logger.info("user details ${user}")
        return "redirect:show-user"
    }

    @GetMapping("/show-user")
    @ResponseBody
    fun showUser(model: ModelMap): String {
        return model.get("USER") as String
    }


}