package AtividadeAluno;

import java.util.*;

import Atividade.Atividade;
import Controle.Validacao;
import Exception.FuncaoInvalidaException;
import Exception.InteiroInvalidoException;
import Exception.StringNulaException;
import Exception.ValidacaoInvalidaException;
import Pessoa.Aluno;
import Pessoa.Funcionario;
public class AtividadeAluno {
/* 'G' de ganha;
 * depois colocar validacao
 */
	private int cat;
	private String nome;
	private String dataIni;
	private double totalHoras;//horas feitas
	private double totalHoraG;
	private int validacao;
	private int acao;
	private Validacao valida;
	private Atividade atividade; 
	
	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public AtividadeAluno() {
		valida= new Validacao();
		atividade= new Atividade();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws StringNulaException {
		if(nome!=null){
			this.nome = nome;
		}
		else{
			throw new StringNulaException("Erro Nome");
		}
	}
	public String getDataIni() {
		return dataIni;
	}
	public void setDataIni(String dia,String mes,String ano) {
		this.dataIni = dia+"/"+mes+"/"+ano;
	}
	public double getTotalHoras() {
		return totalHoras;
	}
	public void setTotalHoras(Atividade ati) {
		this.totalHoras = ati.getHrs()* this.getAcao();
		//this.calcHrsG(ati);
	}
	public double getTotalHoraG() {
		return totalHoraG;
	}
	public int isValidacao() {
		return validacao;
	}
	public void setValidacao(int validacao) throws InteiroInvalidoException {
		if(validacao>=0 && validacao<=2){
			this.validacao = validacao;
		}else{
			throw new InteiroInvalidoException("ERRO");
		}
		
	}
	public int getCat() {
		return cat;
	}
	public void setCat(int cat) {
		this.cat = cat;
	}
	/*
	 * calcHrsG= guarda o total de horas que ele ganhou
	 * 
	 */
	private void calcHrsG(Atividade ati){
		//if(this.getTotalHoras()<= ati.getHrs()){ //vê se estar diacordo com as hoas da atvidade
			this.totalHoraG=this.getTotalHoras();
		//}
		//else{
		//	this.totalHoraG=ati.getHrs();
		//}
		
	}
	private void calcHrsG(int novaHrs){
		if(this.getTotalHoras()<= novaHrs){ //vê se estar diacordo com as hoas da atvidade
			this.totalHoraG=this.getTotalHoras();
		}
		else{
			this.totalHoraG=novaHrs;
		}
		
	}
	public void valida(Funcionario f,Atividade ati) throws FuncaoInvalidaException, ValidacaoInvalidaException, InteiroInvalidoException{
		if(this.isValidacao()== 0){
			valida.validar(f, ati);
			this.setValidacao(1);
			this.calcHrsG(ati);
		}else{
			throw new ValidacaoInvalidaException("JA ocorreu validação");
		}
	}
	public void invalida(Funcionario f,Atividade ati) throws FuncaoInvalidaException, ValidacaoInvalidaException, InteiroInvalidoException{
		if(this.isValidacao()== 0){
			valida.validar(f, ati);
			this.setValidacao(2);
		}else{
			throw new ValidacaoInvalidaException("JA ocorreu validação");
		}
	}
	public void valida(Funcionario f,Atividade ati,int novoValor) throws FuncaoInvalidaException, ValidacaoInvalidaException, InteiroInvalidoException{
		if(this.isValidacao()== 0){
			if(novoValor>=0 && novoValor<= ati.getHrs()){
				if(ati.isFixo()==false){
					valida.validar(f, ati);
					this.setValidacao(1);
					//this.setAcao(novoValor);
					this.calcHrsG(novoValor);
				}
				else{
					//exception
				}
			}else{
				throw new InteiroInvalidoException("novo valor invalido");
			}
		}else{
			throw new ValidacaoInvalidaException("JA ocorreu validação");
		}
	}
	public String toString(){
		String tudo;
		if(this.validacao==1){
			tudo= "Nome: " + getNome() + "\nHoras Feitas: " + getTotalHoras()+"\nValidado por: " + valida.getNome()+ "\n--------------------";
		}else if(this.validacao==2){
			tudo= "Nome: " + getNome() + "\nHoras Feitas: " + getTotalHoras()+"\nInvalidado por: "+valida.getNome()+"\n--------------------";
		}else{
			tudo= "Nome: " + getNome() + "\nHoras Feitas: " + getTotalHoras()+"\n--------------------";
		}
		return tudo;
	}

	public int getAcao() {
		return acao;
	}

	public void setAcao(int acao) {
		this.acao = acao;
	}
	
}
