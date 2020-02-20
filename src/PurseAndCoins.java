public class PurseAndCoins {
    public static void main (String [] args){
        Purse myPurse = new Purse();
        Coin nickel = new Coin(0.05, "Nickel");
        Coin quarter = new Coin(0.25, "Quarter");
        Coin halfDollar = new Coin(0.5, "Half Dollar");

        myPurse.add(nickel);
        myPurse.add(quarter);
        myPurse.add(halfDollar);

        System.out.println("Total value: " + myPurse.getTotal());

        Coin nickel2 = new Coin(0.05, "Nickel");
        myPurse.add(nickel2);

        Coin test = new Coin(0.05, "Nickel");
        System.out.println("Coins that match a nickel: " + myPurse.count(test));
    }
}
