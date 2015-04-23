package nydev.com.helloworld;

import java.util.Currency;

/**
 * Created by Mark on 4/22/2015.
 */
public class Transaction {

    private Ticker ticker;
    private Currency price;
    private long shares;

    public Transaction(Ticker ticker, Currency price, long shares) {
        this.ticker = ticker;
        this.price = price;
        this.shares = shares;
    }


}
