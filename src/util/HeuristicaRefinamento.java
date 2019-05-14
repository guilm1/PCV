package util;

import java.util.ArrayList;
import java.util.Random;

/* @author Guilherme Afonso R . Gomes
Disciplina: Inteligencia Computacional para Otimização
Universidade Federal de Ouro Preto*/

public class HeuristicaRefinamento {

    int jMe, iMe;
    PCV pcv = new PCV();
    Random rand = new Random();
    ArrayList<Integer> solucao;

    public ArrayList<Integer> getSolucaoHeuristica() {
        return solucao;
    }

    public void setSolucaoHeuristica(ArrayList<Integer> solucao) {
        this.solucao = solucao;
    }
    
    public HeuristicaRefinamento() {
    }

    public int getjMe() {
        return jMe;
    }

    public void setjMe(int jMe) {
        this.jMe = jMe;
    }

    public int getiMe() {
        return iMe;
    }

    public void setiMe(int iMe) {
        this.iMe = iMe;
    }

    public ArrayList<Integer> mistArray(int tam) {
        ArrayList<Integer> array = new ArrayList<>();
        int aux, i1, i2;
        for (int i = 0; i < tam; i++) {
            array.add(i);
        }
        for (int j = 0; j < tam; j++) {
            i1 = rand.nextInt(tam);
            i2 = rand.nextInt(tam);
            while (i1 == i2) {
                i2 = rand.nextInt(tam);
            }
            aux = array.get(i1);
            array.set(i1, array.get(i2));
            array.set(i2, aux);
        }
        return array;
    }

    public Double calculaVariacao(int tam, ArrayList<Integer> sol, Double[][] dist, int i, int j) {
        int i_posicaoAnterior, i_posicaoSucessor, j_posicaoAnterior, j_posicaoSucessor;
        i_posicaoAnterior = i - 1;
        i_posicaoSucessor = i + 1;
        j_posicaoAnterior = j - 1;
        j_posicaoSucessor = j + 1;
        if (i == 0) {
            i_posicaoAnterior = tam - 1;
        }
        if (i == tam - 1) {
            i_posicaoSucessor = 0;
        }
        if (j == 0) {
            j_posicaoAnterior = tam - 1;
        }
        if (j == tam - 1) {
            j_posicaoSucessor = 0;
        }

        return dist[sol.get(i_posicaoAnterior)][sol.get(i)] + dist[sol.get(i)][sol.get(i_posicaoSucessor)]
                + dist[sol.get(j_posicaoAnterior)][sol.get(j)] + dist[sol.get(j)][sol.get(j_posicaoSucessor)];
    }

    public Double melhorVizinho(int tam, ArrayList<Integer> sol, Double[][] dist, Double custo) {
        int aux;
        Double custoMelhorVizinho = custo;
        Double custoVizinho;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                Double variacao1 = calculaVariacao(tam, sol, dist, i, j);
                aux = sol.get(j);
                sol.set(j, sol.get(i));
                sol.set(i, aux);
                Double variacao2 = calculaVariacao(tam, sol, dist, i, j);
                custoVizinho = custo - variacao1 + variacao2;
                if (custoVizinho < custoMelhorVizinho) {
                    setiMe(i);
                    setjMe(j);
                    custoMelhorVizinho = custoVizinho;
                }
                aux = sol.get(j);
                sol.set(j, sol.get(i));
                sol.set(i, aux);
            }
        }
        return custoMelhorVizinho;
    }

    public Double metodoDescida(int tam, ArrayList<Integer> sol, Double[][] dist) {
        Double custoVizinho, custo;
        int aux;
        boolean controlador;
        custo = custoVizinho = Double.parseDouble(pcv.calculaCusto(dist, tam, sol));
        do {
            controlador = false;
            custoVizinho = melhorVizinho(tam, sol, dist, custo);
            if (custoVizinho < custo) {
                aux = sol.get(getjMe());
                sol.set(getjMe(), sol.get(getiMe()));
                sol.set(getiMe(), aux);
                custo = custoVizinho;
                controlador = true;
            }
        } while (controlador == true);
        setSolucaoHeuristica(sol);
        return custo;
    }

    public Double metodoDescidaRandomica(int tam, ArrayList<Integer> sol, Double[][] dist, int iter) {
        int i, j, it, aux;
        Double variacao1, variacao2, custo, custoVizinho;
        custo = Double.parseDouble(pcv.calculaCusto(dist, tam, sol));
        it = 0;
        while (it < iter) {
            it++;
            j = rand.nextInt(tam);
            do {
                i = rand.nextInt(tam);
            } while (i == j);

            variacao1 = calculaVariacao(tam, sol, dist, i, j);
            aux = sol.get(i);
            sol.set(i, sol.get(j));
            sol.set(j, aux);
            variacao2 = calculaVariacao(tam, sol, dist, i, j);
            custoVizinho = custo - variacao1 + variacao2;
            if (custoVizinho < custo) {
                it = 0;
                custo = custoVizinho;
            } else {
                aux = sol.get(i);
                sol.set(i, sol.get(j));
                sol.set(j, aux);
            }
        }
        setSolucaoHeuristica(sol);
        return custo;
    }

    public Double metodoPrimeiraMelhora(int tam, ArrayList<Integer> sol, Double[][] dist, Double custo) {
        int aux;
        Double custoMelhorVizinho = custo, custoVizinho;
        boolean controlador = false;
        ArrayList<Integer> array = mistArray(tam);
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                Double variacao1 = calculaVariacao(tam, sol, dist, array.get(i), array.get(j));
                aux = sol.get(array.get(j));
                sol.set(array.get(j), sol.get(array.get(i)));
                sol.set(array.get(i), aux);
                Double variacao2 = calculaVariacao(tam, sol, dist, array.get(i), array.get(j));
                custoVizinho = custo - variacao1+variacao2;
                if(custoVizinho < custoMelhorVizinho){
                    setiMe(array.get(i));
                    setjMe(array.get(j));
                    custoMelhorVizinho = custoVizinho;
                    controlador = true;
                }
                aux = sol.get(array.get(j));
                sol.set(array.get(j), sol.get(array.get(i)));
                sol.set(array.get(i), aux);
                if(controlador) break;
            }
            if(controlador) break;
        }
        setSolucaoHeuristica(sol);
        return custoMelhorVizinho;
    }

    public Double metodoDescidaPrimeiraMelhora(int tam, ArrayList<Integer>sol, Double[][]dist){
        int aux;
        Double custoVizinho, custo;
        boolean controlador;
        custo = custoVizinho = Double.parseDouble(pcv.calculaCusto(dist,tam,sol));
        do{
            controlador = false;
            custoVizinho = metodoPrimeiraMelhora(tam,sol,dist,custo);
            if(custoVizinho < custo){
                aux = sol.get(getjMe());
                sol.set(getjMe(), sol.get(getiMe()));
                sol.set(getiMe(), aux);
                custo = custoVizinho;
                controlador = true;
            }
        }while(controlador == true);
        setSolucaoHeuristica(sol);
        return custo;
    }
}
