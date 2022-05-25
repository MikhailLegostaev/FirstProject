package pages.telecomunications;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePages;

import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishmentPage extends BasePages {

    private final SelenideElement buttonWallet = $x("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[1]/div[2]/div/div[1]");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement inputPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement inputAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement buttonSubmitToTheCard = $x("//button[@data-qa-node='submit']");
    private final SelenideElement peymentDetails = $x("//span[@data-qa-node='details']");

    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        clearAndType(inputPhoneNumber,number);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv){
        clearAndType(inputCardCvv,cvv);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardExpDate(String cardExpDate){
      clearAndType(inputCardExpDate,cardExpDate);
        return this;
    }
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        clearAndType(inputAmount,amount);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardFrom (String cardFrom){
        clearAndType(inputCardFrom, cardFrom);
        return this;
    }
    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }
    public MobilePhoneReplenishmentPage submitToTheCard(){
        buttonSubmitToTheCard.shouldBe(Condition.visible).click();
        return this;
    }
    public MobilePhoneReplenishmentPage checkPeymentDetails(String text){
        peymentDetails.shouldBe(Condition.visible);
        return this;
    }

}
