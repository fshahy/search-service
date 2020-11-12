package fshahy.delifery.searchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DeliFerySearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliFerySearchServiceApplication.class, args);
	}

}
