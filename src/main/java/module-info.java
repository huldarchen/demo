module com.huldar.demo {

    requires javafx.controls;
    requires javafx.fxml;
    requires transitive com.codeborne.selenide;


    opens com.huldar.demo;
    exports com.huldar.demo;
}