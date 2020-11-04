/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccunaleño;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fausto.gomez
 */
public class CarritoMejorado {

    /*Definimos una colección de productos tipo ArrayList.*/
    static ArrayList<Producto> productos = new ArrayList();

    public static void agregarProducto(Producto prod) {
        productos.add(prod);
    }

    public static int calcularDescuento(int costo) {
        int descuento = 0;
        if (costo > 700000) {
            descuento = (costo * 20) / 100;
        } else if (costo > 300000) {
            descuento = (costo * 15) / 100;
        } else if (costo > 15000) {
            descuento = (costo * 10) / 100;
        } else {
            descuento = 0;
        }
        return descuento;
    }

    public static void imprimirTirilla(String nomEmpresa, String nitEmpresa, String cliente, String campania) {
        System.out.println(nomEmpresa);
        System.out.println(campania);
        System.out.println("Nit: " + nitEmpresa);
        System.out.println("Cliente: " + cliente);
        System.out.println("Art Cant Precio");
        int costoCompra = 0;
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
            costoCompra += productos.get(i).getCostoTotalProducto();
        }
        System.out.println("Total: $" + (int)Math.ceil(costoCompra - calcularDescuento(costoCompra)));
        System.out.println("En esta compra tu descuento fue $" + calcularDescuento(costoCompra));
        System.out.println("Gracias por tu compra");
        System.out.println("---");
        productos.clear();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Se define la variable para los comandos.
        String[] comando;
        comando = sc.nextLine().split("&");
        while (Integer.parseInt(comando[0]) != 3) {
            if (comando[0].equals("1")) {
                Producto prod = new Producto(comando[1], Integer.parseInt(comando[2]), Integer.parseInt(comando[3]));
                agregarProducto(prod);
            } else if (comando[0].equals("2")) {
                imprimirTirilla("Centro Comercial Unaleño", "899.999.063", comando[1], "Compra más y Gasta Menos");
            }
            comando = sc.nextLine().split("&");
        }
    }
}
