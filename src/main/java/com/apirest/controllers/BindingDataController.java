package com.apirest.controllers;

import com.apirest.domains.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BindingDataController {

  @RequestMapping(value = "/byParam")
  public @ResponseBody String byParam(@RequestParam String foo) {
    return "binding by param " + foo;
  }

  @RequestMapping(value = "/byGroup")
  public @ResponseBody String byBean(User user) {
    return "binding by bean " + user;
  }

}
