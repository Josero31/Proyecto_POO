import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI {
    private JFrame frame;
    private JButton button1, button2, button3, button4, button5;

    public MenuUI() {
        frame = new JFrame("Menu");
        button1 = new JButton("Calcular tarifa con pago mensual");
        button2 = new JButton("Calcular tarifa con KiloWatts");
        button3 = new JButton("Mostrar fuentes de información");
        button4 = new JButton("Calcular por electrodoméstico");
        button5 = new JButton("Salir");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código para calcular la tarifa con pago mensual
                System.out.println("Ingrese cuánto paga al mes por su factura de electricidad:");
                double pagoM = scan.nextDouble();
                double kwatts = calculoFS.Calcular(pagoM);
                System.out.println("Su consumo mensual de energía es de: " + df.format(kwatts) + " Kwatts");
                double precioPanel = calculoPS.Calcular(kwatts);
                double tarifaRestante = calculoPS.getFacturaRestante();

                System.out.println("El panel solar que más le conviene es de capacidad de: " + df.format(calculoPS.getCapacidad()) + " Kwatts");
                System.out.println("El precio del panel solar que más le conviene según su consumo de energía es de: Q" + df.format(precioPanel));
                System.out.println("Más un costo de instalación de Q4500.00");
                System.out.println("El excedente del consumo mensual de energía se lo tendrá que pagar a Eegsa, y sería un total de Q" + df.format(tarifaRestante));

                if (valorFuturo.ValorPresenteNeto(precioPanel, pagoM, tarifaRestante)) {
                    System.out.println("Le conviene comprar el panel solar, la compra se compensará en 8 años");
                } else {
                    System.out.println("No le conviene comprar el panel solar");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código para calcular la tarifa con KiloWatts
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código para mostrar las fuentes de información
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va el código para calcular por electrodoméstico
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setLayout(new java.awt.GridLayout(5, 1));
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuUI();
    }
}