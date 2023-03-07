public class Automovil {

    int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.BLANCO;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";


    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil (String fabricante, String modelo){
          this();
         this.fabricante = fabricante;
         this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Automovil.ultimoId = ultimoId;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque){
        this.capacidadEstanque = capacidadEstanque;
    }


    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle(){
        String sb = "\nauto.id = " + this.id +
                "\nauto = " + this.fabricante +
                "\nauto = " + this.modelo +
                "\nauto.tipo = " + this.tipo.getDescripcion() +
                "\nauto.puerta = " + this.tipo.getNumeroPuerta() +
                "\nauto = " + this.color.getColor() +
                "\nauto = " + Automovil.colorPatente.getColor() +
                "\nauto = " + this.cilindrada;

        return sb;
    }

    public String acelerar(int rpm){
        return "el auto "+this.fabricante+" acelerando a "+rpm+"rpm";
    }

    public String frenar(){
        return fabricante+" "+ this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencima){
        return km/(capacidadEstanque * porcentajeBencima);
    }

    public float calcularConsumo(int km, int porcentajeBencima){
        return km/(capacidadEstanque * (porcentajeBencima/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencima){
        return km/(Automovil.capacidadEstanqueEstatico * (porcentajeBencima/100f));
    }

    @Override
    public boolean equals(Object obj) {

        if(this ==  obj){
            return true;
        }

        // Si la instancia obj no es de tipo Automovil
        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;

        return (this.fabricante != null && this.modelo != null &&
                this.fabricante.equalsIgnoreCase(a.getFabricante()) && this.modelo.equalsIgnoreCase(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " " + fabricante + " " + modelo;
    }
}
