package com.example.microservice_two.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Konstantin Kotov | konstantin.kotov@helmes.com 23.10.2019)
 */
@RestController
@RequestMapping("/micro2")
public class MessageController {

  @Value("${test.message.testresponse}")
  private String testResponse;

  @GetMapping("/test")
  public String testConnectionController() {
    return testResponse;
  }
}
