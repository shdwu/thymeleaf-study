package com.github.shdwu.thymeleaf.business.entities;

import lombok.Data;

import java.util.Calendar;
import java.util.Set;
import java.util.LinkedHashSet;

@Data
public class Order {
	private Integer id = null;
    private Calendar date = null;
    private Customer customer = null;
    private Set<OrderLine> orderLines = new LinkedHashSet<OrderLine>();
}