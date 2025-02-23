package com.katydevs.r2_d2_minidrive.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/s3")
public class S3ClientController {

    @GetMapping("listar")
    public String uploadFile() {
        return "Hello Samuca";
    }
  
}
