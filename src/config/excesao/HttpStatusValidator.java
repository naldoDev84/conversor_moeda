package config.excesao;

public class HttpStatusValidator {
    public static void validar(int status){
        switch (status){
            case 200: break;
            case 400:
                throw new ExceptionConvertion("Status: " + status + "Requisição inválida!");
            case 401:
                throw new ExceptionConvertion("Status: " + status + "Não autorizado!");
            case 404:
                throw new ExceptionConvertion("Status: " + status + "Recurso não encontrado");
            case 429:
                throw new ExceptionConvertion("Status: " + status + "Limite de requisições atingidas");
            default:
                throw new ExceptionConvertion("Status: " + status + "Erro inesperado!");
        }
    }
}