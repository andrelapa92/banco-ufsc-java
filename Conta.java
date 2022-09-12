/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fullstack.ufsc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class Conta implements ElementosDoBanco {
    
    // conta comum = {numero, data abertura, status, senha, saldo, titular da conta
    protected int numero;
    protected String dataAbertura;
    private boolean status;
    private String senha;
    protected float saldo;
    protected float taxa;
    protected String tipo = "Conta Comum";
    
    protected Pessoa titular;
    
    protected List<Movimento> movimentoConta;
    
    public Conta (int numero, String dataAbertura, boolean status, String senha, float saldo, Pessoa titular) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.status = status;
        this.senha = senha;
        this.saldo = saldo;
        
        this.titular = titular;
        
        this.movimentoConta = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
        
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }  
    
    public Pessoa getTitular() {
        return titular;
    }
    
    public void setTaxa(float valor) {
        this.taxa = valor;
    }
    
    public float getTaxa(float valor) {
        return valor;
    }
    
    
    public void deposito (float d) {
        if (d > 0f) {
            this.saldo = saldo + d;
            this.movimentoConta.add(new Movimento("Deposito", d));
        }
    }
    
    public void deposito (int d) {
        if (d > 0) {
            this.saldo = saldo + d;
            this.movimentoConta.add(new Movimento("Deposito", d));
        }
    }
    
    public void saque (float s) {
        if (s < saldo) {
            this.saldo = saldo - s;
            this.movimentoConta.add(new Movimento("Saque", s));
        }
    }
    
    public void saque (int s) {
        if (s <= saldo) {
            this.saldo = saldo - s;
            this.movimentoConta.add(new Movimento("Saque", s));
        }
    }
    
    public void atualizaTaxa() {
        this.taxa = 20f;
        this.saldo = saldo - taxa;
        this.movimentoConta.add(new Movimento("Taxa", taxa));
    }
    
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
        
    }
    
    @Override
    public String toString(){
        return "Conta: [numero=" + this.getNumero() + ", dataAbertura=" + this.getDataAbertura() + ", status=" + this.isStatus() + ", senha=" + this.getSenha() + ", saldo=" + this.getSaldo()
                + ", titular=" + this.getTitular()
                + ", movimentos=" + this.movimentoConta + "]";
    }

    @Override
    public String getElementoInfo() {
        return this.toString();
    }
    
    
}
