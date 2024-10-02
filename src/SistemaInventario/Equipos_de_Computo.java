package SistemaInventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class  Equipos_de_Computo {

    //ATRIBUTOS
    private int id;
    private String modelo;
    private String marca;
    private int ano;
    private String serial_number;
    private String estado;
    private int stock;
    static List<Equipos_de_Computo> ListaDeEquiposDeComputo = new ArrayList<>();

    //METODOS
    public Equipos_de_Computo() {
        inicializarEquipos();
    }
    public Equipos_de_Computo(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.serial_number = serial_number;
        this.estado = estado;
        this.stock = stock;
        if (ListaDeEquiposDeComputo == null){
            ListaDeEquiposDeComputo = new ArrayList<>();
        }
    }

    private void inicializarEquipos() {
        ListaDeEquiposDeComputo.add(new Equipos_de_Computo(1, "Laptop XYZ", "Marca A", 2020, "SN001", "Nuevo", 10));
        ListaDeEquiposDeComputo.add(new Equipos_de_Computo(2, "PC ABC", "Marca B", 2019, "SN002", "Usado", 5));
        ListaDeEquiposDeComputo.add(new Equipos_de_Computo(3, "Servidor DEF", "Marca C", 2021, "SN003", "Nuevo", 2));
        ListaDeEquiposDeComputo.add(new Equipos_de_Computo(4, "Impresora GHI", "Marca D", 2022, "SN004", "Nuevo", 15));
    }


    //METODO DE ORDENAMIENTO USANDO MERGESORT
    public void mergeSort(List<Equipos_de_Computo> equipos) {
        if (equipos.size() < 2) {
            return; // La lista ya está ordenada
        }

        int mid = equipos.size() / 2;
        List<Equipos_de_Computo> left = new ArrayList<>(equipos.subList(0, mid));
        List<Equipos_de_Computo> right = new ArrayList<>(equipos.subList(mid, equipos.size()));

        mergeSort(left);
        mergeSort(right);
        merge(equipos, left, right);
    }

    private void merge(List<Equipos_de_Computo> equipos, List<Equipos_de_Computo> left, List<Equipos_de_Computo> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getId() <= right.get(j).getId()) {
                equipos.set(k++, left.get(i++));
            } else {
                equipos.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            equipos.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            equipos.set(k++, right.get(j++));


        }
    }

    // GETTER'S
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public String getEstado() {
        return estado;
    }

    public int getStock() {
        return stock;
    }

    public void ListarComputadoras() {
    }

    public void ListarLaptop() {
    }

    public void ListarServidor() {
    }

    public void ListarImpresora() {
    }

    public void ListarTodo(){
    }

    protected void eliminarComputadora(int id) {
    }

    protected void setModelo(String modelo) {
    }

    protected void setMarca(String marca) {
    }

    protected void setAno(int ano) {
    }

    protected void setSerial_number(String serialNumber) {
    }

    protected void setEstado(String estado) {
    }

    protected void setStock(int stock) {
    }
}
