package dev.paintilya.sharknamesyouapi.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class NameDAOConfig {
    @Bean(name = "girlNameDAO")
    public NameDAO girlNameDAO() {
        return new NameDAO(new ClassPathResource("data/girl_names.csv"));
    }

    @Bean(name = "boyNameDAO")
    public NameDAO boyNameDAO() {
        return new NameDAO(new ClassPathResource("data/boy_names.csv"));
    }

    @Bean(name = "bothNameDAO")
    public NameDAO bothNameDAO() {
        return new NameDAO(new ClassPathResource("data/both_names.csv"));
    }
}
