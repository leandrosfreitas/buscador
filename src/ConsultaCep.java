// Importa a biblioteca Gson para conversão de JSON em objetos Java
import com.google.gson.Gson;

// Importa exceções e classes necessárias para fazer a requisição HTTP
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Classe responsável por consultar um endereço usando um CEP via API do ViaCEP
public class ConsultaCep {

    // Metodo que realiza a busca do endereço a partir de um CEP
    public Endereco buscaEndereco(String cep) {
        // Cria a URI para a API do ViaCEP usando o CEP fornecido
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        // Cria um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        // Cria uma requisição HTTP para a URI definida
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            // Envia a requisição e obtém a resposta como String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Converte o corpo da resposta JSON em um objeto da classe Endereco usando Gson
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            // Caso ocorra erro de IO ou a thread seja interrompida, lança exceção
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP");
        }


    }
}
