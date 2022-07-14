package com.kodehive.technob11.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
public class EmailModel {
	
	private int id;
	private String message;
	private List<String> to;
	private List<String> cc;
	private String subject;
}
