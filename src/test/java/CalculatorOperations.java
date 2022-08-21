import com.cydeo.utils.Hooks;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorOperations extends Hooks {


    @DisplayName("Calculator operation: 4 + 5 = 9")
    @Test
    public void test1(){
        MobileElement button_4 = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_4"));
        button_4.click();

        MobileElement plus = driver.findElement(MobileBy.AccessibilityId("plus"));
        plus.click();

        MobileElement button_5 = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_5"));
        button_5.click();

        MobileElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));
        equals.click();

        MobileElement result = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
        System.out.println("result.getText() = " + result.getText());

        Assertions.assertEquals(String.valueOf(9),result.getText());
    }


    @DisplayName("Calculator operation: 15 / 5 = 3")
    @Test
    public void test2(){
        MobileElement button_1 = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_1"));
        MobileElement button_5 = driver.findElement(MobileBy.id("com.google.android.calculator:id/digit_5"));
        MobileElement divide = driver.findElement(MobileBy.AccessibilityId("divide"));
        MobileElement equals = driver.findElement(MobileBy.AccessibilityId("equals"));


        button_1.click();
        button_5.click();

        divide.click();

        button_5.click();

        equals.click();


        MobileElement result = driver.findElement(MobileBy.id("com.google.android.calculator:id/result_final"));
        System.out.println("result.getText() = " + result.getText());

        Assertions.assertEquals(String.valueOf(3),result.getText());
    }
}
