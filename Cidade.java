package util;

/**
 * @author Guilherme Afonso R. Gomes
 * Inteligencia Computacional para otimização
 * Problema do Caixeiro Viajante
 */
public class Cidade {
    private int cidade;
    private int x;
    private int y;

    public Cidade(int cidade, int x, int y) {
        this.cidade = cidade;
        this.x = x;
        this.y = y;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public int getX() {
        return x;
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
}
