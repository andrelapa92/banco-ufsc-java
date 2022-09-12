/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fullstack.ufsc;

/**
 *
 * @author Andre
 */

public class ContaEspecial extends Conta {
    
    // conta especial = {numero, data abertura, status, senha, saldo, limite, dono da conta
    private float limite;
    private float juros;
    
    public ContaEspecial (int numero, String dataAbertura, boolean status, String senha, float saldo, float limite, Pessoa titular) {
        super(numero, dataAbertura, status, senha, saldo, titular);
        this.limite = limite;
        
        this.tipo = "Conta Especial";
        
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
    
    
    @Override
    public void saque (float s) {
        if (s < saldo + limite) {
            this.saldo = saldo - s;
            this.movimentoConta.add(new Movimento("Saque", s));
        }
    }
    
    @Override
    public void saque (int s) {
        if (s < (saldo + limite)) {
            this.saldo = saldo - s;
            this.movimentoConta.add(new Movimento("Saque", s));
        }
    }
    
    @Override
    public void atualizaTaxa() {
        this.taxa = 30f;
        this.saldo = saldo - taxa;
        this.movimentoConta.add(new Movimento("Taxa", taxa));
    }
    
    @Override
    public void relatorio() {
        
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Limite: " + this.limite);
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
    
    }
    
    @Override
    public String toString(){
        return "ContaEspecial: [limite=" + this.getLimite() + ", numero=" + this.getNumero() + ", dataAbertura=" + this.getDataAbertura() + ", status=" + this.isStatus() + ", senha=" + this.getSenha() + ", saldo=" + this.getSaldo()
                + ", titular=" + this.getTitular()
                + ", movimentos=" + this.movimentoConta + "]";
    }
    
    @Override
    public String getElementoInfo() {
    return this.toString();
    }
    
    
}
