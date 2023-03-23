package it.cinemaster;

import it.cinemaster.entity.FilmImage;
import it.cinemaster.repository.FilmImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EntityScan("it.cinemaster.entity")
@EnableJpaRepositories("it.cinemaster.repository")
@ComponentScan(basePackages = "it.cinemaster")
public class CinemasterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CinemasterApplication.class, args);
	}

	@Autowired
	FilmImageRepository filmImageRepository;
	@Override
	public void run(String... args) {
		System.out.println("EXECUTING : command line runner");
		try {
			List<String> imageNames = new ArrayList<>();
			imageNames.add("die_hart.jpg");
			imageNames.add("dog_gone.jpg");
			imageNames.add("true_spirit.jpg");
			imageNames.add("unlocked.jpg");

			for(String image:imageNames){
				Path file=ResourceUtils.getFile("classpath:images/"+image).toPath();
				System.out.println(file.getFileName());
				FilmImage filmImage= new FilmImage();
				filmImage.setImageName(file.getFileName().toString());
				filmImage.setImageData(Files.readAllBytes(ResourceUtils.getFile("classpath:images/"+image).toPath()));
				filmImageRepository.save(filmImage);
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
