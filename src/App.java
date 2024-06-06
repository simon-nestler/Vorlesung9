public class App {
    public static void main(String[] args) throws Exception {
        Button b = new Button("Klick mich!");
        b.zeichnen();

        System.out.println(b.getAbmessungen());
    }
}
