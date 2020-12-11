package be.intecbrussel;

public enum Coin {
    ONE_CENT(false, 1),
    TWO_CENT(false, 2),
    FIVE_CENT(false, 5),
    TEN_CENT(false, 10),
    TWENTY_CENT(false, 20),
    FIFTY_CENT(false, 50),
    ONE_EURO(true, 100),
    TWO_EURO(true, 200),
    FIVE_EURO(true, 500);

    private final boolean isEuro;
    private final int centValue;

    Coin(boolean isEuro, int centValue) {
        this.isEuro = isEuro;
        this.centValue = centValue;
    }

    public boolean isEuro() {
        return isEuro;
    }

    public int getCentValue() {
        return centValue;
    }

    @Override
    public String toString() {
        if (isEuro) {
            return (centValue / 100) + " Euro.";
        } else {
            return centValue + " Cent.";
        }
    }
}
