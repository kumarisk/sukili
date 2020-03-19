import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sukiliTest {
    public static void main(Strings[] args) throws FindFailed, InterruptedException {

//        Screen screen= new Screen();
//        Pattern pattern=new Pattern("");
//        screen.click();
//        screen.doubleClick();
//        screen.rightClick();

        Screen screen= new Screen();
        Pattern pattern=new Pattern("");

        WebDriver driver= new ChromeDriver();
        driver.get("");
        driver.wait(pattern ,500);
        screen.click(pattern);

    }

}
