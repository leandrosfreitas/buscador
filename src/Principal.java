// Importa a classe Scanner para ler a entrada do usuário via console
import java.io.IOException;
import java.util.Scanner;

// Classe principal que será executada
public class Principal {

    // Metodo main: ponto de entrada da aplicação
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário pelo terminal
        Scanner leitura = new Scanner(System.in);

        // Exibe uma mensagem pedindo ao usuário para digitar um CEP
        System.out.println("Digite um CEP para busca");

        // Lê a linha digitada pelo usuário e armazena na variável numCep
        var numCep = leitura.nextLine();

        // Cria um objeto da classe ConsultaCep para buscar o endereço
        ConsultaCep consulta = new ConsultaCep();

        try {
            // Realiza a busca do endereço a partir do CEP fornecido
            Endereco novoEndereco = consulta.buscaEndereco(numCep);

            // Exibe o endereço retornado no console
            System.out.println(novoEndereco);

            // Cria um gerador de arquivo e salva o endereço como um JSON
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e) {
            // Trata possíveis exceções: erro na consulta ou ao salvar o arquivo
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
