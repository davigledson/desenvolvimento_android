package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tratamento_arquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\davig\\Documents\\Java\\desenvolvimento_android\\src\\Java\\teste";
        try {
            FileReader arquivoReader = new FileReader(caminhoArquivo); //Destaca o caminho do arquivo a ser lido
            BufferedReader leitor = new BufferedReader(arquivoReader); //Realizar a otimaizaçao da leitura do arquivo
            String linha;
            while ((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
            leitor.close();
        } catch (IOException e){
            System.err.println("Ocorreu um erro na leitura do seu arquivo");

        }
    }
}
