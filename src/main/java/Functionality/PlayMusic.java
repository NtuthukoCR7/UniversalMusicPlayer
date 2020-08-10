package Functionality;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.concurrent.TimeUnit;

public class PlayMusic {
    protected AndroidDriver driver;

    public PlayMusic(AndroidDriver driver) {
        this.driver = driver;
    }
    public void Click_Genres(String _Genre) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        MobileElement ed = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains("+ "\""+ _Genre+"\"" +"));");
        ed.click();
    }
    public void Select_Rock(String _Rock) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        MobileElement ed = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains("+ "\""+ _Rock+"\"" +"));");
        ed.click();
    }
    public void Play_Awakening(String _songName) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        MobileElement ed = (MobileElement) driver
                .findElementByAndroidUIAutomator("new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().textContains("+ "\""+ _songName+"\"" +"));");
        ed.click();
    }

}