package dev.gamg.MovieAPI.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args);

	}

	@GetMapping("/")
	public ResponseEntity<String> homePage(){
		return new ResponseEntity<>("Welcome to the Movie API!", HttpStatus.OK);
	}
}
