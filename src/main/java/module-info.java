module com.cartao {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.cartao to javafx.fxml;
    exports com.cartao;
}