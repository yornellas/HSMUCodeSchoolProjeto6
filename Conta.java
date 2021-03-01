/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodigital;

/**
 *
 * @author Yolanda
 */
public abstract class Conta {
    private String nome;
    private String cpf;
    private int agencia;
    private int numConta;
    private float saldo;

    public Conta(String nome, String cpf, int agencia, int numConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float valor){
        this.saldo = valor;
    }
    
    public void sacar(float valor){
        if (this.saldo > valor){
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo +valor;
    }
}
