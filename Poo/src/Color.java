public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja");

    private final String Color;

    Color(String color) {
        Color = color;
    }

    public String getColor() {
        return Color;
    }
}
