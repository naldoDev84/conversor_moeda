import java.time.LocalDateTime;

public record Transacao(
        String origem,
        String destino,
        double valorOriginal,
        double valorConvertido,
        LocalDateTime dataHora) {
}
