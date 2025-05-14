# 📦 Consulta de Endereço por CEP (Java + ViaCEP)

Este é um projeto simples em Java que permite consultar dados de endereço a partir de um **CEP** utilizando a API gratuita do [ViaCEP](https://viacep.com.br/).

Agora, o projeto também salva os dados retornados em um arquivo `.json` formatado, com o nome baseado no CEP consultado.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- API HTTP nativa (`java.net.http`)
- Biblioteca [Gson](https://github.com/google/gson) para conversão de JSON
- API pública ViaCEP

---

## 📌 Funcionalidades

- Leitura de um CEP digitado pelo usuário via terminal
- Consulta automática à API ViaCEP
- Conversão da resposta JSON em um objeto Java
- Exibição do endereço correspondente no console
- **Geração de um arquivo `.json` com os dados do endereço**

---

## 📂 Estrutura do projeto
