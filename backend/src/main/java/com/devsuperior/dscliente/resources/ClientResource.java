package com.devsuperior.dscliente.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscliente.entities.Client;


@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	
	@GetMapping
	public ResponseEntity<List <Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ana"));
		list.add(new Client(2L, "José"));
		return ResponseEntity.ok().body(list);
	}
}
