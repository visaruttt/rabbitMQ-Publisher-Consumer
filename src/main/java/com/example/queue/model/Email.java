package com.example.queue.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Email implements Serializable {

	private Long id;
	private String sender;
	private String receiver;

}