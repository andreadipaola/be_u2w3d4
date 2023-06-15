package app.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.ANSI;

@Order(2)
@Component
public class CompositeRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		Autore autore1 = new Autore("Mario", "Rossi");
		Autore autore2 = new Autore("Luigi", "Verdi");
		Autore autore3 = new Autore("Anna", "Neri");

		List<Autore> autori = new ArrayList<>(Arrays.asList(autore1, autore2, autore3));

		Sottosezione sottosessione1 = new Sottosezione(11);
		Sottosezione sottosessione2 = new Sottosezione(13);
		Sottosezione sottosessione3 = new Sottosezione(15);

		Sottosezione sottosessione4 = new Sottosezione(15);
		Sottosezione sottosessione5 = new Sottosezione(11);
		Sottosezione sottosessione6 = new Sottosezione(13);

		Sottosezione sottosessione7 = new Sottosezione(13);
		Sottosezione sottosessione8 = new Sottosezione(15);
		Sottosezione sottosessione9 = new Sottosezione(11);

		List<Sottosezione> sottosezioni1 = new ArrayList<>(
				Arrays.asList(sottosessione1, sottosessione2, sottosessione3));
		List<Sottosezione> sottosezioni2 = new ArrayList<>(
				Arrays.asList(sottosessione4, sottosessione5, sottosessione6));
		List<Sottosezione> sottosezioni3 = new ArrayList<>(
				Arrays.asList(sottosessione7, sottosessione8, sottosessione9));

		Sezione sezione1 = new Sezione(sottosezioni1);
		Sezione sezione2 = new Sezione(sottosezioni2);
		Sezione sezione3 = new Sezione(sottosezioni3);

		List<Sezione> sezioni = new ArrayList<>(Arrays.asList(sezione1, sezione2, sezione3));
		Libro libro1 = new Libro(autori, sezioni, 42.5);

		System.out.println();
		System.out.println(ANSI.TEXT_BLACK + ANSI.BG_YELLOW + "COMPOSITE PATTERN" + ANSI.RESET);
		sottosessione1.stampa();
		sezione1.stampa();
		libro1.stampa();

	}

}
