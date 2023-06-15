package app.composite;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Libro implements Elemento {

	private List<Autore> autori;
	List<Sezione> sezioni;
	private double prezzo;

	@Override
	public void stampa() {
		System.out.println("Questo libro è formato da " + getNumeroPagineSezioni() + " pagine");
	}

	public int getNumeroPagineSezioni() {
		int numeroPagineSezioni = 0;

		for (Sezione s : sezioni) {
			numeroPagineSezioni += s.getNumeroPagineSottosezioni();
		}

		return numeroPagineSezioni;
	}

}
