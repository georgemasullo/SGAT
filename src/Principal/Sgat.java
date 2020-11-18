package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;

import Atividade.Atividade;
import Atividade.Categoria;
import AtividadeAluno.AtividadeAluno;
import Exception.FuncaoInvalidaException;
import Exception.IntException;
import Exception.InteiroInvalidoException;
import Exception.StringNulaException;
import Exception.ValidacaoInvalidaException;
import Pessoa.Aluno;
import Pessoa.Funcionario;

public class Sgat {

	public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static ArrayList<Aluno> atividadeInvalid=new ArrayList<Aluno>();
	public static String[] opcoesIniciais = {"1 - Acessar",
											 "0 - Sair"};
	public static String[] admin={"1 - Validar Atividades",
								  "2 - Cadastrar Aluno",
								  "3 - Acessar Aluno",
								  "4 - Cadastrar Funcionario",
								  "0 - Voltar"};
	public static String[] coor={"1 - Validar Atividades",
								 "2 - Cadastrar Aluno",
								 "3 - Acessar Aluno",
								 "0 - Voltar"};
	public static String[] sec={"1 - Cadastrar Aluno",
		 						"2 - Acessar Aluno",
		 						"0 - Voltar"};
	public static String[] asc={"1 - Mostrar Atividades Cadastradas",
								"2 - Cadastrar Atividade",
								"3 - Exibir",
								"0 - Voltar"};
	public static void admin(){
		Funcionario f = new Funcionario();
		try {
			f.setNome("ADMIN");
			f.setFuncao("ADMIN");
			f.setSiape(123);
			f.setSenha("123");
		} catch (StringNulaException | IntException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		funcionarios.add(f);
	}
	public static void aluno(){
		Aluno a1 = new Aluno();
		try {
			a1.setNome("alex Frederico");
			a1.setCPF("3409048");
			a1.setRG("90124890");
			a1.setMatricula("1");
		} catch (StringNulaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alunos.add(a1);
	}
	public static void cadastraAluno(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====================================================");
		System.out.println("CADASTRO DE Aluno");
		System.out.println("=====================================================");
		
		Aluno a = new Aluno();
		
		System.out.print("Entre com nome: ");
		String nome = scanner.nextLine();
		try {
			a.setNome(nome);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraAluno();
			return;
		}
		System.out.print("Entre com o RG: ");
		String rg = scanner.nextLine();
		a.setRG(rg);
		
		System.out.print("Entre com o CPF: ");
		String cpf = scanner.nextLine();
		try {
			a.setCPF(cpf);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraAluno();
			return;
		}
		System.out.println("Entre com o número de matricula: ");
		String matricula = scanner.nextLine();
		try {
			for(int i=0;i<alunos.size();i++){
				if(alunos.get(i).equals(matricula)==true){
					System.out.println("Matricula ja existe");
					Sgat.cadastraAluno();
					return;
				}
			}
			a.setMatricula(matricula);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraAluno();
			return;
		}
		/*
		System.out.println("ENTRE COM O CURSO: ");
		String curso = scanner.nextLine();
		a.setCurso(curso);
		
		System.out.println("ENTRE COM O PERÍODO LETIVO DE ENTRADA: ");
		String periodoLetivoDeEntrada = scanner.nextLine();
		a.setPeriodoLetivoDeEntrada(periodoLetivoDeEntrada);
		*/
		Sgat.alunos.add(a);
		System.out.println("Cadastrado com sucesso!!");
	}
	public static void preCadastraAtividadeAluno(Aluno a){
		Categoria c= new Categoria();
		c=Sgat.imprimeCat();
		Sgat.cadastraAtividadeAluno(c.getCat(), Sgat.imprimeAti(c),a);
	}
	public static void cadastraAtividadeAluno(int cat,Atividade ati,Aluno a){
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====================================================");
		System.out.println("CADASTRO DE Atividade");
		System.out.println("=====================================================");
		AtividadeAluno atv= new AtividadeAluno();
		System.out.print("Entre com nome: ");
		String nome = scanner.nextLine();
		try {
			atv.setNome(nome);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraAtividadeAluno(cat, ati, a);
			return;
		}
		System.out.print("Entre com o numero de "+ati.getAcao()+": ");
		int hrs = scanner.nextInt();
		if(ati.getAcao()=="meses"){
			if(hrs>=6){
				atv.setAcao(hrs);
			}
			else{
				Sgat.cadastraAtividadeAluno(cat, ati, a);
			}
		}else{
			atv.setAcao(hrs);
		}

		
		atv.setTotalHoras(ati);
		atv.setCat(cat);
		atv.setAtividade(ati);
		a.setAtividadesR(atv);
	}
	public static void cadastraFuncionario(){
		Scanner scanner = new Scanner(System.in);
		Scanner ent = new Scanner(System.in);
		System.out.println("=====================================================");
		System.out.println("CADASTRO DE Funcionário");
		System.out.println("=====================================================");
		
		
		
		Funcionario f = new Funcionario();
		System.out.print("Entre com o nome: ");
		String nome = scanner.nextLine();
		try {
			f.setNome(nome);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraFuncionario();
			return;
		}
		
		System.out.print("Entre com o RG: ");
		String rg = scanner.nextLine();
		f.setRG(rg);
		
		System.out.print("Entre com o CPF: ");
		String cpf = scanner.nextLine();
		try {
			f.setCPF(cpf);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraFuncionario();
			return;
		}
		
		System.out.print("Entre com o SIAPE: ");
		try {
			int siape = scanner.nextInt();
			for(int i=0;i<funcionarios.size();i++){
				if(funcionarios.get(i).equals(siape)==true){
					System.out.println("SIAPE ja existe");
					Sgat.cadastraFuncionario();
					return;
				}
			}
			f.setSiape(siape);
		} catch ( IntException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			Sgat.cadastraFuncionario();
			return;
		}
		System.out.print("Entre com a Senha: ");
		String senha=ent.nextLine();
		try {
			f.setSenha(senha);
		} catch (StringNulaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			Sgat.cadastraFuncionario();
			return;
		}
		System.out.print("Entre com a função: \n 1 -Coordenador \n 2 - Secretario");
		int funcao = scanner.nextInt();
		if(funcao==1){
			try {
				f.setFuncao("Coordenador");
			} catch (StringNulaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				Sgat.cadastraFuncionario();
				return;
			}
		}
		else if(funcao==2){
			try {
				f.setFuncao("Secretario");
			} catch (StringNulaException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				Sgat.cadastraFuncionario();
				return;
			}
		}
		else{
			//Exception
		}
		Sgat.funcionarios.add(f);
		System.out.println("Cadastrado com sucesso!!");
	}
	/*public static void cadastraCategoria(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====================================================");
		System.out.println("CADASTRO DE Categoria");
		System.out.println("=====================================================");
		
	
		Categoria c = new Categoria();
		
		System.out.print("ENTRE COM O NOME DA CATEGORIA: ");
		String tipo = scanner.nextLine();
		try {
			c.setTipo(tipo);
		} catch (StringNulaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
	*/
	public static void exibeTelaInicial(){		
		System.out.println("=====================================================");
		for (String opcao : Sgat.opcoesIniciais){
			System.out.println(opcao);
		}
		System.out.println("=====================================================");
		System.out.print("Digite uma opção ==> ");
	}

	public static void exibeTelaSec(){		
		System.out.println("=====================================================");
		for (String opcao : Sgat.sec){
			System.out.println(opcao);
		}
		System.out.println("=====================================================");
		System.out.print("Digite uma opção ==> ");
	}
	
	public static void exibeTelaAdm(){		
		System.out.println("=====================================================");
		for (String opcao : Sgat.admin){
			System.out.println(opcao);
		}
		System.out.println("=====================================================");
		System.out.print("Digite uma opção ==> ");
	}
	public static void exibeTelaCoor(){		
		System.out.println("=====================================================");
		for (String opcao : Sgat.coor){
			System.out.println(opcao);
		}
		System.out.println("=====================================================");
		System.out.print("Digite uma opção ==> ");
	}
	public static void exibeTelaAsc(){		
		System.out.println("=====================================================");
		for (String opcao : Sgat.asc){
			System.out.println(opcao);
		} 
		System.out.println("=====================================================");
		System.out.print("Digite uma opção ==> ");
	}
	public static Funcionario verificaSiape(String s){
		for(int i=0;i< funcionarios.size();i++){
			if(funcionarios.get(i).equals(s)==true){
				return funcionarios.get(i);
			}
		}
		return null;
	}
	public static void addAtividadeInvalid(){
		for(int i=0;i<alunos.size();i++){
			for(int j=0;j<alunos.get(i).getTamListaAtividadeAluno();j++){
				if(alunos.get(i).getAtividadesR(j).isValidacao()==0){
						atividadeInvalid.add(alunos.get(i));
						break;	
				}
			}
		}
		for(int i=0;i<atividadeInvalid.size();i++){
			for(int j=i+1;j<atividadeInvalid.size();j++){
				if(atividadeInvalid.get(i).equals(atividadeInvalid.get(j))==true){
					atividadeInvalid.remove(j);
				}
			}
		}
	}
	public static void removeAtividadeInvalid(){
		for(int i=0;i<atividadeInvalid.size();i++){
			int cont=0;
			for(int j=0;j<atividadeInvalid.get(i).getAtividadesR();j++){
				cont++;
			}
			if(cont==atividadeInvalid.get(i).getAtividadesR()){
				atividadeInvalid.remove(i);
			}
		}
		
	}
	public static void imprimirAtividadeInvalid(Funcionario f){
		addAtividadeInvalid();
		int cont =0;
		for(int i=0;i< atividadeInvalid.size();i++){
			System.out.println((i+1)+"-"+atividadeInvalid.get(i));
			cont++;
		}
		if(cont==0){
			System.out.println("Nao tem atividade");
		}else{
		System.out.println("=====================================================");
		System.out.print("Digite uma opção ==> ");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		imprimirAtividadeInvalidas(f,atividadeInvalid.get(opcao-1));
		removeAtividadeInvalid();
		}
	}
	public static void invalidacao(Atividade ativ, Funcionario f,AtividadeAluno at){
		try {
			at.invalida(f, ativ);
		} catch (FuncaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ValidacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InteiroInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void validacao(Atividade ativ, Funcionario f,AtividadeAluno at){
		try {
			at.valida(f, ativ);
		} catch (FuncaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ValidacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InteiroInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void validacaoAlteraHrs(Atividade ativ, Funcionario f,AtividadeAluno at){
		System.out.println("=====================================================");
		System.out.print("Digite um novo valor ==> ");
		Scanner scanner = new Scanner(System.in);
		int novoValor = scanner.nextInt();
		try {
			at.valida(f, ativ,novoValor);
		} catch (FuncaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ValidacaoInvalidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InteiroInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void imprimirAtividadeInvalidas(Funcionario f,Aluno a){
		System.out.println("=====================================================");
		for(int i=0;i< a.getTamListaAtividadeAluno();i++){
			if(a.getAtividadesR(i).isValidacao()==0){
				System.out.println((i+1)+"-"+a.getAtividadesR(i));
			}
		}
		System.out.print("Digite uma opção ==> ");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		System.out.println("0-Invalidar ");
		System.out.println("1-Validar ");
		if(a.getAtividadesR(opcao-1).getAtividade().isFixo()==false){
			System.out.println("2-Validar e alterar horas (Maximo -> "+ a.getAtividadesR(opcao-1).getAtividade().getHrs()+" Horas)" );
			System.out.print("digite a opcao => ");
		}
		int ent=scanner.nextInt();
		Sgat.opValidacao(ent, a.getAtividadesR(opcao-1).getAtividade(), f,a.getAtividadesR(opcao-1));
		
	}
	public static void mostrarAtividadesAlunos(Aluno a){
		for(int j=0;j<alunos.size();j++){
			if(a.equals(alunos.get(j))){
				for(int i=0;i<a.getTamListaAtividadeAluno();i++){
					System.out.println(a.getAtividadesR(i));
				}
			}
		}
		
	}
	public static void adm(Funcionario f){
		int opcao=-1;

			do{
				
				Sgat.exibeTelaAdm();
				do{
					Scanner scanner = new Scanner(System.in);
					opcao = scanner.nextByte();
				} while (opcao < 0 && opcao >= Sgat.admin.length);
				Sgat.executaTelaAdm(opcao,f);
			} while (opcao != 0);
		
	}
	public static void preAsc(Funcionario f){
		System.out.println("Digite a matricula ==> ");
		Scanner scanner = new Scanner(System.in);
		String matr = scanner.nextLine();
		Aluno a= new Aluno();
		a=null;
		for(int i=0; i<alunos.size();i++){
			if(alunos.get(i).equals(matr)){
				a=alunos.get(i);
				Sgat.asc(f,a);
			}
		}
		if(a==null){
			System.out.println("Aluno nao encontra.");
		}
	}
	public static void asc(Funcionario f, Aluno a){
		int opcao=-1;
		do{
			
			Sgat.exibeTelaAsc();
			do{
				Scanner scanner = new Scanner(System.in);
				opcao = scanner.nextByte();
			} while (opcao < 0 && opcao >= Sgat.asc.length);
			Sgat.executaTelaAsc(opcao,f,a);
		} while (opcao != 0);
	}
	public static void coor(Funcionario f){
		int opcao=-1;
			do{
				
				Sgat.exibeTelaCoor();
				do{
					Scanner scanner = new Scanner(System.in);
					opcao = scanner.nextInt();
				} while (opcao < 0 && opcao >= Sgat.coor.length);
				Sgat.executaTelaAdm(opcao,f);
			} while (opcao != 0);
	}
	public static void sec(Funcionario f){
		int opcao=-1;
			do{
				Sgat.exibeTelaSec();
				do{
					Scanner scanner = new Scanner(System.in);
					opcao = scanner.nextByte();
				} while (opcao < 0 && opcao >= Sgat.sec.length);
				Sgat.executaTelaSec(opcao,f);
			} while (opcao != 0);
	}
	public static void executaTelaInicial(int opcao, Funcionario f){
		switch (opcao){
		case 1 : Sgat.adm(f);
			     break;
		case 2 : Sgat.coor(f);
		         break;
		case 3 : Sgat.sec(f);
		         break;
		         
		}
	}
	public static void opValidacao(int opcao,Atividade ativ,Funcionario f,AtividadeAluno at){
		switch (opcao){
		case 0 : Sgat.invalidacao(ativ, f,at);
	     		 break;
		case 1 : Sgat.validacao(ativ, f,at);
			     break;
		case 2 : Sgat.validacaoAlteraHrs(ativ, f,at);
		         break;
		         
		}
	}
	public static void executaTelaSec(int opcao,Funcionario f){
		switch (opcao){
		case 1 : Sgat.cadastraAluno();
        	break;
		case 2 : Sgat.preAsc(f);
        	break;
		}
	}
	public static void executaTelaAdm(int opcao,Funcionario f){
		switch (opcao){
		case 1 : Sgat.imprimirAtividadeInvalid(f);
			     break;
		case 2 : Sgat.cadastraAluno();
		         break;
		case 3 : Sgat.preAsc(f);
		         break;
		case 4 : Sgat.cadastraFuncionario();
        break;
		}
	}
	public static void executaTelaCoor(int opcao,Funcionario f){
		switch (opcao){
		case 1 : Sgat.imprimirAtividadeInvalid(f);
			     break;
		case 2 : Sgat.cadastraAluno();
		         break;
		case 3 : Sgat.preAsc(f);
		         break;
		case 4 : Sgat.cadastraFuncionario();
        break;
		}
	}
	public static void executaTelaAsc(int opcao,Funcionario f,Aluno a){
		switch (opcao){
		case 1 : Sgat.mostrarAtividadesAlunos(a);
			     break;
		case 2 : Sgat.preCadastraAtividadeAluno(a);
		         break;
		case 3 : Sgat.exibir(a);
		         break;
		
		         
		}
	}
	public static void executaOpcaoPrincipal(int opcao){
		switch (opcao){
		case 1 : Sgat.telaInicial();
			     break;
		         
		}
	
	}
	public static void exibir(Aluno a){
		System.out.println(a);
		System.out.println("----------------------");
		for(int j=0;j<PreCa.categorias.size();j++){
			for(int i=0;i<PreCa.categorias.get(j).getAtividades();i++){
				for(int h=0;h<a.getAtividadesR();h++){
					if(PreCa.categorias.get(j).getAtividades(i)==a.getAtividadesR(h).getAtividade()){
						a.calcMaxHrsCat(PreCa.categorias.get(j));
					}
				}
				
			}
			
		}
		
		for(int i=0;i<7;i++){
			System.out.println("Cat "+(i+1)+" : "+a.getMaxHrsCat(i));
		}
		System.out.println("Total: "+a.getTotal());
		
	}
	/*public static void imprimeAluno(){
		System.out.println("Digite a matricula ==> ");
		Scanner scanner = new Scanner(System.in);
		String matr = scanner.nextLine();
		for(int i=0; i<alunos.size();i++){
			if(alunos.get(i).equals(matr)){
				System.out.println(alunos.get(i));
				Sgat.imprimeCat();
			}
		}
		
	}
	*/
	public static Categoria imprimeCat(){
		for(int i=0; i<PreCa.categorias.size();i++){
			System.out.println("=========================================");
			System.out.println(PreCa.categorias.get(i));
		}
		System.out.println("=========================================");
		System.out.println("Digite uma opção ==> ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return PreCa.categorias.get(num-1);
		//Sgat.executaOpcaoCat(PreCa.categorias.get(num-1));
	}
	public static Atividade imprimeAti(Categoria c){
		for(int i=0; i<c.tamListaCat();i++){
			//System.out.println("=========================================");
			System.out.println((i+1)+"-"+c.getAtividades(i));
		}
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextByte();
		return c.getAtividades(num-1);
		//Sgat.executaOpcaoCat(num);
	}
	public static void executaOpcaoCat(Categoria c){
		 Sgat.imprimeAti(c);
	}
	public static void telaInicial(){
		Scanner scanner = new Scanner(System.in);
		Scanner entra = new Scanner(System.in);
		System.out.println("Siape:");
		int siape=0;
		try {
			siape = entra.nextInt();
			System.out.println("Senha:");
			String senha = scanner.nextLine();
			for(int i=0;i< funcionarios.size();i++){
				if(funcionarios.get(i).equals(siape) && funcionarios.get(i).equals(senha)){
					if(funcionarios.get(i).equalsF("ADMIN")){
						Sgat.adm(funcionarios.get(i));
					}else if(funcionarios.get(i).equalsF("Coordenador")){
						Sgat.coor(funcionarios.get(i));
					}else{
						Sgat.sec(funcionarios.get(i));
					}
				}
			}
		} catch (Exception e) {
			Sgat.exibeTelaInicial();

		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Sgat.admin();
		Sgat.aluno();
		PreCa pre=  new PreCa();
		int opcao = -1;
		do{
			System.out.println("BEM-VINDO AO SISTEMA SGAT - SELECIONE UMA OPÇÃO DO MENU");
			
		Sgat.exibeTelaInicial();
			do{
				Scanner scanner = new Scanner(System.in);
				opcao = scanner.nextByte();
			} while (opcao < 0 && opcao >= Sgat.opcoesIniciais.length);
			Sgat.executaOpcaoPrincipal(opcao);
	
		} while (opcao != 0);
		System.out.println("Bye, bye!");

	}

}
