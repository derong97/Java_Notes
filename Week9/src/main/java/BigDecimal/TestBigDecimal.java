package BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TestBigDecimal {
    public static void main(String[] args) {

        System.out.println(0.7+0.1); // 0.799999 <-- floating point error

        // constructor can take in int, double etc, but string preferred
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = a.divide(b);
        System.out.println(c);
        System.out.println("Unscaled value: " + c.unscaledValue()); //25
        System.out.println("Scale " + c.scale()); //2

        // Use significant figure if your scale is infinite e.g. 1/7
        BigDecimal up = new BigDecimal( "10" );
        BigDecimal down = new BigDecimal( "7" );
        int sigFigures = 5 ;
        MathContext mc = new MathContext(sigFigures, RoundingMode.HALF_UP);
        BigDecimal result = up.divide(down,mc);
        System.out.println(result);


        // Converting Double to BigDecimal
        double x1 = 4.264796;
        BigDecimal y1 = new BigDecimal(x1); // method 1
        BigDecimal y2 = BigDecimal.valueOf(x1); // method 2
        System.out.println(y1.round(mc).equals(y2.round(mc)));

        // Converting BigDecimal to Double
        double x2 = y1.doubleValue();
        System.out.println(x2);

        // Converting BigDecimal to String
        System.out.println(y1.toString());
    }
}
