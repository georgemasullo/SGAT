package Controle;

import java.text.DateFormat;
import java.util.*;

import Atividade.Atividade;
import AtividadeAluno.AtividadeAluno;
import Exception.FuncaoInvalidaException;
import Exception.InteiroInvalidoException;
import Exception.StringNulaException;
import Pessoa.Funcionario;

public class Validacao {

	private String data;
	private String nome;
	//private String hora;
	
	
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	private void setData() {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		this.data = (dtHora.format(data));
	}
	/*public void validar(String nome,String funcao,AtividadeAluno ativ, Atividade atividade,int hrs){
		if(funcao=="Coordenador" && (ativ.isValidacao()== false)){
			this.setData();
			this.setNome(nome);
			if(atividade.isFixo()==false){
				atividade.setHrs(hrs);
			}
			ativ.setValidacao(true);
		}
	}
	
	public void validar(String nome,String funcao,AtividadeAluno ativ, Atividade atividade){
		if(funcao=="Coordenador" && (ativ.isValidacao()== false)){
			this.setData();
			this.setNome(nome);
			ativ.setValidacao(true);
		}
	}
	*/
	/*public void validar(Funcionario f,Atividade ati) throws FuncaoInvalidaException{
		Funcionario Coordenador = new Funcionario();
		try {
			Coordenador.setFuncao("Coordenador");
		} catch (StringNulaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Funcionario ADMIN = new Funcionario();
		try {
			ADMIN.setFuncao("ADMIN");
		} catch (StringNulaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.equals(Coordenador) || f.equals(ADMIN) ){
			this.setData();
			this.setNome(f.getNome());
		}
		else{
			throw new FuncaoInvalidaException("Cargo invalido");
		}
	}*/
	public void validar(Funcionario f, Atividade atividade) throws FuncaoInvalidaException{
		if(f.getFuncao()=="Coordenador" || f.getFuncao()=="ADMIN"){
			this.setData();
			this.setNome(f.getNome());
			
		}
		else{
			throw new FuncaoInvalidaException("Cargo invalido");
		}
		//System.out.println("Nao ok");
	}
	@Override
	public String toString() {
		String tudo=""+this.getNome()+""+this.getData();
		return tudo;
	}
}
