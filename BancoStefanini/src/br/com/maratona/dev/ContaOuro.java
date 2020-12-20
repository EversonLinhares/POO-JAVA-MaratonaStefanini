package br.com.maratona.dev;

public class ContaOuro extends Conta implements ContaPrivate,Emprestimo {
    //taxa 0.99
	public void saqueExtra(){
		
	}

	@Override
	public void saqueExtra(Float taxa) {
		// 0.99
		
	}
	@Override
	public void emprestimo(Float taxa) {
		// TODO Auto-generated method stub
		
	}
	
}
