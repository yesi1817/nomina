package MODELOS;

import java.time.LocalDate;

public class Area {
    private Long id;
    private String nombre;
    private String jefeDearea;
    private String ubicacion;
    private Integer numeroDeEmpleados;
    private LocalDate fechaCreacion;
    private String horario;
    private String objetivos;
    private String direccion;
    private String descripcion;

    public Area() {
    }

    public Area(Long id, String nombre, String jefeDearea, String ubicacion, Integer numeroDeEmpleados, LocalDate fechaCreacion, String horario, String objetivos, String direccion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.jefeDearea = jefeDearea;
        this.ubicacion = ubicacion;
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.fechaCreacion = fechaCreacion;
        this.horario = horario;
        this.objetivos = objetivos;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefeDearea() {
        return jefeDearea;
    }

    public void setJefeDearea(String jefeDearea) {
        this.jefeDearea = jefeDearea;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public void setNumeroDeEmpleados(Integer numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
