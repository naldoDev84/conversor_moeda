import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacoes {
    private final List<Transacao> listaTransacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        listaTransacoes.add(transacao);
    }

    public void listarTransacoes() {
        if (listaTransacoes.isEmpty()){
            System.out.println("Nenhuma transação realizada");
            return;
        }

        System.out.println("***** Lista de transações: *****");
        listaTransacoes.forEach(System.out::println);
        System.out.println("Qtde de transações: " + listaTransacoes.size());
    }
}
