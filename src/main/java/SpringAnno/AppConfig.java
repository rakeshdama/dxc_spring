package SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Samsung getConfig(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getCPU(){
        return new Snapdragon();
    }
}
