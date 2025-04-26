package br.com.joaocarloslima.assets;

import javafx.scene.image.ImageView;

public class Nave extends Asset {
    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao,
                new ImageView("file:src/main/resources/br/com/joaocarloslima/images/ships/playerShip1_blue.png"));
    }

    @Override
    public void mover() {
        if (getX() <= 0) {
            setX(0);
        } else if (getX() >= 640 - 50) {
            setX(640 - 50);
        }
        switch (getDirecao()) {
            case ESQUERDA:
                setX(getX() - getVelocidade());
                break;
            case DIREITA:
                setX(getX() + getVelocidade());
                break;
            default:
                break;
        }
    }

    public Tiro atirar(int poder) {
        return new Tiro(
                getX() + 25,
                getY(),
                10,
                Direcao.CIMA,
                poder);
    }
}
