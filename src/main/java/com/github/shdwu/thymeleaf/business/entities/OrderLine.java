package com.github.shdwu.thymeleaf.business.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLine {
	private Product product = null;
    private Integer amount = null;
    private BigDecimal purchasePrice = null;
}