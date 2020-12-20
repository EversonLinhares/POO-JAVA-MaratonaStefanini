package br.com.maratona.dev;

public abstract class Conta {
	
	private Integer conta;
	private Integer agencia;
	private Double saldo;
	private StatusConta status;
	private Long codigoPix;
	private Double valorSaque;
	
	
	
	
	public Long getCodigoPix() {
		return codigoPix;
	}
	public void setCodigoPix(Long codigoPix) {
		this.codigoPix = codigoPix;
	}
	
	public void setStatus(StatusConta status) {
		this.status = status;
	}
    
	public StatusConta getStatus() {
		return status;
	}
	
	public Integer getConta() {
		return conta;
	}
	public void setConta(Integer conta) {
		this.conta = conta;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
    
	
	public Double getValorSaque() {
		return valorSaque;
	}
	public void setValorSaque(Double valorSaque) {
		this.valorSaque = valorSaque;
	}
	public void sacar(Double valorSaque) {
		System.out.println("PAI");
		this.saldo = this.saldo - valorSaque;
		
	}
	
	
}
