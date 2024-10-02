package SistemaInventario;

public class Impresora extends Equipos_de_Computo {
    private String tipo_impresion;
    private String consumible;
    private int velocidad_impresion;

    public Impresora() {
    }

    public Impresora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String tipo_impresion, String consumible, int velocidad_impresion) {
        super(id, modelo, marca, ano, serial_number, estado, stock);
        this.tipo_impresion = tipo_impresion;
        this.consumible = consumible;
        this.velocidad_impresion = velocidad_impresion;
    }

    //METODOS PARA EL CRUD

    public void añadirImpresora(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String tipo_impresion, String consumible, int velocidad_impresion) {
        Impresora impresora = new Impresora(id, modelo, marca, ano, serial_number, estado, stock, tipo_impresion, consumible, velocidad_impresion);
        ListaDeEquiposDeComputo.add(impresora);
        mergeSort(ListaDeEquiposDeComputo);
    }

    public void ListarImpresora() {
        mergeSort(ListaDeEquiposDeComputo);
        System.out.println("Impresora { " + "ID: " + getId() +
                " \nModelo: " + getModelo() +
                " \nMarca: " + getMarca() +
                " \nAño: " + getAno() +
                " \nNúmero de serie: " + getSerial_number() +
                " \nEstado: " + getEstado() +
                " \nStock disponible: " + getStock() +
                " \nTipo de Impresión: " + tipo_impresion +
                " \nConsumible: " + consumible +
                " \nVelocidad de impresión: " + velocidad_impresion +
                "} \n");
    }

    public void actualizarImpresoras(int id, String modelo, String marca, int ano, String serial_number, String estado, int stock, String tipo_impresion, String consumible, int velocidad_impresion) throws Exception {
        boolean encontrado = false;
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Impresora && equipo.getId() == id) {
                ListaDeEquiposDeComputo.remove(equipo);
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            añadirImpresora(id, modelo, marca, ano, serial_number, estado, stock, tipo_impresion, consumible, velocidad_impresion);
            System.out.println("La impresora con ID " + id + " ha sido actualizada exitosamente.");
        } else {
            throw new Exception("No se encontró una impresora con el ID especificado.");
        }
    }

    // ELIMINAR ITEM'S
    public void eliminarImpresoras(int id) throws Exception {
        boolean eliminado = false;
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Impresora && equipo.getId() == id) {
                ListaDeEquiposDeComputo.remove(equipo);
                eliminado = true;
                //se ordena la lista de equipos
                mergeSort(ListaDeEquiposDeComputo);
                break;
            }
        }
        if (!eliminado) {
            throw new Exception("No se encontró una impresora con el ID especificado.");
        }
    }

    // BUSCAR ITEM´S
    public Impresora buscarImpresoras(int id) throws Exception {
        for (Equipos_de_Computo equipo : ListaDeEquiposDeComputo) {
            if (equipo instanceof Impresora && equipo.getId() == id) {
                //se ordena la lista de equipos
                mergeSort(ListaDeEquiposDeComputo);
                return (Impresora) equipo;
            }
        }
        throw new Exception("No se encontró una impresora con el ID especificado.");
    }
}

