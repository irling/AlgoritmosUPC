package SistemaInventario;

public class Computadora extends Equipos_de_Computo {

    private String procesador;
    private int ram;
    private int almacenamiento;
    private String gpu;
    private int fuente;

    public Computadora(){}
    public Computadora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, String gpu, int fuente) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.gpu = gpu;
        this.fuente = fuente;
    }

    private void setFuente(int fuente) {
    }

    private void setGpu(String gpu) {
    }

    private void setAlmacenamiento(int almacenamiento) {
    }

    private void setRam(int ram) {
    }

    private void setProcesador(String procesador) {
    }

    //METODOS PARA EL CRUD

    public void añadirComputadora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, String gpu, int fuente){
        Computadora computadora = new Computadora(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, gpu, fuente);
        ListaDeEquiposDeComputo.add(computadora);
    }
    public void ListarComputadoras(){
        mergeSort(ListaDeEquiposDeComputo);
        System.out.println("Computadora { " + "ID: " + getId() +
                " \nModelo: " + getModelo() +
                " \nMarca: " + getMarca() +
                " \nAño: " + getAno() +
                " \nNúmero de serie: " + getSerial_number() +
                " \nEstado: " + getEstado() +
                " \nStock disponible: " + getStock() +
                " \nProcesador: " + procesador +
                " \nMemoria Ram: " + ram + " GB " +
                " \nAlmacenamiento: " + almacenamiento + " TB " +
                " \nTarjeta Grafica: "+ gpu +
                " \nFuente de: " + fuente + " W" +
                "} \n");
    }

    public void actualizarComputadoras(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String procesador, int ram, int almacenamiento, String gpu, int fuente) throws Exception {
        boolean encontrado = false;
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Computadora && equipo.getId() == id) {
                ListaDeEquiposDeComputo.remove(equipo);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            añadirComputadora(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, gpu, fuente);
            System.out.println("La computadora con ID " + id + " ha sido actualizada exitosamente.");
        } else {
            throw new Exception("No se encontró una computadora con el ID especificado.");
        }
    }



    public void eliminarComputadoras(int id) throws Exception {
        boolean eliminado = false;
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Computadora && equipo.getId() == id) {
                ListaDeEquiposDeComputo.remove(equipo);
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            throw new Exception("No se encontró una computadora con el ID especificado.");
        }
    }


    public Computadora buscarComputadoras(int id) throws Exception {
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Computadora && equipo.getId() == id) {
                return (Computadora) equipo;
            }
        }
        throw new Exception("No se encontró una computadora con el ID especificado.");
    }


}
