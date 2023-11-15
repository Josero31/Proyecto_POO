import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuUI {
    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            CalculoFS calculoFS = new CalculoFS();
            CalculoKW calculoKW = new CalculoKW();
            CalculoPS calculoPS = new CalculoPS();
            ValorFuturo valorFuturo = new ValorFuturo();
            List<Electrodomestico> electrodomesticos = new ArrayList<>();

        System.out.println("Bienvenido\n");
        System.out.println("Opciones");
        System.out.println("1. Iniciar Sesión");
        System.out.println("2. Salir");

        String opcion = scan.nextLine();

            if (opcion.equals("1")){
                boolean isLoggedIn = false;
                GestionUsuarios gestionUsuarios = new GestionUsuarios();

                    while(!isLoggedIn){
                        System.out.println("Ingrese su nombre de usuario");
                        String username = scan.nextLine();
                        System.out.println("Ingrese su contraseña");
                        String password = scan.nextLine();

                        if (gestionUsuarios.verificarCredenciales(username, password)){
                            System.out.println("Incio de sesión exitoso\n");
                            isLoggedIn = true;

                            System.out.println("Bienvenido!\n");
                            System.out.println("Opciones:");
                            System.out.println("1. Calcular tarifa con pago mensual");
                            System.out.println("2. Calcular tarifa con KiloWatts");
                            System.out.println("3. Mostrar fuentes de información");
                            System.out.println("4. Calcular por electrodoméstico");
                            System.out.println("5. Salir");

                            opcion = scan.nextLine();
                        }else{
                            System.out.println("Credenciales incorrectas. Intente nuevamente");
                        }

                    }
            }


           
            if (opcion.equals("1")) {
                System.out.println("Seleccione su proveedor de luz\n");
                System.out.println("1. EGGSA");
                System.out.println("2. DEOCSA");
                System.out.println("3. DEORSA");
            
                String proveedor = scan.nextLine();
            
                switch (proveedor) {
                    case "1":
                        System.out.println("Ingrese cuánto paga al mes por su factura de electricidad:");
                        double pagoM = scan.nextDouble();
                        double kwatts = calculoFS.CalcularEGGSA(pagoM);
                        System.out.println("Su consumo mensual de energía es de: " + df.format(kwatts) + " Kwatts");
                        double precioPanel = calculoPS.Calcular(kwatts);
                        double tarifaRestante = calculoPS.getFacturaRestante();
            
                        System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                        System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                        System.out.println("Más un costo de instalación de Q4500.00");
                        System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a su compañía de electricidad acutal, y sería un total de Q" + df.format(tarifaRestante));
            
                        if (valorFuturo.ValorPresenteNeto(precioPanel, pagoM, tarifaRestante)) {
                            System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                        } else {
                            System.out.println("No le conviene comprar el panel solar");
                        }
                        break;
                    case "2":
                        System.out.println("Ingrese cuánto paga al mes por su factura de electricidad:");
                         pagoM = scan.nextDouble();
                         kwatts = calculoFS.CalcularDEOCSA(pagoM);
                        System.out.println("Su consumo mensual de energía es de: " + df.format(kwatts) + " Kwatts");
                         precioPanel = calculoPS.Calcular(kwatts);
                         tarifaRestante = calculoPS.getFacturaRestante();
            
                        System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                        System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                        System.out.println("Más un costo de instalación de Q4500.00");
                        System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a su compañía de electricidad actual, y sería un total de Q" + df.format(tarifaRestante));
            
                        if (valorFuturo.ValorPresenteNeto(precioPanel, pagoM, tarifaRestante)) {
                            System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                        } else {
                            System.out.println("No le conviene comprar el panel solar");
                        }
                        break;
                    default:
                        System.out.println("Invalid provider option");
                        break;
                        case "3":
                        System.out.println("Ingrese cuánto paga al mes por su factura de electricidad:");
                         pagoM = scan.nextDouble();
                         kwatts = calculoFS.CalcularDEORSA(pagoM);
                        System.out.println("Su consumo mensual de energía es de: " + df.format(kwatts) + " Kwatts");
                     precioPanel = calculoPS.Calcular(kwatts);
                         tarifaRestante = calculoPS.getFacturaRestante();
            
                        System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                        System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                        System.out.println("Más un costo de instalación de Q4500.00");
                        System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a su compañía de electricidad actual, y sería un total de Q" + df.format(tarifaRestante));
            
                        if (valorFuturo.ValorPresenteNeto(precioPanel, pagoM, tarifaRestante)) {
                            System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                        } else {
                            System.out.println("No le conviene comprar el panel solar");
                        }
                        break;
                }
            }
                    
            
    
            
            else if (opcion.equals("2")) {
                 System.out.println("Seleccione su proveedor de luz\n");
                System.out.println("1. EGGSA");
                System.out.println("2. DEOCSA");
                System.out.println("3. DEORSA");
            
                String proveedor = scan.nextLine();
                switch (proveedor) { 
                    case "1":
                        System.out.println("Ingrese cuántos KiloWatts consume al mes:");
                double kwatts = scan.nextDouble();
                double tarifa = calculoKW.CalcularEGGSA(kwatts);

                System.out.println("Su tarifa actual es de: Q" + df.format(tarifa));
                double precioPanel = calculoPS.Calcular(kwatts);
                double tarifaRestante = calculoPS.getFacturaRestante();

                System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                System.out.println("Más un costo de instalación de Q4500.00");
                System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a su compañia de electricidad actual, y sería un total de Q" + df.format(tarifaRestante));

                if (valorFuturo.ValorPresenteNeto(precioPanel, tarifa, tarifaRestante)) {
                    System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                } else {
                    System.out.println("No le conviene comprar el panel solar");
                }

                    case "2":
                        System.out.println("Ingrese cuántos KiloWatts consume al mes:");
                 kwatts = scan.nextDouble();
                 tarifa = calculoKW.CalcularDEOCSA(kwatts);

                System.out.println("Su tarifa actual es de: Q" + df.format(tarifa));
                 precioPanel = calculoPS.Calcular(kwatts);
                 tarifaRestante = calculoPS.getFacturaRestante();

                System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                System.out.println("Más un costo de instalación de Q4500.00");
                System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a su compañía de electricidad actual, y sería un total de Q" + df.format(tarifaRestante));

                if (valorFuturo.ValorPresenteNeto(precioPanel, tarifa, tarifaRestante)) {
                    System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                } else {
                    System.out.println("No le conviene comprar el panel solar");
                }

                        break;
                    default:
                        System.out.println("Invalid provider option");
                        break;
                        case "3":
                        System.out.println("Ingrese cuántos KiloWatts consume al mes:");
                 kwatts = scan.nextDouble();
                 tarifa = calculoKW.CalcularDEORSA(kwatts);

                System.out.println("Su tarifa actual es de: Q" + df.format(tarifa));
                 precioPanel = calculoPS.Calcular(kwatts);
                 tarifaRestante = calculoPS.getFacturaRestante();

                System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                System.out.println("Más un costo de instalación de Q4500.00");
                System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a su compañía de electricidad actual, y sería un total de Q" + df.format(tarifaRestante));

                if (valorFuturo.ValorPresenteNeto(precioPanel, tarifa, tarifaRestante)) {
                    System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                } else {
                    System.out.println("No le conviene comprar el panel solar");
                }

                        break;
                }
            

            } else if (opcion.equals("3")) {
                System.out.println("Información de tarifas y precios obtenidos de:");
                System.out.println("Tarifas: Ministerio de Energía y Minas");
                System.out.println("Precios: Aisa (Solar)");
            
            } else if (opcion.equals("4")) {
                while (true) {
                    System.out.println("Ingrese el electrodoméstico que desea agregar:");
                    String nombre = scan.next();
                    System.out.println("Ingrese el consumo energético del electrodoméstico:");
                    double consumoEnergetico = scan.nextDouble();
                    System.out.println("Ingrese la cantidad de electrodomésticos:");
                    int cantidad = scan.nextInt();

                    Electrodomestico electrodomestico = new Electrodomestico(nombre, consumoEnergetico, cantidad);
                    electrodomesticos.add(electrodomestico);
                    System.out.println("Electrodoméstico agregado!");

                    System.out.println("Lista de electrodomésticos agregados:");
                    for (Electrodomestico elec : electrodomesticos) {
                        System.out.println(elec);
                    }

                    System.out.println("¿Desea agregar otro electrodoméstico? (s/n)");
                    String respuesta = scan.next();
                    if (respuesta.equals("n")) {
                        double consumoTotal = electrodomesticos.stream().mapToDouble(Electrodomestico::calcularConsumoMensual).sum();
                        System.out.println("Consumo total: " + df.format(consumoTotal) + " kilowatts");
                        break;
                    }
                }
            }
        }

    }
}