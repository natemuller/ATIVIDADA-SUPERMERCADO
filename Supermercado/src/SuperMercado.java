import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SuperMercado {

	private List<Caixa> caixas;

	private double faturamento;

	private double perda;

	private int totalClientes;

	private int clientesNaoAtendidos;

	private double menorCompra;

	private double maiorCompra;

	public SuperMercado(int qtdCaixas, int capacidadeCaixa) {

	}

	public void adicionarCaixa() {
		Caixa novoCaixa1 = new Caixa(109050, 10, new LinkedList<Cliente>(), false);
		Caixa novoCaixa2 = new Caixa(109051, 12, new LinkedList<Cliente>(), true);
		Caixa novoCaixa3 = new Caixa(109052, 10, new LinkedList<Cliente>(), true);
		Caixa novoCaixa4 = new Caixa(109053, 10, new LinkedList<Cliente>(), true);
		Caixa novoCaixa5 = new Caixa(109054, 15, new LinkedList<Cliente>(), true);
		Caixa novoCaixa6 = new Caixa(109055, 6, new LinkedList<Cliente>(), true);
		Caixa novoCaixa7 = new Caixa(109056, 20, new LinkedList<Cliente>(), false);
		Caixa novoCaixa8 = new Caixa(109057, 10, new LinkedList<Cliente>(), true);
		Caixa novoCaixa9 = new Caixa(109058, 10, new LinkedList<Cliente>(), true);
		Caixa novoCaixa10 = new Caixa(109059, 10, new LinkedList<Cliente>(), true);

	}

	public void entrarCliente() {

	}

	public double getFaturamento() {
		return faturamento;
	}

	public double getPerda() {
		return perda;
	}

	public int getTotalClientes() {
		return totalClientes;
	}

	public int getClientesNaoAtendidos() {
		return clientesNaoAtendidos;
	}

	public double getMenorCompra() {
		return menorCompra;
	}

	public double getMaiorCompra() {
		return maiorCompra;
	}

	public List<Caixa> getCaixas() {
		return caixas;
	}

	public int getCaixasDisponiveis() {
		return 0;
	}

	public int getCaixasFuncionando() {
		return 0;
	}

	public int getCaixasIndisponiveis() {
		return 0;
	}

	public void setCaixaFuncionando(int id, boolean estado) {

	}

}
