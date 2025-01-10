package com.pato.first_spring_app.controller;

import com.pato.first_spring_app.domain.User;
import com.pato.first_spring_app.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
  
  @Autowired
  private HelloWorldService helloWorldService;
  
//  public HelloWorldController(HelloWorldService helloWorldService) {
//    this.helloWorldService = helloWorldService;
//  }
  
  @GetMapping
  public String helloWorld() {
    return helloWorldService.helloWorld("Pato");
  }
  
  @PostMapping("/{id}")
  public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
    return "Hello world " + body.getName() + id;
  }
}
