package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageRestController {

  @Value("${message:Hello default}")
  private String message;

  @Value("${vault:Hello vault}")
  private String vault;

  @RequestMapping("/message")
  String getMessage() {
    return this.message + " " + this.vault;
  }
}