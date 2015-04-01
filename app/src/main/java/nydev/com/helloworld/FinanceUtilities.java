package nydev.com.helloworld;

/**
 * Created by Mark on 3/31/2015.
 */
public class FinanceUtilities {

    public double anualizeMonthlyReturns(double[] monthlyReturns) {

        double value=0.0;

        for (int i=0; i<monthlyReturns.length; i++) {
            value = value * (1 + monthlyReturns[i]);
        }
        return 0.0;
    }
}
