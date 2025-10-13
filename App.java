public class App {
    // Versiunea 2.0
    public void salut(String nume) {
        System.out.println("======================");
        System.out.println("SALUTARI DIN ROMANIA!");
        System.out.println("Buna " + nume + "!");
        System.out.println("======================");
    }

    public static void main(String[] args) {
        App app = new App();
        app.salut("Dragul meu utilizator");
    }
}
