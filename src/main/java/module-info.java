module br.com.joaocarloslima {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.com.joaocarloslima to javafx.fxml;

    exports br.com.joaocarloslima;

    exports br.com.joaocarloslima.assets;

    opens br.com.joaocarloslima.assets to javafx.fxml;
}
