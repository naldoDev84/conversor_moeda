# 💱 Conversor de Moedas - Java

Aplicação Java console que consome a **ExchangeRate API** para realizar conversões de moedas em tempo real, mantendo também um **histórico de transações**.

Projeto criado com foco em **prática de backend Java**, consumo de API externa, organização em camadas e boas práticas de código.

---
## 🚀 Funcionalidades

✅ Conversão de moedas em tempo real  
✅ Consumo de API REST externa  
✅ Validação de entrada do usuário  
✅ Histórico de transações  
✅ Logging com SLF4J  
✅ Separação de responsabilidades (Controller / Service-like / Model)

---

## 🛠️ Tecnologias

- Java 17+
- HttpClient (Java nativo)
- Gson (JSON parsing)
- dotenv-java (variáveis de ambiente)
- SLF4J (logging)
---
## 📦 Estrutura do Projeto

src/<br>
├─ consumo da API (Conversao) <br>
├─ orquestra regras (GerenciadorConversao)<br>
├─ histórico de transações<br>
├─ records e entidades<br>
└─ ui/ → Main (menu/console)

## ⚙️ Configuração
Este projeto utiliza variáveis de ambiente para proteger a chave da API.

### 1. Obter a chave da API
Crie uma conta gratuita em:
https://www.exchangerate-api.com/
---

### 2. Criar arquivo `.env`

Na raiz do projeto, crie um arquivob .env:


```cp .env .env ```

### 3. Adicione sua chave:
EXCHANGE_API_KEY=SUA_CHAVE_AQUI

---
▶️ Executando
IntelliJ

 - Abrir projeto
 - Rodar classe Main


## 🔒 Importante
O arquivo `.env` **não é versionado** por segurança. Por isso a necessidade da criação 
manual do arquivo .env no diretório raiz do projeto
---
👨‍💻 Autor

Erinaldo Raimundo da Silva
Backend Java Developer

