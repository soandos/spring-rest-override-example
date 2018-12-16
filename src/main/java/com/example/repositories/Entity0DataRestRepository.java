package com.example.repositories;

import com.example.entities.Entity0;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "entity0", collectionResourceRel = "entity0")
public interface Entity0DataRestRepository extends PagingAndSortingRepository<Entity0, Long> {

	@Override
	@RestResource(exported = false)
	public Entity0 save(Entity0 e);
}
