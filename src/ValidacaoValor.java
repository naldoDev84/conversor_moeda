import config.excesao.ExceptionConvertion;

public class ValidacaoValor {
    public static String  validarValor(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new ExceptionConvertion("O valor não pode estar vazio");
        }

        try {
            double numero = Double.parseDouble(valor);
            if (numero <= 0) {
                throw new ExceptionConvertion("O valor não pode sre negativo ou zero.");
            }
            return String.valueOf(numero);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Digite apenas números válidos");
        }
    }
}
