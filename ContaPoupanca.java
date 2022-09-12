/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fullstack.ufsc;

/**
 *
 * @author Andre
 */

// conta poupanca = {numero, data abertura, status, senha, saldo, dia aniversario, dono da conta
public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private float juros;
    
    public ContaPoupanca (int numero, String dataAbertura, boolean status, String senha, float saldo, int diaAniversario, Pessoa titular) {
        super(numero, dataAbertura, status, senha, saldo, titular);
        this.diaAniversario = diaAniversario;
        
        this.tipo = "Conta Poupança";
        
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
    
    
    @Override
    public void saque (float s) {
        if (s < saldo) {
            this.saldo = saldo - s;
            this.movimentoConta.add(new Movimento("Saque", s));
        }
    }
    
    @Override
    public void saque (int s) {
        if (s < saldo) {
            this.saldo = saldo - s;
            this.movimentoConta.add(new Movimento("Saque", s));
        }
    }
    
    @Override
    public void atualizaTaxa() {
        this.taxa = 0f;
        this.juros = (this.saldo * 1.005f) - this.saldo;
        this.movimentoConta.add(new Movimento("Juros", juros));
    }
    
    @Override
    public void relatorio() {
        
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Abertura: " + this.dataAbertura);
        if (isStatus() == true) {            
            System.out.println("Status: Ativa");
        } else {
            System.out.println("Status: Inativa");
        }
        System.out.println("Titular: " + this.titular);
        System.out.println("Movimentos: ");
        for (Movimento m : this.movimentoConta) {
            System.out.println((movimentoConta.indexOf(m) + 1) + "\t" + m.getTipo() + "\t" + m.getValor());
            
        }
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Rendimentos: " + this.juros);
        
    }
    
    @Override
    public String toString(){
        return "ContaPoupança: [diaAniversario=" + this.getDiaAniversario() + ", numero=" + this.getNumero() + ", dataAbertura=" + this.getDataAbertura() + ", status=" + this.isStatus() + ", senha=" + this.getSenha() + ", saldo=" + this.getSaldo()
                + ", titular=" + this.getTitular()
                + ", movimentos=" + this.movimentoConta + "]";
    }
    
    @Override
    public String getElementoInfo() {
    return this.toString();
    }
    
    
}
