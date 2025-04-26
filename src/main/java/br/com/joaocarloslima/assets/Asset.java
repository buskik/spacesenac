package br.com.joaocarloslima.assets;

import javafx.scene.image.ImageView;

public abstract class Asset {
    private int x;
    private int y;
    private int velocidade;

    private ImageView imagem;
    private Direcao direcao;

    public Asset(int x, int y, int velocidade, Direcao direcao, ImageView imagem) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.direcao = direcao;
        this.imagem = imagem;
    }

    public void mover() {
        switch (getDirecao()) {
            case CIMA:
                setY(getY() - getVelocidade());
                break;
            case BAIXO:
                setY(getY() + getVelocidade());
                break;
            case ESQUERDA:
                setX(getX() - getVelocidade());
                break;
            case DIREITA:
                setX(getX() + getVelocidade());
                break;
        }
    }

    public boolean colidiuCom(Asset asset) {

        double largura = this.getImagem().getFitWidth() > 0 ? this.getImagem().getFitWidth() : 50;
        double altura = this.getImagem().getFitHeight() > 0 ? this.getImagem().getFitHeight() : 50;
        double largAsset = asset.getImagem().getFitWidth() > 0 ? asset.getImagem().getFitWidth() : 50;
        double altAsset = asset.getImagem().getFitHeight() > 0 ? asset.getImagem().getFitHeight() : 50;

        double margem = 10;

        return x < asset.getX() + largAsset + margem &&
                x + largura + margem > asset.getX() &&
                y < asset.getY() + altAsset + margem &&
                y + altura + margem > asset.getY();
    }

    public int getX() {
        return x;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }
}
