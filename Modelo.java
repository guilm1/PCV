package util;

/**
 * @author Guilherme Afonso R. Gomes
 * Inteligencia Computacional para otimização
 * Problema do Caixeiro Viajante
 */
public class Modelo {
    Double distancia;
    int cidade;

    public Modelo(Double distancia, int cidade) {
        this.distancia = distancia;
        this.cidade = cidade;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }
    
}
