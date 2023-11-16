import com.codeborne.selenide.Condition;
import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
//გავხსნათ https://2nabiji.ge/ge/
//დავაჭიროთ კატეგორიებს და ავირჩიოთ "ტკბილეული & ნაყინი"
//დავასორტიროთ ფასის კლებადობით
//პირველივე პროდუქტი დავამატოთ კალათაში
//გადავიდეთ კალათაში და წავშალოთ პროდუქტი
//გადავამოწმოთ რომ კალათა ცარიელია

public class Homework4 {
    @Test
    public void oriNabiji() {
        open("https://2nabiji.ge/ge");
        $(".Menu_arrow__3u02s").click();
        $(byTagAndText("h2", "ტკბილეული & ნაყინი")).click();
        $(byText("სორტირება")).click();
        $(byText("ფასი კლებადობით")).click();
        $(".ProductCard_image__20GAY",0).click();
        $(".ProductDetails_quantityAddToCart__ZcrVi").click();
        $(".ProductDetails_closeBtn__1A7hp").click();
        $(".Header_cart__1Lo7H").click();
        $(byText("კალათის გასუფთავება")).click();
        $(byText("დიახ")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(".CartPopup_close__21R2V").click();
    }
}
