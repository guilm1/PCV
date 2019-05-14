package util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Guilherme Afonso R. Gomes Inteligencia Computacional para otimização
 * Problema do Caixeiro Viajante
 */
public class PCV {

    NumberFormat form = new DecimalFormat("#0.00000");
    Random rand = new Random();

    public PCV() {
    }

    public void imprimeMatrizDistanciaEUC(int n, Double[][] distancia) {
        for (int l = 0; l < distancia.length; l++) {
            for (int c = 0; c < distancia[0].length; c++) {
                System.out.print(distancia[l][c] + " "); //imprime caracter a caracter
            }
            System.out.println(" "); //muda de linha
        }
    }

    public String Calculacusto(Double[][] d, int n, ArrayList<Integer> s) {
        Double custo = 0.0;
        for (int z = 0; z < n - 1; z++) {
            custo += d[s.get(z)][s.get(z + 1)];
        }
        custo += d[s.get(n - 1)][s.get(0)];custo*=0.5;
        return String.valueOf(custo);
    }
    //Implementação gulosa a partir do vizinho mais próximo
    //Construir uma rota adicionando, a cada passo, a
    //cidade mais próxima da última cidade inserida e
    //que ainda não foi visitada.
    public ArrayList solucaoGulosaVizinhoMaisProximo(int n, Double[][] dist) {
        ArrayList<Integer> sol = new ArrayList<>();
        ArrayList<Integer> visita = new ArrayList<>();
        for (int k = 0; k < n; k++) { // iniciando array de distancias
            visita.add(k);
        }
        sol.add(0);//adicionando ponto de partida (origem)
        int atual = 0;
        while (!visita.isEmpty()) { 
            int indice = 0;
            Double menor = 999999.0;
            for (int l = 1; l < n; l++) {
                if (dist[atual][l] < menor && visita.contains(l)) {
                    menor = dist[atual][l];
                    indice = l;
                }
            }
            visita.remove(visita.indexOf(indice));
            sol.add(indice);
            atual = indice;
        }
        System.out.println("Solução Gulosa - Vizinho mais próximo: " + sol);
        System.out.println("Custo da Solução: " + calculaCusto(dist, n, sol));
        return sol;
    }

    public String calculaCusto(Double[][] d, int n, ArrayList<Integer> s) {
        Double custo = 0.0;
        for (int z = 0; z < n - 1; z++) {
            custo += d[s.get(z)][s.get(z + 1)];
        }
        custo += d[s.get(n - 1)][s.get(0)];
        return  String.valueOf(custo);
    }

    //Construir uma rota, partindo de rota inicial
    //envolvendo 3 cidades e adicionar a cada passo, a
    //cidade k, ainda não visitada, entre a ligação (i, j)
    //de cidades já visitadas, cujo custo de inserção seja
    //o mais barato
    public ArrayList solucaoGulosaInsercaoMaisBarata(int n, Double[][] dist) {
        ArrayList<Integer> sol = new ArrayList<>();
        ArrayList<Integer> visita = new ArrayList<>();
        Double melhorCusto, cij;
        int j = 1, ci, cj, ck, melhorCidK = 0, melhorCidI = 0, pos = 0;
        for (int k = 0; k < n; k++) {
            visita.add(k);
        }
        sol.add(0);
        int atual = 0;
        //Insere as duas proximas cidades pela heurística do vizinho mais próximo
        while (j < 3) {
            int indice = 0;
            Double menor = 999999.0;
            for (int l = 1; l < n; l++) {
                if (dist[atual][l] < menor && visita.contains(l)) {
                    menor = dist[atual][l];
                    indice = l;
                }
            }
            visita.remove(visita.indexOf(indice));
            sol.add(indice);
            atual = indice;
            j++;
        }
        while (j < n) {
            int k = 1;
            melhorCusto = 999999.0;
            while (k < visita.size()) {
                ck = visita.get(k);
                for (int i = 0; i < j; i++) {
                    ci = sol.get(i);
                    if ((i + 1) != j) {
                        cj = sol.get(i + 1);
                    } else {
                        cj = 0;
                    }
                    cij = dist[ci][ck] + dist[ck][cj] - dist[ci][cj];
                    if (cij < melhorCusto) {
                        melhorCidI = ci;
                        melhorCidK = ck;
                        melhorCusto = cij;
                    }
                }
                k++;
            }
            for (int i = 0; i < j; i++) {
                if (sol.get(i) == melhorCidI) {
                    pos = i + 1;
                }
            }
            sol.add(pos, melhorCidK);
            visita.remove(visita.indexOf(melhorCidK));
            j++;
        }
        sol.add(sol.get(0)); //
        System.out.println("\nSolução Gulosa - Inserção mais barata: " + sol);
        System.out.println("Custo da Solução: " + calculaCusto(dist, n, sol));
        return sol;
    }

    public ArrayList solucaoAleatoria(int n, Double[][] dist) {
        ArrayList<Integer> sol = new ArrayList<>();
        ArrayList<Integer> visita = new ArrayList<>();
        int j = 1;
        for (int k = 0; k < n; k++) {
            visita.add(k);
        }
        sol.add(0);
        int cidEscolhida;
        while (j < n) {
            cidEscolhida = visita.get(rand.nextInt(visita.size()));
            sol.add(cidEscolhida);
            visita.remove(visita.indexOf(cidEscolhida));
            j++;
        }
        sol.add(0);
        System.out.println("\nSolução Gulosa - Inserção mais barata: " + sol);
        System.out.println("Custo da Solução: " + calculaCusto(dist, n, sol));
        return sol;
    }

    public ArrayList parcialmenteGulosaVizinhoMaisProximo(int n, Double[][] dist, double alfa) {
        ArrayList<Integer> sol = new ArrayList<>();
        ArrayList<Modelo> candidatos = new ArrayList<>();
        ArrayList<Integer> visita = new ArrayList<>();
        ArrayList<Integer> ordenado = new ArrayList<>();
        for (int l = 0; l < n; l++) {
            visita.add(l);
        }
        sol.add(0);
        int j = 1;
        while (j < n) {
            int k = 1;
            while (k < visita.size()) {
                Modelo md = null;
                if (j != k) {
                    md = new Modelo(dist[sol.size()][visita.get(k)], visita.get(k));
                    candidatos.add(md);
                }
                k++;
            }
            ordenado.clear();
            while (!candidatos.isEmpty()) {
                Modelo menor = null;
                Double m = 99999.0;
                for (int p = 0; p < candidatos.size(); p++) {

                    if (candidatos.get(p).distancia < m) {
                        m = candidatos.get(p).distancia;
                        menor = candidatos.get(p);
                    }
                }
                candidatos.remove(candidatos.indexOf(menor));
                ordenado.add(menor.getCidade());
            }
            int cid = (int) Math.max(1, alfa * ordenado.size());
            int posicaoEscolhida = rand.nextInt(cid);
            boolean condicao = true;
            while (condicao) {
                if (!sol.contains(posicaoEscolhida)) {
                    visita.remove(visita.indexOf(posicaoEscolhida));
                    condicao = false;
                } else {
                    posicaoEscolhida += 1;
                }
            }
            sol.add(posicaoEscolhida);
            j++;
        }
        sol.add(0); // adicionando ponto de chegada a solução
//        System.out.println("\nParcialmente Guloso - vizinho mais próximo: " + sol);
//        System.out.println("Custo da Solução: " + Calculacusto(dist, n, sol));
        return sol;
    }
}
