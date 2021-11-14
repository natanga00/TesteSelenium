package atividadefelipe;
// Autor: Rafael Martins Silva
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePreencherDados {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Rafael Martins\\Desktop\\jar_files\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tumblr.com/register?source=new_to_tumblr");

        WebElement email = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/div[1]/div[1]/input"));
        email.sendKeys("rafael.martinssilva@hotmail.com");

        WebElement senha = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/div[1]/div[2]/input"));
        senha.sendKeys("r@finha123");

        WebElement nomeBlog = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/div[1]/div[3]/input"));
        nomeBlog.sendKeys("SeleniumTutorial");

        WebElement submit = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/section/div/form/button/span"));
        submit.click();

        driver.close(); // Preenche os dados do cadastro e clica no botão

    }
}
