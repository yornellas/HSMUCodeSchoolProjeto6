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
public class Investimento extends Conta {
    private float mensalidade;

    public Investimento(String nome, String cpf, int agencia, int numConta) {
        super(nome, cpf, agencia, numConta);
        this.mensalidade = 15.00f;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    @Override
    public void sacar(float valor){
        if (this.getSaldo() < this.getSaldo() * 2){
            System.out.println("Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    
    @Override
    public void depositar(float valor){
        this.setSaldo(this.getSaldo() +valor +valor * 0.01f);
    }
    
    public void pagarMensalidade(){
        if (this.getSaldo() > this.mensalidade){
            this.setSaldo(this.getSaldo() - mensalidade);
        } else {
            System.out.println("Saldo infuciciente para pagar a mensalidade.");
        }
    }
}
