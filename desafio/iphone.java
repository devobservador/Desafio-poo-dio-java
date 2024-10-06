package desafio;
import java.util.Scanner;

public class iphone implements AparelhoTelefonico,NavegadorDeInternet,ReprodutorMusical  {
	
	boolean ligado;
	int numeroDepaginas;
	String musica;
	
	Scanner scanner = new Scanner(System.in);
	
	public iphone(boolean ligado) {
		this.ligado = ligado;
		
	}
	@Override
	public void Ligar(String numero) {
		if(ligado==true) {
			System.out.println("O numero " +numero  + "está te ligando");
		
		}else {
			System.out.println("Impossivel ligar, telefone está desligado !");
		}
	   	
	}

	@Override
	public void Atender() {
		if(ligado==true) {
			System.out.println("Alguém está te ligando.");
			
		}else {
			System.out.println("Impossivel receber ligações");
		}
		
	}

	@Override
	public void IniciarCorreioVoz() {
		System.out.println("Inicie o Correio de Voz");
		
		
	}

	@Override
	public void axibirPagina(String url) {
		if(ligado==true) {
			System.out.println("Site encontrado é " +url);
		
			numeroDepaginas++;
			System.out.println("Numero de paginas abertas : " +numeroDepaginas);
			System.out.println("Site exibido é " + url);
		}else {
			System.out.println("Site não encontrado !!");
		}
		
	}

	@Override
	public void AdicionarNovaAba() {
		numeroDepaginas++;
		System.out.println("Abrindo a nova aba, numero de paginas abertas   " +numeroDepaginas);
		
		
	}

	@Override
	public void AtualizarPagina() {
		
		
	}

	@Override
	public void Tocar() {
		if(ligado==true) {
			System.out.println("Tocando.. :");
			
			
		}else {
			System.out.println("Impossivel tocar algo");	
		}
		
	}

	@Override
	public void Pausar() {
		Tocar();
		if(ligado==true) {
			System.out.println("impossivel pausar agora");
			
			
		}else {
			System.out.println("Pause ativado..");
		}
		
	}

	@Override
	public void SelecionarMusicas() {
		System.out.println("Me informe a musica :");
		musica = scanner.next();
		System.out.println("Musica selecionada :" + musica);
	}
	
	
	
	
	

}
