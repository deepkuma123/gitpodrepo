package umun.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
//import umun.core.constants.RestConstants;

import java.util.TimeZone;

@SpringBootApplication(scanBasePackages = { "umun" })
@EnableJpaRepositories(basePackages = { "umun" })
@EntityScan(basePackages = { "umun" })
@EnableAsync
@EnableScheduling
public class SampleApplication {

    public static void main(String[] args) {
//        TimeZone.setDefault(TimeZone.getTimeZone(RestConstants.IST));
        SpringApplication.run(SampleApplication.class, args);
    }
}
