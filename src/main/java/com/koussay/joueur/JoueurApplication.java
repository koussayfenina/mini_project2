package com.koussay.joueur;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.koussay.joueur.entities.Joueur;
import com.koussay.joueur.service.JoueurService;

@SpringBootApplication
public class JoueurApplication implements CommandLineRunner {
	@Autowired
	JoueurService jService;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(JoueurApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Joueur.class);
	}

}
