package SistemaInventario;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ejecutora {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MenuInicio();
        //MenuAñadirItem();
        //MenulistarItem();
        //MenuActualizarItem();
        //MenuEliminarItem();
        //MenuBuscarItem();
    }

    //MENUS
    public static void MenuInicio(){
        int opcion;

        do {
            System.out.println("(CRUD) Ingrese lo que desee realizar: ");
            System.out.println("1.- Añadir un item al inventario");
            System.out.println("2.- Listar todos los items que hay en el inventario");
            System.out.println("3.- Actualizar un item dentro del inventario");
            System.out.println("4.- Eliminar un item dentro del inventario");
            System.out.println("5.- Buscar un item por su ID dentro del inventario");
            System.out.println("6.- Salir");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1: MenuAñadirItem();
                    break;
                case 2: MenulistarItem();
                    break;
                case 3: MenuActualizarItem();
                    break;
                case 4: MenuEliminarItem();
                    break;
                case 5: MenuBuscarItem();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }while (opcion != 6);

    }

    //AÑADIR
    public static void MenuAñadirItem(){
        int opcion;
            do {
                System.out.println("Que desea ingresar: ");
                System.out.println("1.- Computadora");
                System.out.println("2.- Laptop");
                System.out.println("3.- Impresora");
                System.out.println("4.- Servidor");
                System.out.println("5.- Regresar al menu principal");
                opcion = scanner.nextInt();

            }while (opcion<1 || opcion>5);
            switch (opcion){
                case 1: añadirComputadoraUser();
                    break;
                case 2: añadirLaptopUser();
                    break;
                case 3: añadirImpresoraUser();
                    break;
                case 4: añadirServidorUser();
                    break;
                case 5: MenuInicio();
                    break;

            }
    }
    //LISTAR
    public static void  MenulistarItem(){
        int opcion;
        do {
            System.out.println("Que desea listar: ");
            System.out.println("1.- Computadora");
            System.out.println("2.- Laptop");
            System.out.println("3.- Impresora");
            System.out.println("4.- Servidor");
            System.out.println("5.- Listar todos los items");
            System.out.println("6.- Salir del menu");
            opcion = scanner.nextInt();

        }while (opcion<1 || opcion>6);
        switch (opcion){
            case 1: ListarComputadora();
                break;
            case 2: ListarLaptops();
                break;
            case 3: ListarImpresoras();
                break;
            case 4:ListarServidores();
                break;
            case 5: ListarTodo();
                break;
            case 6: MenuInicio();
                break;
        }
    }
    //ACTUALIZAR
    public static void MenuActualizarItem(){
        int opcion;
        do {
            System.out.println("Que desea actualizar: ");
            System.out.println("1.- Computadora");
            System.out.println("2.- Laptop");
            System.out.println("3.- Impresora");
            System.out.println("4.- Servidor");
            System.out.println("5.- Regresar al menu principal");
            opcion = scanner.nextInt();

        }while (opcion<1 || opcion>5);
        switch (opcion){
            case 1: actualizarComputadoraUser();
                break;
            case 2: actualizarLaptopUser();
                break;
            case 3: actualizarImpresoraUser();
                break;
            case 4: actualizarServidorUser();
                break;
            case 5: MenuInicio();
                break;

        }
    }
    //ELIMINAR
    public static void MenuEliminarItem(){
        int opcion;
        do {
            System.out.println("Que desea eliminar: ");
            System.out.println("1.- Computadora");
            System.out.println("2.- Laptop");
            System.out.println("3.- Impresora");
            System.out.println("4.- Servidor");
            System.out.println("5.- Regresar al menu principal");
            opcion = scanner.nextInt();

        }while (opcion<1 || opcion>5);
        switch (opcion){
            case 1: eliminarComputadoraUser();
                break;
            case 2: eliminarLaptopUser();
                break;
            case 3: eliminarImpresoraUser();
                break;
            case 4: eliminarServidorUser();
                break;
            case 5: MenuInicio();
                break;
        }
    }
    //BUSCAR
    public static void MenuBuscarItem(){
        int opcion;
        do {
            System.out.println("Que desea ingresar: ");
            System.out.println("1.- Computadora");
            System.out.println("2.- Laptop");
            System.out.println("3.- Impresora");
            System.out.println("4.- Servidor");
            System.out.println("5.- Regresar al menu principal");
            opcion = scanner.nextInt();

        }while (opcion<1 || opcion>5);
        switch (opcion){
            case 1: buscarComputadoraUser();
                break;
            case 2: buscarLaptopUser();
                break;
            case 3: buscarImpresoraUser();
                break;
            case 4: buscarServidorUser();
                break;
            case 5: MenuInicio();
                break;

        }
    }

    //PRUEBA DE METODOS
    //AÑADIR ITEM'S
    public static void añadirComputadoraUser() {
        Computadora computadora = new Computadora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("Ingrese el ID de la computadora que desea añadir: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Procesador: ");
        String procesador = scanner.next();
        System.out.println("Memoria RAM: ");
        int ram = scanner.nextInt();
        System.out.println("Almacenamiento: ");
        int almacenamiento = scanner.nextInt();
        System.out.println("Tarjeta Grafica \'GPU\': ");
        String gpu = scanner.next();
        System.out.println("Fuente de: ");
        int fuente = scanner.nextInt();

        computadora.añadirComputadora(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, gpu, fuente);
    }
    public static void añadirLaptopUser() {
        Laptop laptop = new Laptop();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("Ingrese el ID de la laptop que desea añadir: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Procesador: ");
        String procesador = scanner.next();
        System.out.println("Memoria RAM: ");
        int ram = scanner.nextInt();
        System.out.println("Almacenamiento: ");
        double almacenamiento = scanner.nextDouble();
        System.out.println("Tamaño de Bateria: ");
        int bateria = scanner.nextInt();
        System.out.println("Tarjeta Gráfica: ");
        String tarjeta_grafica = scanner.next();
        System.out.println("Pantalla: ");
        String pantalla = scanner.next();

        laptop.añadirLaptop(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, bateria, tarjeta_grafica, pantalla);
    }
    public static void añadirServidorUser() {
        Servidor servidor = new Servidor();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("Ingrese el ID del servidor que desea añadir: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Procesador: ");
        String procesador = scanner.next();
        System.out.println("RAM: ");
        int ram = scanner.nextInt();
        System.out.println("ALMACENAMIENTO: ");
        int almacenamiento = scanner.nextInt();
        System.out.println("TIPO DE INSTALACION: ");
        String tipo_instalacion = scanner.next();


        servidor.añadirServidor(id, modelo, marca, ano, serial_number, estado, stock, procesador, ram, almacenamiento, tipo_instalacion);
    }
    public static void añadirImpresoraUser() {
        Impresora imp = new Impresora();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===== INGRESE LOS DATOS =====");
        System.out.println("Ingrese el ID de la impresera que desea añadir: ");
        int id = scanner.nextInt();
        System.out.println("Modelo: ");
        String modelo = scanner.next();
        System.out.println("Marca: ");
        String marca = scanner.next();
        System.out.println("Año: ");
        int ano = scanner.nextInt();
        System.out.println("SN: ");
        String serial_number = scanner.next();
        System.out.println("Estado: ");
        String estado = scanner.next();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();

        System.out.println("Tipo de Impresión: ");
        String tipo_impresion = scanner.next();
        System.out.println("Consumible: ");
        String consumible = scanner.next();
        System.out.println("Velocidad de impresión: ");
        int velocidad_impresion = scanner.nextInt();

        imp.añadirImpresora(id, modelo, marca, ano, serial_number, estado, stock, tipo_impresion, consumible, velocidad_impresion);
    }

    //LISTAR ITEM'S
    public static void ListarComputadora(){
        for (Equipos_de_Computo comp : Computadora.ListaDeEquiposDeComputo){
            comp.ListarComputadoras();
        }
    }
    public static void ListarLaptops(){
        for (Equipos_de_Computo lap : Laptop.ListaDeEquiposDeComputo){
            lap.ListarLaptop();
        }
    }
    public static void ListarServidores(){
        for (Equipos_de_Computo srv : Servidor.ListaDeEquiposDeComputo){
            srv.ListarServidor();
        }
    }
    public static void ListarImpresoras(){
        for (Equipos_de_Computo imp : Impresora.ListaDeEquiposDeComputo){
            imp.ListarImpresora();
        }
    }
    public static void ListarTodo(){
        for (Equipos_de_Computo item : Equipos_de_Computo.ListaDeEquiposDeComputo) {
            item.ListarTodo();

            if (item instanceof Computadora) {
                ListarComputadora();
            } else if (item instanceof Laptop) {
                ListarLaptops();
            } else if (item instanceof Servidor) {
                ListarServidores();
            } else if (item instanceof Impresora) {
                ListarImpresoras();
            }
        }
    }


    //ACTUALIZAR ITEM'S
    public static void actualizarComputadoraUser() {
        System.out.println("Ingrese el ID de la computadora que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            System.out.println("Ingrese el nuevo modelo:");
            String modelo = scanner.nextLine();
            System.out.println("Ingrese la nueva marca:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el nuevo año:");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo número de serie:");
            String serialNumber = scanner.nextLine();
            System.out.println("Ingrese el nuevo estado:");
            String estado = scanner.nextLine();
            System.out.println("Ingrese el nuevo stock:");
            int stock = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo procesador:");
            String procesador = scanner.nextLine();
            System.out.println("Ingrese la nueva RAM (en GB):");
            int ram = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo almacenamiento (en TB):");
            int almacenamiento = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese la nueva tarjeta gráfica:");
            String gpu = scanner.nextLine();
            System.out.println("Ingrese la nueva fuente de energía (en W):");
            int fuente = scanner.nextInt();
            scanner.nextLine();

            Computadora computadora = new Computadora();
            computadora.actualizarComputadoras(id, modelo, marca, ano, serialNumber, estado, stock, procesador, ram, almacenamiento, gpu, fuente);
            System.out.println("La computadora con ID " + id + " ha sido actualizada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al intentar actualizar la computadora: " + e.getMessage());
        }
    }
    public static void actualizarLaptopUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la laptop que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            System.out.println("Ingrese el nuevo modelo:");
            String modelo = scanner.nextLine();
            System.out.println("Ingrese la nueva marca:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el nuevo año:");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo número de serie:");
            String serialNumber = scanner.nextLine();
            System.out.println("Ingrese el nuevo estado:");
            String estado = scanner.nextLine();
            System.out.println("Ingrese el nuevo stock:");
            int stock = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo procesador:");
            String procesador = scanner.nextLine();
            System.out.println("Ingrese la nueva cantidad de RAM (en GB):");
            int ram = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo almacenamiento (en TB):");
            double almacenamiento = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo tamaño de batería (en MaH):");
            int bateria = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese la nueva tarjeta gráfica:");
            String tarjetaGrafica = scanner.nextLine();
            System.out.println("Ingrese el nuevo tipo de pantalla:");
            String pantalla = scanner.nextLine();

            Laptop laptop = new Laptop();
            laptop.editarlaptop(id, modelo, marca, ano, serialNumber, estado, stock, procesador, ram, almacenamiento, bateria, tarjetaGrafica, pantalla);
            System.out.println("La laptop con ID " + id + " ha sido actualizada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al intentar actualizar la laptop: " + e.getMessage());
        }
    }
    //Editar Servidor
    public static void actualizarServidorUser() {
        System.out.println("Ingrese el ID del servidor que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            System.out.println("Ingrese el nuevo modelo:");
            String modelo = scanner.nextLine();
            System.out.println("Ingrese la nueva marca:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el nuevo año:");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo número de serie:");
            String serialNumber = scanner.nextLine();
            System.out.println("Ingrese el nuevo estado:");
            String estado = scanner.nextLine();
            System.out.println("Ingrese el nuevo stock:");
            int stock = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo procesador:");
            String procesador = scanner.nextLine();
            System.out.println("Ingrese la nueva cantidad de RAM:");
            int ram = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo almacenamiento:");
            double almacenamiento = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo tipo de instalación:");
            String tipoInstalacion = scanner.nextLine();

            // Crear una instancia de Servidor
            Servidor servidor = new Servidor();

            // Llamar al método editarServidor en la instancia creada
            servidor.editarServidor(id, modelo, marca, ano, serialNumber, estado, stock, procesador, ram, almacenamiento, tipoInstalacion);
            System.out.println("El servidor con ID " + id + " ha sido actualizado exitosamente.");
        } catch (NoSuchElementException e) {
            System.out.println("Error al intentar actualizar el servidor: " + e.getMessage());
        }
    }
    //Actualizar impresoras
    public static void actualizarImpresoraUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la impresora que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            System.out.println("Ingrese el nuevo modelo:");
            String modelo = scanner.nextLine();
            System.out.println("Ingrese la nueva marca:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el nuevo año:");
            int ano = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo número de serie:");
            String serialNumber = scanner.nextLine();
            System.out.println("Ingrese el nuevo estado:");
            String estado = scanner.nextLine();
            System.out.println("Ingrese el nuevo stock:");
            int stock = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo tipo de impresión:");
            String tipoImpresion = scanner.nextLine();
            System.out.println("Ingrese el nuevo consumible:");
            String consumible = scanner.nextLine();
            System.out.println("Ingrese la nueva velocidad de impresión:");
            int velocidadImpresion = scanner.nextInt();
            scanner.nextLine();

            Impresora impresora = new Impresora();
            impresora.actualizarImpresoras(id, modelo, marca, ano, serialNumber, estado, stock, tipoImpresion, consumible, velocidadImpresion);
            System.out.println("La impresora con ID " + id + " ha sido actualizada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al intentar actualizar la impresora: " + e.getMessage());
        }
    }


    //ELIMINAR ITEM'S
    public static void eliminarComputadoraUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la computadora que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Computadora computadora = new Computadora();
            computadora.eliminarComputadoras(id);
            System.out.println("La computadora con ID " + id + " ha sido eliminada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al intentar eliminar la computadora: " + e.getMessage());
        }
    }
    public static void eliminarLaptopUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la laptop que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Laptop laptop = new Laptop();
            laptop.eliminarLaptop(id);
            System.out.println("La laptop con ID " + id + " ha sido eliminada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al intentar eliminar la laptop: " + e.getMessage());
        }
    }
    public static void eliminarServidorUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del servidor que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Servidor servidor = new Servidor(); // Crear una instancia de Servidor
            servidor.eliminarServidor(id); // Llamar al método eliminarServidor
            System.out.println("El servidor con ID " + id + " ha sido eliminado exitosamente.");
        } catch (NoSuchElementException e) {
            System.out.println("Error al intentar eliminar el servidor: " + e.getMessage());
        }
    }
    public static void eliminarImpresoraUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la impresora que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Impresora impresora = new Impresora();
            impresora.eliminarImpresoras(id);
            System.out.println("La impresora con ID " + id + " ha sido eliminada exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al intentar eliminar la impresora: " + e.getMessage());
        }
    }

    //BUSCAR ITEM'S
    public static void buscarComputadoraUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la computadora que desea buscar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Computadora computadora = new Computadora();
            Computadora computadoraEncontrada = computadora.buscarComputadoras(id);
            System.out.println("Computadora encontrada:");
            computadoraEncontrada.ListarComputadoras();
        } catch (Exception e) {
            System.out.println("Error al intentar buscar la computadora: " + e.getMessage());
        }
    }
    public static void buscarLaptopUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la laptop que desea buscar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Laptop laptop = new Laptop();
            Laptop laptopEncontrada = laptop.buscarLaptop(id);
            System.out.println("Laptop encontrada:");
            laptopEncontrada.ListarLaptop();
        } catch (Exception e) {
            System.out.println("Error: No se encontró la laptop con el ID especificado.");
        }
    }
    public static void buscarServidorUser() {

    }
    public static void buscarImpresoraUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID de la impresora que desea buscar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            Impresora impresora = new Impresora();
            Impresora impresoraEncontrada = impresora.buscarImpresoras(id);
            System.out.println("Impresora encontrada:");
            impresoraEncontrada.ListarImpresora();
        } catch (Exception e) {
            System.out.println("Error al intentar buscar la impresora: " + e.getMessage());
        }
    }

}
