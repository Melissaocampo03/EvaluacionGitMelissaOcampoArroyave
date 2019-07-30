package main;

public enum Mensajes {

    MENSAJE_NOMBRE ("Ingrese su nombre: "),
    MENSAJE_RESULTADO ("Su nombre es: ");


    private String mensaje;

    Mensajes(String s){
        this.mensaje=s;

    }
    public String getMensaje(){
        return mensaje;
    }
}

