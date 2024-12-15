package com.example.bankvtb.dto;

import com.example.bankvtb.model.ClientInfo;
import com.example.bankvtb.model.LoanDecision;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestOnCreditDto {
    private Long id;
    private ClientInfo clientInfo;
    private LoanDecision loanDecision;
}
