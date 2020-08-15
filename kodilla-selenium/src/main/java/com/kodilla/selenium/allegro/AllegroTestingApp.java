package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement inputField = driver.findElement(By.xpath("//button[contains(@class, \"_13q9y _8hkto m7er_k4 m7er_wn m7er_56_m mryx_8 mryx_0_m\")]"));
        inputField.click();

        Thread.sleep(10000);

        WebElement categoryCombo = driver.findElement(By.xpath("//div[contains(@class, \"mp7g_oh mr3m_1 _r65gb\")]/select[1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        inputField = driver.findElement(By.xpath("//form[contains(@class, \"mp7g_oh mpof_ki mqu1_21 mp4t_0 m3h2_0 mryx_0 munh_0 mgn2_14 mp0t_0a mgmw_wo mli8_k4 _d25db_3gmLS\")]/input[1]"));
        inputField.sendKeys("Mavic mini");

        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\" and contains(@class, \"_13q9y\")]"));
        submitButton.click();
    }
}
