public class ContaCorrente {
    double saldo;
    double valor;
    Cliente cliente;
    public void  depositar (double valor){
        this.saldo = this.saldo +valor;
    }
    public  double getSaldo(){
        return saldo;
    }
}
