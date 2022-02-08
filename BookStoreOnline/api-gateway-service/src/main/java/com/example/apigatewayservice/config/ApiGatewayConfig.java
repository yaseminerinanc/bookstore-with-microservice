package com.example.apigatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.apigatewayservice.filters.PostFilter;
import com.example.apigatewayservice.filters.PreFilter;
import com.example.apigatewayservice.filters.RouteFilter;

import brave.sampler.Sampler;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public Sampler sampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}

