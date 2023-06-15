package app.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Sottosezione implements Elemento {

	private int numeroPagine;

	@Override
	public void stampa() {
		System.out.println("Questa sottosezione è formata da " + getNumeroPagine() + " pagine");
	}
}
