package be.woine.odin;

import be.woine.odin.example.ExampleThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OdinApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdinApplication.class, args);
	}

	/**
	 * Create a single instance of ExampleThread and start it.
	 * @return an instance of ExampleThread.
	 */
	@Bean
	public ExampleThread createAndRunThread()
	{
		ExampleThread exampleThread = new ExampleThread();
		exampleThread.start();
		return exampleThread;
	}
}
