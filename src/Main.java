import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100);
        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(200);

        List contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);

        System.out.println("O tamanho da lista de conta é " + contas.size());
        for (int i = 0; i< contas.size(); i++){
            ContaCorrente contaTeste =(ContaCorrente)contas.get(i);
            System.out.println("O valor do saldo da conta é: " + contaTeste.getSaldo() );
        }
    }
}