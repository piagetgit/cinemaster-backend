package it.cinemaster.config;

import io.prometheus.client.hotspot.DefaultExports;
import io.prometheus.client.Counter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.prometheus.client.exporter.HTTPServer;
import java.io.IOException;

@Configuration
public class PrometheusConfig {
    @Bean
    public Counter myCounter() {
        return Counter.build()
                .name("my_counter")
                .help("Description de mon compteur")
                .register();
    }

    @Bean
    public HTTPServer prometheusExporter() throws IOException {
        // Exporte les métriques Java par défaut (mémoire, CPU, etc.)
        DefaultExports.initialize();

        // Démarre le serveur HTTP pour exposer les métriques
        return new HTTPServer(8080);
    }
}
