package MODELOS;

import java.time.LocalDate;

public class Nomina {
    private Long id;
    private String nombre;
    private LocalDate fechaDepago;
    private String tipoDecontrato;
    private Integer jornadaLaboral;
    private String salarioBase;
    private String horasExtras;
    private String metodoDepago;
    private String cargoOpuesto;
    private String area;

    public Nomina() {
    }

    public Nomina(Long id, String nombre, LocalDate fechaDepago, String tipoDecontrato, Integer jornadaLaboral, String salarioBase, String horasExtras, String metodoDepago, String cargoOpuesto, String area) {
        this.id = id;
        this.nombre = nombre;
        this.fechaDepago = fechaDepago;
        this.tipoDecontrato = tipoDecontrato;
        this.jornadaLaboral = jornadaLaboral;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.metodoDepago = metodoDepago;
        this.cargoOpuesto = cargoOpuesto;
        this.area = area;
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

    public LocalDate getFechaDepago() {
        return fechaDepago;
    }

    public void setFechaDepago(LocalDate fechaDepago) {
        this.fechaDepago = fechaDepago;
    }

    public String getTipoDecontrato() {
        return tipoDecontrato;
    }

    public void setTipoDecontrato(String tipoDecontrato) {
        this.tipoDecontrato = tipoDecontrato;
    }

    public Integer getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(Integer jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(String horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getMetodoDepago() {
        return metodoDepago;
    }

    public void setMetodoDepago(String metodoDepago) {
        this.metodoDepago = metodoDepago;
    }

    public String getCargoOpuesto() {
        return cargoOpuesto;
    }

    public void setCargoOpuesto(String cargoOpuesto) {
        this.cargoOpuesto = cargoOpuesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
