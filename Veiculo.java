package pratica;

/**
 *
 * Exemplos de classes derivadas: Motocicleta, Ônibus, Carro.
 * 
 * @author Roberto
 *
 */
public class Veiculo {

	protected int qtdRodas;
	protected int qtdMaximaPassageiros;
	protected int qtdAssentosOcupados;
	
	public Veiculo(int qtdRodas, int qtdPassageiros) {
		this.qtdRodas = qtdRodas;
		this.qtdMaximaPassageiros = qtdPassageiros;
		this.qtdAssentosOcupados = 0;
	}
	
	public void embarcarPassageiros(int quantidade) {
		if (qtdAssentosOcupados + quantidade <= qtdMaximaPassageiros) {
			qtdAssentosOcupados += quantidade;
			System.out.println("Embarque de " + quantidade + " passageiros realizado com sucesso.");
		} else {
			System.out.println("Veículo cheio.");
		}
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public int getQtdMaximaPassageiros() {
		return qtdMaximaPassageiros;
	}

	public void setQtdMaximaPassageiros(int qtdPassageiros) {
		this.qtdMaximaPassageiros = qtdPassageiros;
	}

	public int getQtdAssentosOcupados() {
		return qtdAssentosOcupados;
	}

	public void setQtdAssentosOcupados(int qtdAssentosOcupados) {
		this.qtdAssentosOcupados = qtdAssentosOcupados;
	}
	
}

class Carro extends Veiculo {
	private int codigo;
	private String modelo;
	private String cor;

	public Carro(int codigo, String modelo, String cor, int qtdRodas, int qtdPassageiros) {
		super(qtdRodas, qtdPassageiros);
		this.codigo = codigo;
		this.modelo = modelo;
		this.cor = cor;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getCor() {
		return this.cor;
	}

}
