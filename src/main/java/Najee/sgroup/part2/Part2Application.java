package Najee.sgroup.part2;

import Najee.sgroup.part2.domain.TimeSeries;
import Najee.sgroup.part2.domain.Wrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Part2Application {

	private static final Logger log = LoggerFactory.getLogger(Part2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Part2Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Wrapper wrapper = restTemplate.getForObject(
					"https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=demo", Wrapper.class);
			log.info(wrapper.toString());
		};
	}

}
