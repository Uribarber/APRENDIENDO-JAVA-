package abstraccion;
//ABSTRACCION
public class Abstraccion {
    public static void main(String[] args) {
        Telefono obj = new Telefono("Blanco", "Android");
        obj.hacerLlamadaTelefonica();
    }
}

class Telefono {
    private String color;
    private String marca;

    public Telefono(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public void hacerLlamadaTelefonica() {
        System.out.println("Haciendo una llamada desde un teléfono de color " + color + " y marca " + marca + "...");
    }
}
