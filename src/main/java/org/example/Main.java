package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive", "D:\\AQA\\WebDrivers\\chromedriver_win32chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://google.com");

    }
}