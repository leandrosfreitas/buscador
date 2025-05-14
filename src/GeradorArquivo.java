// Importa as classes necessárias do Gson e para manipulação de arquivos
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

// Classe responsável por salvar o objeto Endereco como um arquivo JSON
public class GeradorArquivo {

    // Metodo que salva um endereço em um arquivo JSON formatado
    public void salvaJson(Endereco endereco) throws IOException {
        // Cria uma instância do Gson com saída formatada (pretty printing)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Cria um FileWriter que gera um arquivo com o nome do CEP e extensão .json
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");

        // Escreve o conteúdo do objeto Endereco convertido para JSON no arquivo
        escrita.write(gson.toJson(endereco));

        // Fecha o arquivo após a escrita
        escrita.close();
    }
}
