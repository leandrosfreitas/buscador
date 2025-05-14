// Declara um "record" chamado Endereco, que é uma forma concisa de criar uma classe imutável em Java
public record Endereco(String cep, String logradouro, String complemento,
                       String bairro, String localidade, String uf) {

}
