package SistemaInventario;

import java.util.ArrayList;
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
    static List<Equipos_de_Computo> ListaDeEquiposDeComputo;

    //METODOS
    public Equipos_de_Computo() {
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
