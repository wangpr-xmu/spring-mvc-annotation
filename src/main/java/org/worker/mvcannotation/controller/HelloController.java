package org.worker.mvcannotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.worker.mvcannotation.service.HelloService;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@RestController
public class HelloController {
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name, @RequestParam("age") int age) {
        try {
            Method[] methods = this.getClass().getDeclaredMethods();
            for(Method method : methods) {
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                System.out.println(parameterAnnotations);

            }
            System.out.println(name + "," + age);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return helloService + ": hello";
    }

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
