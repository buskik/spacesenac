package br.com.joaocarloslima.assets;

import javafx.scene.image.ImageView;

public class Meteoro extends Asset {
    private int tamanho;
    private int poder;

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        this(x, y, velocidade, direcao, (int) (Math.random() * 8) + 1);
    }

    private Meteoro(int x, int y, int velocidade, Direcao direcao, int randomTamanho) {
        super(x, y, velocidade, direcao,
                new ImageView("file:src/main/resources/br/com/joaocarloslima/images/meteoro/meteoro"
                        + randomTamanho + ".png"));
        this.tamanho = randomTamanho;
        this.poder = this.tamanho;
    }

    public void tomarTiro(Tiro tiro) {
        this.poder -= tiro.getPoder();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}