package fr.laposte.plantdextest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlantdexTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantdexTestApplication.class, args);
	}
	
	@Bean
	List<Plante> getAll(){
		return new ArrayList<Plante>();
		
	}
}
