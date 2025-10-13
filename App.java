public class App {
    private String mesajSalut = "Bine ai venit";

    public void salut(String nume) {
        System.out.println(mesajSalut + ", " + nume + "!");
        System.out.println("Cum te mai simti azi?");
    }

    public static void main(String[] args) {
        App app = new App();
        app.salut("Prietene");
    }
}
