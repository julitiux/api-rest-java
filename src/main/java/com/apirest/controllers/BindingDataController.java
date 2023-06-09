package com.apirest.controllers;

import com.apirest.domains.User;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

  @RequestMapping(value = "/byPathVariable/{var}")
  public @ResponseBody String byPathVariable(@PathVariable String var) {
    return "binding by path variable " + var;
  }

  @RequestMapping(value = "/byHeader")
  public @ResponseBody String byHeader(@RequestHeader String Accept) {
    return "binding by Header " + Accept;
  }

  @RequestMapping(value = "/byCookie")
  public @ResponseBody String byCookie(@CookieValue String openId_provider) {
    return "binding by cookie " + openId_provider;
  }

  @RequestMapping(value = "/byBody")
  public @ResponseBody String byBody(@RequestBody String body) {
    return "binding by body " + body;
  }

  @RequestMapping(value = "/byEntity", method = RequestMethod.POST)
  public @ResponseBody String byEntity(HttpEntity<String> entity) {
    return "binding by entity " + entity.getBody() + " and " + entity.getHeaders();

  }

}
