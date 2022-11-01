package com.sistema.examenes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistema.examenes.entidades.Usuario;
import com.sistema.examenes.servicios.UsuarioService;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner{

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String[] args) throws Exception {
		Usuario usuario = new Usuario();

		usuario.setNombre("Maicol");
		usuario.setApellido("Olarte");
		usuario.setUsername("maicol");
		usuario.setPassword("1234");
		usuario.setEmail("gabyolarte@gmail.com");
		usuario.setTelefono("12312431");
		usuario.setPerfil("foto.png");
	}

}
