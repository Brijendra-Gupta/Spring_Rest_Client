package dev.brijendra.rest_client.client;

import org.springframework.context.annotation.Configuration;
import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(basePackages = "dev.brijendra.rest_client.client", types = jsonplaceholderClient.class, group = "internet-client")
public class HttpClientsConfig {
}
