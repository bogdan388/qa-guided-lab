public class App {
    // Aplicatie de salutare
    private String mesajSalut = "Bine ai venit";

    public void salut(String nume) {
        System.out.println(mesajSalut + ", " + nume + "!");
        System.out.println("Cum te mai simti azi?");
    }

    public void salutFormal(String nume, String titlu) {
        System.out.println("Buna ziua, " + titlu + " " + nume);
    }

    public static void main(String[] args) {
        App app = new App();
        app.salut("Prietene");
        app.salut("Coleg");
        app.salutFormal("Popescu", "Domnule");
    }
}
