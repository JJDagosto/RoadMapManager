package com.yeito.roadmapmanager.service;
import com.yeito.roadmapmanager.model.Proceso;
import org.springframework.stereotype.Service;

@Service
public class ProcesoService {

    public Proceso crearProceso(String nombre, String tipo, String fechaFinalizacion) {
        Proceso proceso = new Proceso(nombre, tipo, fechaFinalizacion);

        switch (tipo.toLowerCase()) {
            case "reunión de inicio":
                proceso.addSubproceso(new Proceso("Definir objetivos", "subtarea"));
                proceso.addSubproceso(new Proceso("Asignar roles", "subtarea"));
                break;

            case "planificación":
                proceso.addSubproceso(new Proceso("Crear cronograma", "subtarea"));
                proceso.addSubproceso(new Proceso("Identificar riesgos", "subtarea"));
                proceso.addSubproceso(new Proceso("Definir entregables", "subtarea"));
                break;

            // Podés agregar más casos a medida que crezca el sistema
            default:
                // Sin subtareas automáticas
                break;
        }

        return proceso;
    }

}
