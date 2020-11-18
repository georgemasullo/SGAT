package Pessoa;

import java.util.Calendar;

import Atividade.Atividade;
import AtividadeAluno.AtividadeAluno;
import Controle.Validacao;
import Exception.IntException;
import Exception.StringNulaException;

public class Funcionario extends Pessoa {
	
	private int siape;
	private String funcao;
	private String senha;
	//private Validacao validar;
	
	public Funcionario() {
		//validar=new Validacao();
	}
	//public Funcionario(String funcao){
	//	setFuncao(funcao);
	//}
	
	/*public Funcionario(String nome,String sexo,String CPF,String RG,Calendar dataNascimento,
			String telefone,String rua,String numero,String bairro,String cidade,String email,String siape,String funcao){
		super(nome, sexo, CPF, RG, dataNascimento, telefone, rua, numero, bairro, cidade, email);
		setSiape(siape);
		setFuncao(funcao);
		
	}
	*/
	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) throws IntException{
		if(siape>0){
			this.siape = siape;
		}
		else{
			throw new IntException("Erro Siape");
		}
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) throws StringNulaException {
		if(funcao!=null){
			this.funcao = funcao;
		}
		else{
			throw new StringNulaException("Erro Funçao");
		}
	}
	
	/*public void validar(AtividadeAluno ativ,Atividade atividade){
		validar.validar(this.getNome(), this.getFuncao(), ativ, atividade);
		
	}
	*/
	public String toString(){
		String tudo=super.toString() + "\nSiape: " + getSiape();// + "\nFunçao: " + getFuncao();
		return tudo;
	}
	
	public boolean equals(int siape) {
			if (this.getSiape()==siape){
				return true;
			}
			else{
				return false;
			}
	}
	public boolean equals(String senha) {
		if (getSenha().equals(senha)){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean equalsF(String funcao) {
		if (getFuncao().equals(funcao)){
			return true;
		}
		else{
			return false;
		}
	}
	public String getSenha() {
		return senha;
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Funcionario){
			Funcionario a1 = (Funcionario) obj;
			if (this.siape==a1.getSiape()){
				return true;
			}
		}
		return false;
	}

	public void setSenha(String senha) throws StringNulaException{
		if(senha!=null){
			this.senha = senha;
		}else{
			throw new StringNulaException("Erro Senha");
		}
		
	}
}
