public class App {
    public void salut(String nume) {
        System.out.println("Buna ziua, " + nume + "!");
    }

    public static void main(String[] args) {
        App app = new App();
        app.salut("Utilizator");
    }
}
