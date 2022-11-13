package com.upc.WebFluxCasoPracticoCliente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PreguntaController {
    Logger logger = LoggerFactory.getLogger(PreguntaController.class);

    @Autowired
    PreguntaService servicio;

    @RequestMapping("/listar")
    public String listar(final Model modelo) {
        try {
            var preguntas = servicio.obtenerTodos().collectList().block();
            modelo.addAttribute("preguntas", preguntas);
        } catch (Exception e){
            logger.error("Hubo un error!", e);
        }
        return "lista";
    }
}