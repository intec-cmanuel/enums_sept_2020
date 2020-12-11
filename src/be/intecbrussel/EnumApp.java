package be.intecbrussel;

public class EnumApp {
    public static void main(String[] args) {
//        Coin veryRealCoinNotFakeISwear = Coin.FIVE_EURO;
//        Coin twenty = Coin.TWENTY_CENT;
//
//        System.out.println(veryRealCoinNotFakeISwear);
//        System.out.println(twenty.isEuro());

        Coin[] allPossibleCoins = Coin.values();
        Coin valueOfVar = Coin.valueOf("ONE_CENT");
        System.out.println(valueOfVar);

//        for (Coin allPossibleCoin : allPossibleCoins) {
//            System.out.println(allPossibleCoin);
//        }
    }
}
