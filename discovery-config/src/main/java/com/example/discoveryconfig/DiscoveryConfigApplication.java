package com.example.discoveryconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DiscoveryConfigApplication {

  public static void main(String[] args) {
    SpringApplication.run(DiscoveryConfigApplication.class, args);
  }

}
