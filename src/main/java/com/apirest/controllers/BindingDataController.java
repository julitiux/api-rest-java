package com.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BindingDataController {

  @RequestMapping(value = "/param")
  public @ResponseBody String byParam(@RequestParam String foo) {
    return "binding by param " + foo;
  }

}
