package Test;
import Functionality.PlayMusic;
import Setup.BaseSetup;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Test_Mobile {
    BaseSetup Setup = new BaseSetup();
    private AndroidDriver driver =  Setup.getDriver();

    public Test_Mobile() throws MalformedURLException {
    }
    @Test
    public void Select_Genre () throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        mymusic.Click_Genres("Genres");

    }
    @Test(priority = 1)
    public void Select_Rock () throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        TimeUnit.SECONDS.sleep(3);
        mymusic.Select_Rock("Rock");
        TimeUnit.SECONDS.sleep(1);

    }
    @Test(priority = 2)
    public void Play_Song() throws InterruptedException {
        PlayMusic mymusic = new PlayMusic(driver);
        TimeUnit.SECONDS.sleep(1);
        mymusic.Play_Awakening("Awakening");
    }
    @AfterTest
    public void Close_Player () throws InterruptedException
    {
        //Listen to the song for 5 seconds
        TimeUnit.SECONDS.sleep(5);
        driver.quit();
    }
}