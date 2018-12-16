package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.Entity0;
import com.example.repositories.Entity0DataRestRepository;

@RepositoryRestController
public class Entity0Controller {
	@Autowired
	Entity0DataRestRepository repo;
	
	@PostMapping(path="/entity0")
	public @ResponseBody Resource<Entity0> createEntity0(Entity0 e)
	{
		e.setName("I have been changed");
		return new Resource<>(repo.save(e));
	}
}
