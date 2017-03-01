package com.github.shdwu.thymeleaf.business.entities;

import lombok.Data;
import java.util.Calendar;

@Data
public class Customer {
	private Integer id = null;
    private String name = null;
    private Calendar customerSince = null;
}