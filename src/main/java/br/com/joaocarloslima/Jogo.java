package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

import br.com.joaocarloslima.assets.Asset;
import br.com.joaocarloslima.assets.Direcao;
import br.com.joaocarloslima.assets.Meteoro;
import br.com.joaocarloslima.assets.Nave;
import br.com.joaocarloslima.assets.Tiro;

public class Jogo {
    private int pontos = 0;
    private int nivel = 1;

    List<Asset> assets = new ArrayList<>();
    Nave nave = new Nave(320 - 25, 400, 10, Direcao.CIMA);

    public void pontuar() {
        this.pontos += 1;
        if (this.nivel >= 4) {
            return;
        }
        if (pontos % 10 == 0) {
            nivel++;
        }
    }

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        int x = (int) (Math.random() * 640);
        int y = 0;
        int velocidade = (int) (Math.random() * 7) + 1;

        Meteoro meteoro = new Meteoro(x, y, velocidade, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
