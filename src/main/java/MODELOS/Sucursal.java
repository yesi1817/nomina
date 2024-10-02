package MODELOS;

import java.time.LocalDate;

public class Sucursal {
    private Long id;
    private String nombreSucursal;
    private String direccion;
    private String telefono;
    private String correo;
    private LocalDate fechaDeapertura;
    private Integer numeroDeEmpleados;
    private String stadoOperativo;
    private String horarioDeatencion;
    private String ombreDeGerente;

    public Sucursal() {
    }

    public Sucursal(Long id, String nombreSucursal, String direccion, String telefono, String correo, LocalDate fechaDeapertura, Integer numeroDeEmpleados, String stadoOperativo, String horarioDeatencion, String ombreDeGerente) {
        this.id = id;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaDeapertura = fechaDeapertura;
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.stadoOperativo = stadoOperativo;
        this.horarioDeatencion = horarioDeatencion;
        this.ombreDeGerente = ombreDeGerente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaDeapertura() {
        return fechaDeapertura;
    }

    public void setFechaDeapertura(LocalDate fechaDeapertura) {
        this.fechaDeapertura = fechaDeapertura;
    }

    public Integer getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public void setNumeroDeEmpleados(Integer numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public String getStadoOperativo() {
        return stadoOperativo;
    }

    public void setStadoOperativo(String stadoOperativo) {
        this.stadoOperativo = stadoOperativo;
    }

    public String getHorarioDeatencion() {
        return horarioDeatencion;
    }

    public void setHorarioDeatencion(String horarioDeatencion) {
        this.horarioDeatencion = horarioDeatencion;
    }

    public String getOmbreDeGerente() {
        return ombreDeGerente;
    }

    public void setOmbreDeGerente(String ombreDeGerente) {
        this.ombreDeGerente = ombreDeGerente;
    }
}
