package io.javamit.fullStackUsemy.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.javamit.fullStackUsemy.domain.Project;

@Repository
public interface ProjectRepositories extends CrudRepository<Project, Long> {
	

}
