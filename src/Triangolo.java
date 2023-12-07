public class Triangolo extends Forma {
    private int base;

    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    int calcolaArea() {
        return (base * altezza) / 2;
    }
}

