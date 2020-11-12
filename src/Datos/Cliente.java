/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Cliente implements Runnable {

    private int puerto;
    private String mensaje;

    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;

    }

    public Cliente() {
    }

    @Override
    public void run() {
        final String HOST = "127.0.0.1";

        DataOutputStream out;

        try {
            Socket sk = new Socket(HOST, puerto);
            out = new DataOutputStream(sk.getOutputStream());

            out.writeUTF(mensaje);
            sk.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void enviarMensaje(String host, int port, String mensaje) {

        try {
            Socket socket = new Socket(host, port);
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            output.writeUTF(mensaje);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
