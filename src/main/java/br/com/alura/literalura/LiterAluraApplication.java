package br.com.alura.literalura;

import br.com.alura.literalura.repository.AutorRepository;
import br.com.alura.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner
{
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private AutorRepository autorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Main app = new Main(livroRepository, autorRepository);
		app.iniciaPrograma();
	}
}