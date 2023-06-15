package app.adapter;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Info {
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;

}
