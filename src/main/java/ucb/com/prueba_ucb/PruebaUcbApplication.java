package ucb.com.prueba_ucb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.Exception;
import io.sentry.Sentry;


@SpringBootApplication
public class PruebaUcbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaUcbApplication.class, args);
		try {
			throw new Exception("This is a test.");
		} catch (Exception e) {
			Sentry.captureException(e);
		}
	}

}
