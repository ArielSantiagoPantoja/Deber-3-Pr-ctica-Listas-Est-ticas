/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

/**
 *
 * @author DELL
 */
public class Coche {
    private final String propietario;
    private final String matricula;
    private final String marca;
    private boolean reparado;

    public Coche(String propietario, String matricula, String marca) {
        this.propietario = propietario;
        this.matricula = matricula;
        this.marca = marca;
        this.reparado = false;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public boolean isReparado() {
        return reparado;
    }

    @Override
    public String toString() {
        return "Propietario: " +
                propietario +
                ", Matrícula: " + 
                matricula +
                ", Marca: " +
                marca + 
                ", Reparado: " +
                (reparado ? "Sí" : "No");
    }
}