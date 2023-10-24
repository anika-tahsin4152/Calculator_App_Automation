import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.HashMap;
import java.util.Map;

public class CalculatorScreen extends Setup {
    public AndroidDriver driver;

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    public WebElement btn0;

    @FindBy(id = "com.google.android.calculator:id/digit_1")
   public WebElement btn1;

    @FindBy(id = "com.google.android.calculator:id/digit_2")
    public WebElement btn2;

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    public WebElement btn5;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
public WebElement btn6;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    public WebElement btnAdd;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
   public WebElement btnSubtract;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    public WebElement btnMultiply;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    public WebElement btnDivide;

    @FindBy(id = "com.google.android.calculator:id/eq")
    public WebElement btnEquals;

    @FindBy(id = "com.google.android.calculator:id/formula")
    public WebElement textResult;

    public final Map<Character, WebElement> digitElements = new HashMap<>();
    public final Map<Character, WebElement> operatorElements = new HashMap<>();

    public CalculatorScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);

        digitElements.put('0', btn0);
        digitElements.put('1', btn1);
        digitElements.put('2', btn2);
        digitElements.put('5', btn5);
        digitElements.put('6', btn6);

        operatorElements.put('+', btnAdd);
        operatorElements.put('-', btnSubtract);
        operatorElements.put('*', btnMultiply);
        operatorElements.put('/', btnDivide);
    }

    public void performCalculation(String expression) {
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c) && digitElements.containsKey(c)) {
                digitElements.get(c).click();
            } else if (operatorElements.containsKey(c)) {
                operatorElements.get(c).click();
            }
        }
        btnEquals.click();
    }
    public String getResult() {

        return textResult.getText();
    }
}
