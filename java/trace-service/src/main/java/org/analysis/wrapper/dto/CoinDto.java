package org.analysis.wrapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CoinDto{
    private BigDecimal value;
    private String code;
    private String name;
    private Long id;
}