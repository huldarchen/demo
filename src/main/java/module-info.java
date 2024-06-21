module com.huldar.demo {

    requires javafx.controls;
    requires javafx.fxml;
    requires com.codeborne.selenide; // Selenide的模块
    requires okhttp3; // okhttp3模块

    opens com.huldar.demo;
    exports com.huldar.demo;
}