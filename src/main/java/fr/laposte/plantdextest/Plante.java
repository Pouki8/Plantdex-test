package fr.laposte.plantdextest;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Plante {
	
	private final String id = UUID.randomUUID().toString();
	
	private String nom;
	private Ensoleillement ensoleillement;
	
}
