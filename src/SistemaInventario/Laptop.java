package SistemaInventario;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Laptop extends Equipos_de_Computo{
    private String procesador;
    private int ram;
    private double almacenamiento;
    private int bateria;
    private String tarjeta_grafica;
    private String pantalla;

    public Laptop(){}
    public Laptop(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, int bateria, String tarjeta_grafica, String pantalla) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
        this.tarjeta_grafica = tarjeta_grafica;
        this.pantalla = pantalla;
    }

    public void añadirLaptop(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, int bateria, String tarjeta_grafica, String pantalla){
        Laptop laptop = new Laptop(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, bateria, tarjeta_grafica, pantalla);
        ListaDeEquiposDeComputo.add(laptop);
    }

    public void ListarLaptop(){
        mergeSort(ListaDeEquiposDeComputo);
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Laptop) {
                Laptop laptop = (Laptop) equipo;
                System.out.println("Laptop { " + "ID: " + laptop.getId() +
                        " \nModelo: " + laptop.getModelo() +
                        " \nMarca: " + laptop.getMarca() +
                        " \nAño: " + laptop.getAno() +
                        " \nNúmero de serie: " + laptop.getSerial_number() +
                        " \nEstado: " + laptop.getEstado() +
                        " \nStock disponible: " + laptop.getStock() +
                        " \nProcesador: " + laptop.procesador +
                        " \nMemoria Ram: " + laptop.ram + " GB " +
                        " \nAlmacenamiento: " + laptop.almacenamiento + " TB " +
                        " \nTamaño de Bateria: " + laptop.bateria + " MaH" +
                        " \nTarjeta Grafica: " + laptop.tarjeta_grafica +
                        " \nPantalla: " + laptop.pantalla + "Pulgadas" +
                        "}\n");
            }

        }
    }
    public void editarlaptop(int id, String modelo,String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, int bateria, String tarjeta_grafica, String pantalla) throws NoSuchElementException {
        boolean encontrado = false;
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Laptop && equipo.getId() == id) {
                // Actualizar los campos relevantes de la laptop existente
                Laptop laptop = (Laptop) equipo;
                laptop.setModelo(modelo);
                laptop.setMarca(marca);
                laptop.setAno(ano);
                laptop.setSerial_number(serial_number);
                laptop.setEstado(estado);
                laptop.setStock(stock);
                laptop.procesador = procesador;
                laptop.ram = ram;
                laptop.almacenamiento = almacenamiento;
                laptop.bateria = bateria;
                laptop.tarjeta_grafica = tarjeta_grafica;
                laptop.pantalla = pantalla;
                encontrado = true;
                System.out.println("La laptop con ID " + id + " ha sido actualizada exitosamente.");
                break;
            }
        }
        if (!encontrado) {
            throw new NoSuchElementException("No se encontró una laptop con el ID especificado.");
        }
    }
    public void eliminarLaptop(int id) throws NoSuchElementException {
        Iterator<Equipos_de_Computo> iterador = ListaDeEquiposDeComputo.iterator();
        boolean eliminado = false;
        while (iterador.hasNext()) {
            Equipos_de_Computo equipo = iterador.next();
            if (equipo instanceof Laptop && equipo.getId() == id) {
                iterador.remove();
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            throw new NoSuchElementException("No se encontró una laptop con el ID especificado.");
        }

    }
    public Laptop buscarLaptop(int id) throws NoSuchElementException {
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Laptop && equipo.getId() == id) {
                return (Laptop) equipo;
            }
        }
        throw new NoSuchElementException("No se encontró una laptop con el ID especificado.");
    }
}
