package app.composite;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sezione implements Elemento {

	List<Sottosezione> sottosezioni;

	@Override
	public void stampa() {
		System.out.println("Questa sezione è formata da " + getNumeroPagineSottosezioni() + " pagine");
	}

	public int getNumeroPagineSottosezioni() {
		int numeroPagineSottosezioni = 0;

		for (Sottosezione s : sottosezioni) {
			numeroPagineSottosezioni += s.getNumeroPagine();
		}

		return numeroPagineSottosezioni;
	}

}
