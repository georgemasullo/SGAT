package Pessoa;

import java.util.*;

import Atividade.Categoria;
import AtividadeAluno.AtividadeAluno;
import Exception.StringNulaException;
public class Aluno extends Pessoa {

	private String matricula;
	//private String curso;
	//private String periodoLetivoDeEntrada;
	private ArrayList<AtividadeAluno> atividadesR= new ArrayList<AtividadeAluno>();
	private double maxHrsCat []= new double [7];
	//private int indice;
	private double total;
	
	
	public double getMaxHrsCat(int i) {
		return maxHrsCat[i];
	}

	public int getTamListaAtividadeAluno() {
		return this.atividadesR.size();
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) throws StringNulaException {
		if(matricula!= null){
			this.matricula = matricula;
		}
		else{
			throw new StringNulaException("Erro na matricula");
		}
	}
	
	/*public String getPeriodoLetivoDeEntrada() {
		return periodoLetivoDeEntrada;
	}
	
	public void setPeriodoLetivoDeEntrada(String periodoLetivoDeEntrada) {
		this.periodoLetivoDeEntrada = periodoLetivoDeEntrada;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}*/

	public AtividadeAluno getAtividadesR(int indice) {
				return atividadesR.get(indice);
	}
	public int getAtividadesR() {
		return atividadesR.size();
	}
	public void setAtividadesR(AtividadeAluno ati) {
			this.atividadesR.add(ati);
	}
	public double getTotal() {
		return total;
	}
	//Total de hrs do aluno
	private void setTotal(double total) {
		this.total = total;
	}
	private void addMaxHrsCat(double a, int i){
		this.maxHrsCat[i-1]=a;
		//this.indice++;
	}
	
	public void calcMaxHrsCat(Categoria c){
		double maxHrs=0;
		for(int i=0; i<atividadesR.size();i++){
			
			if(c.getCat()== atividadesR.get(i).getCat() && atividadesR.get(i).isValidacao()==1){
					maxHrs=atividadesR.get(i).getTotalHoraG()+maxHrs;
			}
			/*if(c.verifica(atividadesR.get(i))==true){
					maxHrs=atividadesR.get(i).getTotalHoraG()+maxHrs;
				}
				*/
		}
		if(maxHrs<= c.getMaxHoras()){
			this.addMaxHrsCat(maxHrs,c.getCat());
			//this.calcTotal();
		}
		else{
			this.addMaxHrsCat(c.getMaxHoras(),c.getCat());
			//this.calcTotal();
		}
		this.calcTotal();
	}
	public void calcTotal(){
		double aux=0;
		for(int i=0; i< maxHrsCat.length;i++){
			aux=(aux+ maxHrsCat[i]);
		}
		this.setTotal(aux);
	}
	public boolean equals(String matricula) {
		if (matricula == null){
			return false;
		}else {
			if (this.getMatricula().contains(matricula)){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public String toString(){
		String tudo= super.toString() + "\nMatricula: " + getMatricula();
		return tudo;
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Aluno){
			Aluno a1 = (Aluno) obj;
			if (this.matricula.equals(a1.getMatricula())){
				return true;
			}
		}
		return false;
	}
}
	
