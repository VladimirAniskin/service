package com.example.bankvtb.service;

import com.example.bankvtb.dto.ClientInfoDto;
import com.example.bankvtb.dto.RequestOnCreditDto;
import org.springframework.http.ResponseEntity;

public interface RequestOnCreditService {
    ResponseEntity<RequestOnCreditDto> createRequest(ClientInfoDto info);
}
