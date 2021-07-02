package santos.karolina.filmes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import santos.karolina.filmes.services.DBService;

import java.text.ParseException;

@Configuration
public class TestConfig {

    @Autowired
    private DBService dbService;

    @Bean
    public boolean criarBanco() throws ParseException {
        dbService.criarbanco();
        return true;
    }
}
