package com.huldar.demo;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author huldarchen
 * @version 1.0
 * @CreateTime 2024/6/21 22:06
 */
public class WebScraper {
    public static String getBaiduTitle() {
        // 配置Selenide为无头模式，这样不会打开浏览器界面
//        Configuration.headless = true;
//        Configuration.browserSize = "1920x1080";

        // 打开百度网站
        open("https://www.baidu.com");

        // 获取标题
        String title = Selenide.title();

        // 关闭浏览器
        Selenide.closeWebDriver();

        return title;
    }
}
