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
public class Corrente extends Conta {
    private float mensalidade;

    public Corrente(String nome, String cpf, int agencia, int numConta) {
        super(nome, cpf, agencia, numConta);
        this.mensalidade = 10.00f;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    @Override
    public void sacar(float valor){
        if (this.getSaldo() > valor){
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    @Override
    public void depositar(float valor){
        this.setSaldo(this.getSaldo() +valor);
    }
    
    public void pagarMensalidade(){
        if (this.getSaldo() > this.mensalidade){
            this.setSaldo(this.getSaldo() - mensalidade);
        } else {
            System.out.println("Saldo infuciciente para pagar a mensalidade.");
        }
    }
}
