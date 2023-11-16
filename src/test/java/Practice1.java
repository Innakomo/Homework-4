import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Practice1 {
    @Test
    public void task1(){
        open("https://www.ee.ge/");
        $(".btn-register").click();
        $(".registration-titles").shouldBe(Condition.visible);
        $("#rcc-confirm-button").click();
        $("#firstName").setValue("Inna").shouldNotBe(Condition.empty);
        $("#lastName").setValue("Komoshvili").shouldNotBe(Condition.empty);
        $("#email").setValue("inesakomo@gmail.com").shouldNotBe(Condition.empty);
        $("#password").setValue("123456");
        $("#confirmPassword").setValue("123456");
        $("#singup").shouldBe(Condition.enabled);
        //sleep(5000);
    }
    @Test
    public void task2(){
        open("https://www.ee.ge/");
        $(".btn-register").click();
        $(".registration-titles").shouldBe(Condition.visible);
        $("#singup").shouldBe(Condition.disabled);
        $("#rcc-confirm-button").click();
        $("#firstName").click();
        $("#lastName").click();
        $("#email").click();
        $("#password").click();
        $("#confirmPassword").click();
        $("#password").click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $("#email").setValue("inesakomo");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $("#password").setValue("123");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $("#password").setValue("123456");
        $("#confirmPassword").setValue("1111111");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
    }
    @Test
    public void task3(){
        open("https://www.ee.ge/");
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(byText("დაამატე კალათში"),0).click();
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldNotBe(Condition.visible);
    }
    @Test
    public void task4(){
        open("https://www.ee.ge/");
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(byText("დაამატე კალათში"),0).click();
        $(".btn-cart").click();
        $(byText("შენახვა")).click();
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldNotBe(Condition.visible);
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(".cross_icon").click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);

        sleep(5000);

    }
}
