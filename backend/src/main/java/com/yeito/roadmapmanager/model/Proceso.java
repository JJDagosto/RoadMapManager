package com.yeito.roadmapmanager.model;

import java.util.ArrayList;
import java.util.List;

public class Proceso {
    private String nombre;
    private String tipo;
    private String fechaFinalizacion;
    private List<Proceso> subprocesos;
    private boolean estado;

    //Constructor proceso padre
    public Proceso(String nombre, String tipo, String fechaFinalizacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaFinalizacion = fechaFinalizacion;
        this.subprocesos = new ArrayList<Proceso>();
        this.estado = false;
    }

    //Constructor subprocesos
    public Proceso(String nombre, String tipo){
        this(nombre,tipo,null);
    }


    public void addSubproceso(Proceso subproceso){
        this.subprocesos.add(subproceso);
    }

    public void toggleEstado(){
        estado = !estado;
    }

    public List<Proceso> getSubprocesos() {
        return subprocesos;
    }


    public String getNombre() {
        return nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
