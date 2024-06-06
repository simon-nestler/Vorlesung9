public abstract class Element extends Object {

    private boolean sichtbar;
    protected int breite;
    protected int hoehe;

    public Element() {
        super();
        sichtbar = true;
        breite = 100;
        hoehe = 100;
        System.out.println("Ein Element-Objekt wird erzeugt.");
    }

    public void zeichnen() {
        if (sichtbar) {
            System.out.println("Das Element wird gezeichnet.");
        }
    }

    protected boolean getSichtbar() {
        return sichtbar;
    }

    public String getAbmessungen() {
        return breite + " x " + hoehe;
    }
}
