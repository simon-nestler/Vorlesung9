public class Button extends AktionsElement {

    private String text;

    public Button() {
        super();
        hoehe = 30;
        System.out.println("Ein Button-Objekt wird erzeugt.");
    }

    public Button(String text) {
        this();
        System.out.println("Ein Button-Objekt mit Text wird erzeugt.");
        this.text = text;
    }

    @Override
    public void zeichnen() {
        if (getSichtbar()) {
            System.out.println("Der Button wird gezeichnet.");
        }
    }

    @Override
    public void hover() {
        System.out.println("Der Button wird gehovert.");
    }
}
