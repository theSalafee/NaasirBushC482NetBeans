/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naasirbushc482;

import Model.InhousePart;
import Model.Inventory;
import Model.Part;
import Model.Product;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author naasirbush
 */
public class NaasirBushC482 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View_Controller/MainScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Part part1 = new InhousePart(1, 399.99, 10, 1, 99, "Benz", 100);
        Part part2 = new InhousePart(2, 101.99, 50, 3, 100, "Beemer", 50);
        Part part3 = new InhousePart(3, 131.99, 70, 20, 110, "Tesla", 510);

        Product product1 = new Product(1, "Mercedese", 135.99, 12, 355, 79);
        Product product2 = new Product(2, "BMW", 235.99, 13, 34, 719);
        Product product3 = new Product(3, "Ferrari", 345.99, 14, 334, 794);

        Inventory.addPart(part1);
        Inventory.addPart(part2);
        Inventory.addPart(part3);

        Inventory.addProduct(product1);
        Inventory.addProduct(product2);
        Inventory.addProduct(product3);

        launch(args);
    }

}
