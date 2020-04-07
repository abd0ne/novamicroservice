package jakarta.ee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NovaConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovaConfigurationServiceApplication.class, args);
    }

}
