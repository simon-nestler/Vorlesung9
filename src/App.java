public class App {
    public static void main(String[] args) throws Exception {

        Button b = new Button();
        AktionsElement e = b;

        b = null;
        b = (Button) e;

        System.out.println(b.getAbmessungen());

    }
}
