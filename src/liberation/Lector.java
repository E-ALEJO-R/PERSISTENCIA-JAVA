package liberation;

import java.io.Serializable;
import java.util.Scanner;

public class Lector implements Serializable {
    private String nombre;
    private int ci;

    private Reserva reserva;
    private Prestamo prestamo;

    public Lector(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public Lector(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Lector(Reserva reserva) {
        this.reserva = reserva;
    }

    public Lector(Prestamo prestamo, Reserva reserva){
        this.prestamo = prestamo;
        this.reserva = reserva;
    }

    public Lector() {
    }

    public void leer(Scanner scanner) {
        System.out.print("Ingrese el nombre del lector: ");
        this.nombre = scanner.next();
        System.out.print("Ingrese la cédula de identidad del lector: ");
        this.ci = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Lector{" +
                "nombre='" + nombre + '\'' +
                ", ci=" + ci +
                ", prestamo=" + prestamo +
                ", reserva=" + reserva +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
