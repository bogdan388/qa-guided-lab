public class App {
// Aplicatie de salutare
 public void salut(String nume) {
      System.out.println("Salutare, " + nume + "!");
      System.out.println("O zi minunata iti doresc!");
}

public void salutFormal(String nume, String titlu) {
      System.out.println("Buna ziua, " + titlu + " " + nume);
}

public static void main(String[] args) {
      App app = new App();
      app.salut("Coleg");
      app.salutFormal("Popescu", "Domnule");
}
}
