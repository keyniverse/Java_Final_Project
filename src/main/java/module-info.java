module finalproject.finalprojecttest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.media;

    opens finalproject.finalprojecttest to javafx.fxml;
    exports finalproject.finalprojecttest;
}