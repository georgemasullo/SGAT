package Atividade;
import java.util.*;
import Exception.InteiroInvalidoException;
import AtividadeAluno.AtividadeAluno;
import Exception.HorasInvalidasException;
import Exception.StringNulaException;
public class Categoria {
	
	private int cat;
	private String tipo;
	private int maxHoras;
	private ArrayList<Atividade> atividades= new ArrayList<Atividade>();
	
	public Categoria(){
		
	}
	/*public Categoria(int cat, String tipo, int maxHoras){
		setCat(cat);
		setTipo(tipo);
		setMaxHoras(maxHoras);
	}*/
	public Atividade getAtividades(int i) {
		Atividade aux=atividades.get(i);
		return aux;
	}
	public int getAtividades() {
		return atividades.size();
	}
	public void setAtividades(Atividade atividade) {
		this.atividades.add(atividade);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) throws StringNulaException{
		if(tipo!=null){
			this.tipo = tipo;
		}
		else{
			throw new StringNulaException("Erro tipo");
		}
	}
	public int getMaxHoras() {
		return maxHoras;
	}
	public void setMaxHoras(int maxHoras) throws HorasInvalidasException{
		if(maxHoras>0){
			this.maxHoras = maxHoras;
		}
		else{
			throw new HorasInvalidasException("Erro Maximo de Horas");
		}
	} 
	public int getCat() {
		return cat;
	}
	public void setCat(int cat) throws InteiroInvalidoException{
		if(cat>0){
			this.cat = cat;
		}
		else{
			throw new InteiroInvalidoException("Erro categoria");
		}
	}
	public void listar(){
		for(int i= 0; i<atividades.size();i++){
			Atividade aux=atividades.get(i);
			System.out.println("nome: "+aux.getNome());
			System.out.println("horas: "+aux.getHrs());
		}
	}
	/*public boolean verifica(Object ati){
		for(int i=0; i<atividades.size();i++){
			if(atividades.get(i).getCat()== ((Atividade) ati).getNome()){
				return true;
			}
		}
		return false;
	}
	*/
	public int tamListaCat(){
		return this.atividades.size();
	}
	public String toString(){
		String tudo = getCat() + " -> " + getTipo() + "\nMaximo de Horas: " + getMaxHoras() ;
		return tudo;
	}
}
