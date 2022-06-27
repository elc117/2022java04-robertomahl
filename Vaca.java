package pratica;

public class Vaca extends Animal {

	private String nome;
	
	public Vaca(String alimento, String nome) {
		super(alimento);
		this.nome = nome;
	}
	
	public void mujir() {
		System.out.println(nome.concat(" disse: \n-Muuuuuuuuuuu."));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
