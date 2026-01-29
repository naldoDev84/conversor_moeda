import java.io.IOException;
import java.time.LocalDateTime;

public class GerenciadorConversao {
    private final Conversao conversao;
    private final HistoricoTransacoes historicoTransacoes;

    public GerenciadorConversao() {
        this.conversao = new Conversao();
        this.historicoTransacoes = new HistoricoTransacoes();
    }

    public void executarConversao(String moedaOrigem, String moedaDestino, String valor) throws IOException, InterruptedException {
        MoedaConversao moedaConvertida = conversao.fazerConversao(moedaOrigem, moedaDestino, valor);

        Transacao transacao = new Transacao(
                moedaConvertida.base_code(),
                moedaConvertida.target_code(),
                Double.parseDouble(valor),
                Double.parseDouble(moedaConvertida.conversion_result()),
                LocalDateTime.now()
        );

        historicoTransacoes.adicionarTransacao(transacao);
    }

    public void listarTransacoes(){
        historicoTransacoes.listarTransacoes();
    }
}