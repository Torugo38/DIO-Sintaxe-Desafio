public class ContaBanco {
    private int accNum;
    private String accName;
    private double accSaldo;
    private String agencia;

    public ContaBanco(String agencia, int accNum, String accName, double accSaldo) {
        this.agencia = agencia;
        this.accNum = accNum;
        this.accName = accName;
        this.accSaldo = accSaldo;
    }
    
    public String toString() {
        return "Olá " + accName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + accNum +
                " e seu saldo R$"+ accSaldo + " já está disponível para saque";
    }
}

