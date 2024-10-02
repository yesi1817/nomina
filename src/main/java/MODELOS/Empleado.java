package MODELOS;

import java.time.LocalDate;

public class Empleado {
    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaDenacimiento;
    private String telefono;
    private String correo;
    private String ciudad;
    private String numeroDedocumento;
    private String cargo;
    private String fechaDecontratacion;
    private Double salario;
    private String ips;
    private String numeroDecuenta;
    private String numeroDehijos;
    private String estadoCivil;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, LocalDate fechaDenacimiento, String telefono, String correo, String ciudad, String numeroDedocumento, String cargo, String fechaDecontratacion, Double salario, String ips, String numeroDecuenta, String numeroDehijos, String estadoCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDenacimiento = fechaDenacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.ciudad = ciudad;
        this.numeroDedocumento = numeroDedocumento;
        this.cargo = cargo;
        this.fechaDecontratacion = fechaDecontratacion;
        this.salario = salario;
        this.ips = ips;
        this.numeroDecuenta = numeroDecuenta;
        this.numeroDehijos = numeroDehijos;
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

    public LocalDate getFechaDenacimiento() {
        return fechaDenacimiento;
    }

    public void setFechaDenacimiento(LocalDate fechaDenacimiento) {
        this.fechaDenacimiento = fechaDenacimiento;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumeroDedocumento() {
        return numeroDedocumento;
    }

    public void setNumeroDedocumento(String numeroDedocumento) {
        this.numeroDedocumento = numeroDedocumento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaDecontratacion() {
        return fechaDecontratacion;
    }

    public void setFechaDecontratacion(String fechaDecontratacion) {
        this.fechaDecontratacion = fechaDecontratacion;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getNumeroDecuenta() {
        return numeroDecuenta;
    }

    public void setNumeroDecuenta(String numeroDecuenta) {
        this.numeroDecuenta = numeroDecuenta;
    }

    public String getNumeroDehijos() {
        return numeroDehijos;
    }

    public void setNumeroDehijos(String numeroDehijos) {
        this.numeroDehijos = numeroDehijos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
