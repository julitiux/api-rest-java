package com.apirest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/classMapping/*")
public class RequestMapController {

  @RequestMapping("/simpleMapping/path")
  public @ResponseBody String byPath() {
    return "mapping by path";
  }

  @RequestMapping(value = "/simpleMapping/byMethod", method = RequestMethod.GET)
  public @ResponseBody String byMethod() {
    return "mapping by path + method";
  }

  @RequestMapping(value = "/simpleMapping/byParameter", method = RequestMethod.GET, params = "foo")
  public @ResponseBody String byParameter() {
    return "mapping by path + method + parameter";
  }

  @RequestMapping(value = "/simpleMapping/byParamter", method = RequestMethod.GET, params = "!foo")
  public @ResponseBody String byParameterNegation() {
    return "mapping by path + method + parameter negation";
  }

  @RequestMapping(value = "/simpleMapping/byHeader", method = RequestMethod.GET, headers = "Accept=text/plain")
  public @ResponseBody String byHeader() {
    return "mapping by path + method + a header";
  }

  @RequestMapping(value = "/simpleMapping/notHeader", method = RequestMethod.GET, headers = "!FooHeaders")
  public @ResponseBody String byHeaderNegation() {
    return "mapping by path + method + header negation";
  }

  @RequestMapping(value = "/simpleMapping/*", method = RequestMethod.GET)
  public @ResponseBody String byRegexp() {
    return "mapping by regexp";
  }

}
