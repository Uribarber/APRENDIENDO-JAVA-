package introduccion;

public class Introduccion {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la Introduccion!");
        Animal animal = new Animal("Perro");
        System.out.println("Animal creado: " + animal);
    }

    public static class Animal {
        private String name;
        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "'" + name + "'";
        }
    }
}