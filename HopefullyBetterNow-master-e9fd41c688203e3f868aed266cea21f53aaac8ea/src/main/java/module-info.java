/* doesn't work with source level 1.8:
module com.mycompany.graphing {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.graphing to javafx.fxml;
    exports com.mycompany.graphing;
}
*/
