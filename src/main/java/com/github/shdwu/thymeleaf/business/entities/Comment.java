package com.github.shdwu.thymeleaf.business.entities;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Comment {
	private Integer id = null;
    private String text = null;
}