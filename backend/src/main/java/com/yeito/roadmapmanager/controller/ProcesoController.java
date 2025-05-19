package com.yeito.roadmapmanager.controller;
import com.yeito.roadmapmanager.model.Proceso;
import com.yeito.roadmapmanager.service.ProcesoService;
import com.yeito.roadmapmanager.model.ProcesoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/procesos")
@CrossOrigin(origins = "*")

public class ProcesoController {

    @Autowired
    private ProcesoService ProcesoService;

    @PostMapping("/crear")
    private Proceso crearProceso(@RequestBody ProcesoDTO datos){
        return ProcesoService.crearProceso(datos.getNombre(),datos.getTipo(),datos.getFechaFinalizacion());
    }
}
