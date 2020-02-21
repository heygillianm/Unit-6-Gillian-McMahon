import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<Coin>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double sum = 0;
        for (Coin c : coins){
            sum += c.getValue();
        }
        return sum;
    }

    // returns the number of coins in the Purse that matches aCoin
    // (both myName & myValue)
   public int count(Coin aCoin) {
        int i = 0;
        while (i < coins.size()){
            if (coins.get(i).getName() == aCoin.getName() && coins.get(i).getValue() == aCoin.getValue()){
                i++;
            }
        }
        return i;
    }
}
