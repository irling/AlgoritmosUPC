package SistemaInventario;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class Servidor extends Equipos_de_Computo{

    private String procesador;
    private int ram;
    private double almacenamiento;
    private String tipo_instalacion;

    public Servidor(){}
    public Servidor(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, String tipo_instalacion) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipo_instalacion = tipo_instalacion;
    }

    public void añadirServidor(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, String tipo_instalacion){
        Servidor servidor = new Servidor(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, tipo_instalacion);
        ListaDeEquiposDeComputo.add(servidor);
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void setTipo_instalacion(String tipo_instalacion) {
        this.tipo_instalacion = tipo_instalacion;
    }
    public void ListarServidor(){
        System.out.println("Laptop { " + "ID: " + getId() +
                " \nModelo: " + getModelo() +
                " \nMarca: " + getMarca() +
                " \nAño: " + getAno() +
                " \nNúmero de serie: " + getSerial_number() +
                " \nEstado: " + getEstado() +
                " \nStock disponible: " + getStock() +
                " \nProcesador: " + procesador +
                " \nMemoria Ram: " + ram + " GB " +
                " \nAlmacenamiento: " + almacenamiento + " TB " +
                " \nTipo de Instalación: "+ tipo_instalacion +
                "}\n");
    }


    public void editarServidor(int id, String modelo,String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, double almacenamiento, String tipo_instalacion) throws NoSuchElementException {
        boolean encontrado = false;
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Servidor && equipo.getId() == id) {
                // Actualizar los campos relevantes de la computadora existente
                Servidor servidor = (Servidor) equipo;
                if (modelo != null) {
                    servidor.setModelo(modelo);
                }
                if (marca != null) {
                    servidor.setMarca(marca);
                }
                if (ano != -1) {
                    servidor.setAno(ano);
                }
                if (serial_number != null) {
                    servidor.setSerial_number(serial_number);
                }
                if (estado != null) {
                    servidor.setEstado(estado);
                }
                if(stock != -1) {
                    servidor.setStock(stock);
                }
                if(procesador != null) {
                    servidor.setProcesador(procesador);
                }
                if(ram != -1) {
                    servidor.setRam(ram);
                }
                if(almacenamiento != -1) {
                    servidor.setAlmacenamiento(almacenamiento);
                }
                if (tipo_instalacion != null) {
                    servidor.setTipo_instalacion(tipo_instalacion);
                }
                encontrado = true;
                System.out.println("El servidor con ID " + id + " ha sido actualizada exitosamente.");
                break;
            }
        }
        if (!encontrado) {
            throw new NoSuchElementException("No se encontró un servidor con el ID especificado.");
        }
    }
    public void eliminarServidor(int id) throws NoSuchElementException {
        Iterator<Equipos_de_Computo> iterador = ListaDeEquiposDeComputo.iterator();
        boolean eliminado = false;
        while (iterador.hasNext()) {
            Equipos_de_Computo equipo = iterador.next();
            if (equipo instanceof Servidor && equipo.getId() == id) {
                    iterador.remove();
                    eliminado = true;
                    break;
            }
        }
        if (!eliminado) {
            throw new NoSuchElementException("No se encontró un servidor con el ID especificado.");
        }
    }
}