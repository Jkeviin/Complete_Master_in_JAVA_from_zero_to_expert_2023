package co.kevorg.app.hogar;

import co.kevorg.app.jardin.Perro;

import static co.kevorg.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
