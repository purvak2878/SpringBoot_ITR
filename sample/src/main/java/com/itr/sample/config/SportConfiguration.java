package com.itr.sample.config;

import com.itr.sample.common.Coach;
import com.itr.sample.common.FootballCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfiguration {
    @Bean
    public Coach FootCoach(){
        return new FootballCoach();
    }
}
