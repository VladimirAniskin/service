package com.example.bankvtb.controller;

import com.example.bankvtb.dto.ClientInfoDto;
import com.example.bankvtb.dto.RequestOnCreditDto;
import com.example.bankvtb.service.RequestOnCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request-on-credit")
public class RequestOnCreditController {
    private final RequestOnCreditService requestOnCreditService;
    @Autowired
    public RequestOnCreditController(RequestOnCreditService requestOnCreditService) {
        this.requestOnCreditService = requestOnCreditService;
    }
    @PostMapping
    public ResponseEntity<RequestOnCreditDto> createRequest(@RequestBody ClientInfoDto user) {
        return requestOnCreditService.createRequest(user);
    }
}
