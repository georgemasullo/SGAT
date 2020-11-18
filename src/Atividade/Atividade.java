package Atividade;

import Exception.HorasInvalidasException;
import Exception.StringNulaException;

public class Atividade {
/*	Atividade que vai ser cad.
 */
	private String nome;
	private double hrs;// total de horas da atividade
	//private int totalHrR;
	private boolean isFixo;
	private boolean isPeriodo;
	private String acao;
	public Atividade(){
		setFixo(true);
		setPeriodo(false);
		//totalHrR=0;
	}
	
	
	/*public int getTotalHrR() {
		return totalHrR;
	}
	*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws StringNulaException{	
			if(nome!=null){
				this.nome = nome;
			}
			else{
				throw new StringNulaException("Erro Nome");
			}
		
		}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) throws HorasInvalidasException{
		if(hrs>0){
			this.hrs = hrs;	
		}
		else{
			throw new HorasInvalidasException("Erro Horas");
		}
		
	}	
	/*public void calcTotalHrsR(int evento){
		this.totalHrR=this.hrs*evento;
	}
	*/
	public boolean isFixo() {
		return isFixo;
	}

	public void setFixo(boolean isFixo) {
		this.isFixo = isFixo;
	}

	public boolean isPeriodo() {
		return isPeriodo;
	}

	public void setPeriodo(boolean isPeriodo) {
		this.isPeriodo = isPeriodo;
	}
	//public void calculaCredito(int creditos){
		
	//}
	public String toString(){
		String tudo =  getNome();// + "\nHoras: " + getHrs() + "\nFixo: " + isFixo() + "\nPeriodo: " + getNome();
		return tudo;
	}


	public String getAcao() {
		return acao;
	}


	public void setAcao(String acao) {
		this.acao = acao;
	}
}
