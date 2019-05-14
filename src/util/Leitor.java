package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Guilherme Afonso R. Gomes Inteligencia Computacional para otimização
 * Problema do Caixeiro Viajante
 */
public class Leitor {

    private File file;

    public Leitor() {

    }
// lê arquivo no formato cidade, coord x, coord y e calcula a distância d_ij

    public Double[][] lerArquivo(String nome, int n) throws FileNotFoundException, IOException {
        Double[][] distancia = new Double[n][n];
        int x, y, i, j;
        ArrayList<Cidade> cidades = new ArrayList<>();
        //Abre arquivo e cria buffer de leitura
        file = new File(nome);
        FileReader leitor = new FileReader(file);
        BufferedReader bufferLeitura = new BufferedReader(leitor);
        //lendo arquivo e atribuindo valores
        for (int p = 0; p < n; p++) {
            String linha = bufferLeitura.readLine();
            String[] linhaQuebra = linha.split(" ");
            i = Integer.parseInt(linhaQuebra[0]);
            x = Integer.parseInt(linhaQuebra[1]);
            y = Integer.parseInt(linhaQuebra[2]);
            Cidade c = new Cidade(i, x, y);
            cidades.add(c);
        }
        //gera matriz de distancias através das distâncias euclidianas dos pontos
        for (i = 0; i < n - 1; i++) {
            distancia[i][i] = 0.0; // iniciando a matriz
            for (j = i + 1; j < n; j++) { //atribuindo valores aos índices da matriz
                distancia[i][j] = (Double) Math.sqrt(Math.pow(cidades.get(i).getX() - cidades.get(j).getX(), 2) + Math.pow(cidades.get(i).getY() - cidades.get(j).getY(), 2));
                distancia[j][i] = distancia[i][j];
            }
        }
        distancia[n-1][n-1] = 0.0;
        bufferLeitura.close();
        leitor.close();
        return distancia;
    }

    public int retornaTamanho(String nome) throws FileNotFoundException, IOException {
        int tamanho;
        //Abre arquivo e cria buffer de leitura
        file = new File(nome);
        FileReader leitor = new FileReader(file);
        BufferedReader bufferLeitura = new BufferedReader(leitor);
        //lendo arquivo e atribuindo valores
        String linha = bufferLeitura.readLine();
        String[] linhaQuebra = linha.split(" ");
        tamanho = Integer.parseInt(linhaQuebra[0]);
        bufferLeitura.close();
        leitor.close();
        return tamanho;
    }
}
