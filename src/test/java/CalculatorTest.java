import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest extends Setup {
    public CalculatorScreen calculatorScreen;

    @Test
    public void doSeries() {
        calculatorScreen = new CalculatorScreen(driver);
        calculatorScreen.performCalculation("100/10*5-10+60");
        String result = calculatorScreen.getResult();
        System.out.println("Expression: 100/10*5-10+60");
        System.out.println("Result: " + result);
        Assert.assertEquals(result, "100");
    }

}
