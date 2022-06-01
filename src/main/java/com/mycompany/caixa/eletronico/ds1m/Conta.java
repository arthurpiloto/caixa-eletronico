package com.mycompany.caixa.eletronico.ds1m;
public class Conta {
    
    /* DECLARAÇÃO DE ATRIBUTOS:
    1 - VISIBILIDADE:
        1.1 - PUBLIC
        1.2 - PROTECTED
        1.3 - PRIVATE
    2 - TIPO DO DADO
    3 - NOME
    4 - VALOR (OPCIONAL) */    
    private String agencia = "ag-123";
    private String conta = "1234-5678";
    private double saldo = 10000;
    
    /* MÉTODOS FUNCIONAIS DA CLASSE CONTA */
    // MÉTODO verificarSaldo
    public double verificarSaldo(){
        return getSaldo();
    }
    
    /// MÉTODO realizarDeposito
    public void realizarDeposito(double valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
    }
    
    /// MÉTODO realizarSaque
    public void realizarSaque(double valorSaque){
        setSaldo(getSaldo() - valorSaque);
    }
    
    /* MÉTODOS DE GET E SET DA CLASSE CONTA */
    /* DECLARAÇÃO DOS MÉTODOS DE GET: */
    // MÉTODO getAgencia
    public String getAgencia(){
        return agencia;
    }
    
    // MÉTODO getConta
    public String getConta(){
        return conta;
    }
    
    // MÉTODO getSaldo
    public double getSaldo(){
        return saldo;
    }
    
    /* DECLARAÇÃO DOS MÉTODOS DE SET: */
    // MÉTODO setAgencia
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    // MÉTODO setConta
    public void setConta(String conta){
        this.conta = conta;
    }
    
    // MÉTODO setSaldo
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}