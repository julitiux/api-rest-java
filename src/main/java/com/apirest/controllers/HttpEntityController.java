package com.apirest.controllers;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;

@Controller
public class HttpEntityController {

  @RequestMapping("/something")
  public ResponseEntity<String> handle(HttpEntity<byte[]> requestEntity) throws UnsupportedEncodingException {
    String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
    byte[] requestBody = requestEntity.getBody();

    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.set("MyResponseHeader", "MyValue");
    return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
  }

  @RequestMapping(value = "/response/entity/status", method = RequestMethod.GET)
  public ResponseEntity<String> responseEntityStatusCode() {
    String string = "The ResponseEntity String with custom status code";
    return new ResponseEntity<>(string, HttpStatus.FORBIDDEN);
  }

  @RequestMapping(value = "/response/entity/headers", method = RequestMethod.GET)
  public ResponseEntity<String> responseEntityCustomHeaders() {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setContentType(MediaType.TEXT_PLAIN);
    String string = "The ResponseEntity String with custom HttpHeaders Content-Type=text/plain";
    return new ResponseEntity<String>(string, httpHeaders, HttpStatus.OK);
  }

}
