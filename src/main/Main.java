package main;
import static main.Mensajes.*;
import javax.swing.*;


public class Main {
    public static void main (String[] args){

        String nombre=JOptionPane.showInputDialog(null,Mensajes.MENSAJE_NOMBRE.getMensaje());
        JOptionPane.showMessageDialog(null,MENSAJE_RESULTADO.getMensaje() + nombre);
    }
}
