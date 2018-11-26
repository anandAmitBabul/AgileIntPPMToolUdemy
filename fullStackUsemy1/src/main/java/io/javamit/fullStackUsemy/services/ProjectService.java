package io.javamit.fullStackUsemy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javamit.fullStackUsemy.domain.Project;
import io.javamit.fullStackUsemy.repositories.ProjectRepositories;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepositories projectRepository;
	
	public Project saveOrUpdateProject(Project project)
	{	
		// Logic	
		return projectRepository.save(project);
	}
}
