package com.example.queue.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.queue.model.Email;

@RestController
@RequestMapping("/api/v1")
public interface MessageQueueApi {

	@PostMapping("/queue")
	@ResponseStatus(HttpStatus.CREATED)
	ResponseEntity<Email> postEmail (@RequestBody Email email);
}