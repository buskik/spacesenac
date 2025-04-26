package br.com.joaocarloslima.assets;

import javafx.scene.image.ImageView;

public class Tiro extends Asset {

    int poder;

    public Tiro(int x, int y, int velocidade, Direcao direcao, int poder) {
        super(x, y, velocidade, direcao,
                new ImageView("file:src/main/resources/br/com/joaocarloslima/images/laser/laser" + poder + ".png"));
        this.poder = poder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}