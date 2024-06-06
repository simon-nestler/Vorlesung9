public class App {
    public static void main(String[] args) throws Exception {

        AktionsElement e = new Button();

        if (e instanceof Button) {
            Button b = (Button) e;
            b.hover();
        } else {
            System.out.println("Das Element ist kein Button.");
        }

    }
}
