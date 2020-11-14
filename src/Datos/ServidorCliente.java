/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

/**
 *
 * @author Carlos Alpizar <carlosalpizarg@hotmail.com>
 */
public class ServidorCliente extends Observable implements Runnable {

    /**
     * @return the msj
     */
    public String getMsj() {
        return msj;
    }

    /**
     * @param msj the msj to set
     */
    public void setMsj(String msj) {
        this.msj = msj;
    }

    private int puerto;
    private String msj;

    public ServidorCliente(int puerto) {
        this.puerto = puerto;
    }

    public ServidorCliente() {
    }

    @Override
    public void run() {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream input;

        try {

            servidor = new ServerSocket(puerto);
            while (true) {

                sc = servidor.accept();
                input = new DataInputStream(sc.getInputStream());

                String mensaje = input.readUTF();
                msj = mensaje;
                System.out.println(msj);
                sc.close();

            }
        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

    public String enviarCategoria() {
        return getMsj();
    }

}
