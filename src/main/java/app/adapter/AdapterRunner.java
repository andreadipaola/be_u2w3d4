package app.adapter;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.ANSI;

@Order(1)
@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Info info = new Info("Mario", "Rossi", LocalDate.of(1977, 07, 17));
		UserData userData = new UserData();
		DataSource dataSource = new InfoAdapter(info);
		System.out.println();
		System.out.println(ANSI.TEXT_BLACK + ANSI.BG_YELLOW + "ADAPTER PATTERN" + ANSI.RESET);
		userData.getData(dataSource);
	}

}
