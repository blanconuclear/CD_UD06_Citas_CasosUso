package src.main;

public class Medico {
    private String nombreMedico;
    private String especialidad;

    public Medico(String nombreMedico, String especialidad) {
        this.nombreMedico = nombreMedico;
        this.especialidad = especialidad;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [nombreMedico=" + nombreMedico + ", especialidad=" + especialidad + "]";
    }

}