package com.javacourse.mongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.mongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping()
	public ResponseEntity<List<User>> findAll() {
		User usuario1 = new User("1", "wagner", "wagner@email.com");
		User usuario2 = new User("2", "candido", "candido@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(usuario1, usuario2));
		return ResponseEntity.ok().body(list);
	}

}
