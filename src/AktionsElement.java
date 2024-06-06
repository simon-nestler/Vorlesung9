public class AktionsElement extends Element {

    public AktionsElement() {
        super();
        System.out.println("Ein AktionsElement-Objekt wird erzeugt.");
    }

    @Override
    public void zeichnen() {
        super.zeichnen();

        if (getSichtbar()) {
            System.out.println("Das AktionsElement wird gezeichnet.");
        }
    }
}
