package com.example.microservice_one.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Konstantin Kotov | konstantin.kotov@helmes.com 23.10.2019)
 */
@RestController
@RequestMapping("/micro1")
@AllArgsConstructor
@Data
public class TestController {

  private final RestTemplate restTemplate;

  @GetMapping("/test")
  public String testEndpoint() {
    return "test copleted!";
  }

  @GetMapping("/ping")
  public String pingMicro2() {
    return restTemplate.getForObject("http://micro2/micro2/test", String.class);
  }
}
