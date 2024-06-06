public class Button extends AktionsElement {

    private String text;

    public Button() {
        super();
        System.out.println("Ein Button-Objekt wird erzeugt.");
    }

    public Button(String text) {
        this();
        System.out.println("Ein Button-Objekt mit Text wird erzeugt.");
        this.text = text;
    }
}
