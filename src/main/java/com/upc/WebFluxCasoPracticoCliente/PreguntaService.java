package com.upc.WebFluxCasoPracticoCliente;

import com.upc.WebFluxCasoPracticoCliente.dominio.Pregunta;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class PreguntaService {
    public Flux<Pregunta> obtenerTodos() {
        var webClient = WebClient.create("http://localhost:8080/api/preguntas/obtenerpreguntas/5");
        Flux<Pregunta> pregunta = webClient.get().retrieve().bodyToFlux(Pregunta.class);
        Flux<Pregunta> pregunta2 = webClient.get().retrieve().bodyToFlux(Pregunta.class);
        Flux<Pregunta> pregunta3 = webClient.get().retrieve().bodyToFlux(Pregunta.class);

        var preguntas = Flux.merge(pregunta, pregunta2, pregunta3);
        return preguntas;
    }
}