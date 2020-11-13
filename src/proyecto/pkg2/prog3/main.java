/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2.prog3;

import Datos.RemitenteCliente;
import Datos.ServidorCliente;
import Ventana.Vista;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {

        
        ServidorCliente server = new ServidorCliente(9001);
        Thread hilo = new Thread(server);
        hilo.start();
        Vista ventana = new Vista(server);
        ventana.setVisible(true);

    }

}
