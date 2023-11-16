import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MyFirstClass {
    @Test
    public void myTest(){
        //open("https://www.google.com/");
        open("https://redmed.ge/");
        SelenideElement selector = $("#username");
        System.out.println(selector);
        //Configuration.baseUrl ="https://redmed.ge/";
        //Configuration.browserSize = "1980x1080";
        $("#username");
        $(byId("username"));
        $(byClassName("class"));
        $(byName("q"));
        $(byLinkText("ავტორიზაცია"));
        $(byXpath(""));
        $(by("data-ved", "djkfaskdjasd"));
        $(byAttribute("aria-label", "Google Search"));
        $(byPartialLinkText("ავტორიზ"));

    }
    @Test
    public void myTest1(){
        open("https://redmed.ge/user/register?selectedLanguage=ka");
        $("#user-registration-button").shouldBe(Condition.disabled);
        $("#user-registration-button").shouldBe(Condition.visible, Duration.ofMillis(5000));
        $(byLinkText("ავტორიზაცია")).sendKeys(Keys.BACK_SPACE);
        $(byLinkText("ავტორიზაცია")).scrollTo();
        $(byLinkText("ავტორიზაცია"));

    }
    @Test
    public void myTest2(){
        open("https://www.google.com/");
        $(byName("q")).setValue("Test automation").pressEnter();
    }
}
