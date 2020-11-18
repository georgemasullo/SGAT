package Principal;

import java.util.*;

import Atividade.Atividade;
import Atividade.Categoria;
import Exception.HorasInvalidasException;
import Exception.InteiroInvalidoException;
import Exception.StringNulaException;
public class PreCa {
	
	public static ArrayList<Categoria> categorias= new ArrayList<Categoria>();
	public PreCa() {
		PreCa.tudo();
	}
	public static void tudo(){
		Categoria um= new Categoria();

		try {
			um.setCat(1);
			um.setTipo("Iniciação à pesquisa ou docência ou atividades de extensão em áreas correlatas ao curso");
			um.setMaxHoras(96);
		} catch (StringNulaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (HorasInvalidasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//-------------------------------------------------------------
		Atividade iniciacaoCientifica=new Atividade();
		try {
			iniciacaoCientifica.setNome("Iniciação científica remunerada ou voluntária por semana");
			iniciacaoCientifica.setHrs(4);
			iniciacaoCientifica.setAcao("semana");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		
		um.setAtividades(iniciacaoCientifica);
		//---------------------------------------------------------------
		Atividade monitoria=new Atividade();
		try {
			monitoria.setNome("Monitoria com ou sem bolsa por semana");
			monitoria.setHrs(4);
			monitoria.setAcao("semana");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		
		um.setAtividades(monitoria);
		//---------------------------------------------------------------
		Atividade pet=new Atividade();
		try {
			pet.setNome("Participação em grupo PET por semana");
			pet.setHrs(4);
			pet.setAcao("semana");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		um.setAtividades(pet);
		//---------------------------------------------------------
		Atividade ministrados=new Atividade();
		try {
			ministrados.setNome("Cursos ministrados por semana ou atividade");
			ministrados.setHrs(4);
			ministrados.setAcao("semana atividade");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		um.setAtividades(ministrados);
		//---------------------------------------------------------
		Atividade outras=new Atividade();
		try {
			outras.setNome("Outras Atividades por semana");
			outras.setHrs(1);
			outras.setAcao("semana");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		um.setAtividades(outras);
		categorias.add(um);
		
		//=======================================================
		
		Categoria dois= new Categoria();
		//categorias.add(dois);
		
		try {
			dois.setCat(2);
			dois.setTipo("Atividades artístico-culturais e esportivas vinculadas a UFC");
			dois.setMaxHoras(64);
		} catch (StringNulaException e) {
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				e1.printStackTrace();
			} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		//---------------------------------------------------------------------
		Atividade grupos=new Atividade();
		try {
			grupos.setNome("Grupos de Teatro, Dança, Coral, Literário, Musical ou Equipe Esportiva por evento");
			grupos.setHrs(4);
			grupos.setPeriodo(true);
			grupos.setAcao("evento");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		dois.setAtividades(grupos);
		categorias.add(dois);
		//=============================================================================
		Categoria tres= new Categoria();
		//categorias.add(tres);
		
		try {
			tres.setCat(3);
			tres.setTipo("Atividades de participação e/ou organização de eventos em áreas correlatas");
			tres.setMaxHoras(32);
		}catch (StringNulaException e) {
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				e1.printStackTrace();
		}catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		//---------------------------------------------------------------------------------------
		Atividade pci=new Atividade();
		try {
			pci.setNome("Participação Congresso Internacional por evento");
			pci.setHrs(8);
			pci.setPeriodo(true);
			pci.setAcao("evento");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(pci);
		//-----------------------------------------------------------------------------------------
		Atividade pcn=new Atividade();
		try {
			pcn.setNome("Participação Congresso Nacional por evento");
			pcn.setHrs(4);
			pcn.setPeriodo(true);
			pcn.setAcao("evento");
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(pcn);
		//------------------------------------------------------------------------------------------
		Atividade aaci=new Atividade();
		try {
			aaci.setNome("Apresentação Artigo Congresso Internacional por artigo");
			aaci.setHrs(8);
			aaci.setPeriodo(true);
			aaci.setAcao("artigo");
		
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(aaci);
		
		//-------------------------------------------------------------------------------------------
		Atividade aacn=new Atividade();
		try {
			aacn.setNome("Apresentação Artigo Congresso Nacional por artigo");
			aacn.setHrs(4);
			aacn.setPeriodo(true);
			aacn.setAcao("artigo");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(aacn);
		
		//--------------------------------------------------------------------------------------------
		Atividade seminarios=new Atividade();
		try {
			seminarios.setNome("Participação em Seminários, Colóquios, Palestras por evento");
			seminarios.setHrs(2);
			seminarios.setPeriodo(true);
			seminarios.setAcao("evento");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(seminarios);
		
		//-----------------------------------------------------------------------------------------------
		Atividade oec=new Atividade();
		try {
			oec.setNome("Organização de eventos científicos como presidente ou membros da diretoria por evento");
			oec.setHrs(32);
			oec.setPeriodo(true);
			oec.setFixo(false);
			oec.setAcao("evento");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(oec);
		
		//------------------------------------------------------------------------------------------------
		Atividade oec2=new Atividade();
		try {
			oec2.setNome("Organização de evento do Campus – coordenador ou membro da comissão do evento por evento");
			oec2.setHrs(32);
			oec2.setPeriodo(true);
			oec2.setFixo(false);
			oec2.setAcao("evento");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(oec2);
		
		//------------------------------------------------------------------------------------------------
		Atividade pma=new Atividade();
		try {
			pma.setNome("Participação como monitor ou auxiliar em eventos por dia");
			pma.setHrs(4);
			pma.setPeriodo(true);
			pma.setAcao("dia");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		tres.setAtividades(pma);
		categorias.add(tres);
		//=================================================================================================
		Categoria quatro= new Categoria();
		//categorias.add(tres);
		
		try {
			quatro.setCat(4);
			quatro.setTipo("Experiências ligadas à formação profissional e/ou correlatas");
			quatro.setMaxHoras(64);
			
		}catch (StringNulaException e) {
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				e1.printStackTrace();
		}catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		//-----------------------------------------------------------------------------------------------------
		Atividade dfgc=new Atividade();
		try {
			dfgc.setNome("Disciplinas fora da grade curricular por credito");
			dfgc.setHrs(16);
			dfgc.setPeriodo(true);
			dfgc.setAcao("credito");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		quatro.setAtividades(dfgc);
		//--------------------------------------------------------------------------------------------------------
		Atividade enc=new Atividade();
		try {
			enc.setNome("Estágio Não-Curricular por semana de atividade");
			enc.setHrs(8);
			enc.setPeriodo(true);
			enc.setFixo(false);
			enc.setAcao("semana de atividade");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		quatro.setAtividades(enc);
		categorias.add(quatro);
		//=================================================================================================
		Categoria cinco= new Categoria();
		//categorias.add(tres);
		
		try {
			cinco.setCat(5);
			cinco.setTipo("Produção Técnica e/ou Científica em áreas correlatas");
			cinco.setMaxHoras(96);
			
		}catch (StringNulaException e) {
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				e1.printStackTrace();
		}catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------
		Atividade ari=new Atividade();
		try {
			ari.setNome("Artigo Revista Internacional por artigo");
			ari.setHrs(96);
			ari.setPeriodo(true);
			ari.setFixo(false);
			ari.setAcao("artigo");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		cinco.setAtividades(ari);

		//-----------------------------------------------------------------------------------------------
		Atividade arn=new Atividade();
		try {
			arn.setNome("Artigo Revista Nacional por artigo");
			arn.setHrs(96);
			arn.setPeriodo(true);
			arn.setFixo(false);
			arn.setAcao("artigo");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		cinco.setAtividades(arn);
		
		//----------------------------------------------------------------------------------------------------
		Atividade aci=new Atividade();
		try {
			aci.setNome("Artigo Congresso Internacional por artigo");
			aci.setHrs(72);
			aci.setPeriodo(true);
			aci.setFixo(false);
			aci.setAcao("artigo");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		cinco.setAtividades(aci);
		
		//----------------------------------------------------------------------------------------------------
		Atividade acn=new Atividade();
		try {
			acn.setNome("Artigo Congresso Nacional por artigo");
			acn.setHrs(72);
			acn.setPeriodo(true);
			acn.setFixo(false);
			acn.setAcao("artigo");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		cinco.setAtividades(acn);
		
		//---------------------------------------------------------------------------------------------------
		Atividade patente=new Atividade();
		try {
			patente.setNome("Patente");
			patente.setHrs(96);
			patente.setPeriodo(true);
			patente.setFixo(false);
			patente.setAcao("patente");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		cinco.setAtividades(patente);
		
		//-----------------------------------------------------------------------------------------------------
		Atividade aeu=new Atividade();
		try {
			aeu.setNome("Artigo nos Encontros Universitários por trabalho");
			aeu.setHrs(4);
			aeu.setPeriodo(true);
			aeu.setFixo(false);
			aeu.setAcao("trabalho");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		cinco.setAtividades(aeu);
		categorias.add(cinco);
		//=====================================================================================================
		Categoria seis= new Categoria();
		//categorias.add(tres);
		
		try {
			seis.setCat(6);
			seis.setTipo("Vivências de Gestão");
			seis.setMaxHoras(48);
			
		}catch (StringNulaException e) {
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				e1.printStackTrace();
		}catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		//-----------------------------------------------------------------------------------------------------------
		Atividade pdej=new Atividade();
		try {
			pdej.setNome("Participação Diretoria de Empresa Jr (presidente, vice-pres., diretor) minimo de 6 meses");
			pdej.setHrs(48);
			pdej.setPeriodo(true);
			pdej.setAcao("meses");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		seis.setAtividades(pdej);
		
		//-------------------------------------------------------------------------------------------------------------
		Atividade pej=new Atividade();
		try {
			pej.setNome("Participação em Empresa Jr. minimo de 6 meses");
			pej.setHrs(36);
			pej.setPeriodo(true);
			pej.setAcao("meses");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		seis.setAtividades(pej);
		
		//-----------------------------------------------------------------------------------------------------------
		Atividade pdca=new Atividade();
		try {
			pdca.setNome("Participação Diretoria Centro Acadêmico minimo de 6 meses");
			pdca.setHrs(48);
			pdca.setPeriodo(true);
			pdca.setAcao("meses");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		seis.setAtividades(pdca);
		
		//---------------------------------------------------------------------------------------------------------
		Atividade recc=new Atividade();
		try {
			recc.setNome("Representante Estudantil Conselho de Curso/Campus por reunião");
			recc.setHrs(4);
			recc.setPeriodo(true);
			recc.setAcao("reuniao");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		seis.setAtividades(recc);
		categorias.add(seis);
		//=========================================================================================================
		Categoria sete= new Categoria();
		//categorias.add(tres);
		
		try {
			sete.setCat(7);
			sete.setTipo("Outras atividades");
			sete.setMaxHoras(48);
			
		}catch (StringNulaException e) {
			e.printStackTrace();
		}catch (InteiroInvalidoException e1) {
				e1.printStackTrace();
		}catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------------------------------
		Atividade ia=new Atividade();
		try {
			ia.setNome("Iniciação Acadêmica por semana");
			ia.setHrs(4);
			ia.setPeriodo(true);
			ia.setAcao("semana");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		sete.setAtividades(ia);
		
		//-------------------------------------------------------------------------------------------------------------
		Atividade vps=new Atividade();
		try {
			vps.setNome("Voluntariado em prol da sociedade por hora de atividade");
			vps.setHrs(1);
			vps.setPeriodo(true);
			vps.setAcao("horas");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		sete.setAtividades(vps);
		
		//-------------------------------------------------------------------------------------------------------------
		Atividade ge=new Atividade();
		try {
			ge.setNome("Grupo de Estudo por encontro");
			ge.setHrs(1);
			ge.setPeriodo(true);
			ge.setAcao("encontro");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		sete.setAtividades(ge);
		
		//-------------------------------------------------------------------------------------------------------------
		Atividade cle=new Atividade();
		try {
			cle.setNome("Curso de Língua Estrangeira por hora cursada");
			cle.setHrs(0.5);
			cle.setPeriodo(true);
			cle.setAcao("horas");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		sete.setAtividades(cle);
		
		//------------------------------------------------------------------------------------------------------------
		Atividade cmc=new Atividade();
		try {
			cmc.setNome("Curso e minicursos correlatos por hora cursada");
			cmc.setHrs(1);
			cmc.setPeriodo(true);
			cmc.setAcao("horas");
					
		} catch (StringNulaException e) {
			e.printStackTrace();
		} catch (HorasInvalidasException e) {
			e.printStackTrace();
		}
				
		sete.setAtividades(cmc);
		categorias.add(sete);
	}
	 
	
	
}
