package MODELOS;

import java.security.PrivateKey;
import java.time.LocalDate;

public class Beneficiario {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate fechaDenacimiento;
    private String correo;
    private String direccion;
    private Double salario;
    private LocalDate fechaDeingreso;
    private String estadoCivil;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellido, String telefono, LocalDate fechaDenacimiento, String correo, String direccion, Double salario, LocalDate fechaDeingreso, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaDenacimiento = fechaDenacimiento;
        this.correo = correo;
        this.direccion = direccion;
        this.salario = salario;
        this.fechaDeingreso = fechaDeingreso;
        this.estadoCivil = estadoCivil;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaDenacimiento() {
        return fechaDenacimiento;
    }

    public void setFechaDenacimiento(LocalDate fechaDenacimiento) {
        this.fechaDenacimiento = fechaDenacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaDeingreso() {
        return fechaDeingreso;
    }

    public void setFechaDeingreso(LocalDate fechaDeingreso) {
        this.fechaDeingreso = fechaDeingreso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}

