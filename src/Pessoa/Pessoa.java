package Pessoa;

import java.util.Calendar;

import Exception.StringNulaException;

abstract class Pessoa {
	
	private String nome;
	//private String sexo;
	private String CPF;
	private String RG;
	//private Calendar dataNascimento;
	//private String telefone;
	//private String endereco;
	//private String email;
	
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	/*public Pessoa(String nome,String CPF,String RG,Calendar dataNascimento,
					String telefone,String rua,String numero,String bairro,String cidade,String email){
		setNome(nome);
		//setSexo(sexo);
		setCPF(CPF);
		setRG(RG);
		//setDataNascimento(dataNascimento);
		//setTelefone(telefone);
		//setEndereco(rua, numero, bairro, cidade);
		//etEmail(email);
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
	/*public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}*/
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) throws StringNulaException{
		if(CPF!=null){
			this.CPF = CPF;
		}
		else{
			throw new StringNulaException("Erro CPF");
		}
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}
	/*
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String rua,String numero,String bairro,String cidade) {
		this.endereco = rua+","+numero+","+bairro+","+cidade;
	}
	*/
	public String toString(){
		String tudo="\nNome: " + getNome() + "\nCPF: " + getCPF() + "\nRG: "
								+ getRG() ;
		return tudo;
	}
	
	
}
