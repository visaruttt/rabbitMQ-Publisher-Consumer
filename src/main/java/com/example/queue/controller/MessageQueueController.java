package com.example.queue.controller;

import com.example.queue.api.MessageQueueApi;

import com.example.queue.model.Email;

import com.example.queue.service.MessagePublisher;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageQueueController implements MessageQueueApi {

	@Autowired
	private MessagePublisher messageSender;

	@Override
	public ResponseEntity<Email> postEmail (Email email) {
		messageSender.publishEmailToQueue(email);
		return null;
	}
}