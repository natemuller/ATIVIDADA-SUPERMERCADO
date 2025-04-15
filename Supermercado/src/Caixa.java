import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;

public class Caixa {

	private int idCaixa;

	private int capacidadeMaxima;

	private Queue<Cliente> fila;

	private boolean emFuncionamento;

	public Caixa(int idCaixa, int capacidadeMaxima, Queue<Cliente> fila, boolean emFuncionamento) {
		this.idCaixa = idCaixa;
		this.capacidadeMaxima = capacidadeMaxima;
		this.fila = new LinkedList<Cliente>();
		this.emFuncionamento = false;
	}

	public void atender() {
		if (!fila.isEmpty() && emFuncionamento) {
			Random random = new Random();
			boolean atendimentoConcluido = random.nextBoolean(); 
			if (atendimentoConcluido) {
				Cliente clienteAtendido = fila.remove(); 
				System.out.println("atendimento no caixa " + idCaixa + " no valor de " + clienteAtendido.getValorCompra());
			}
		}
	}

	public boolean isDisponivel() {
		return emFuncionamento && (fila.size() < capacidadeMaxima);
	}

	public int getIdCaixa() {
		return idCaixa;
	}

	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public Queue<Cliente> getFila() {
		return fila;
	}

	public int getTamanhoFila() {
		return 0;
	}

	public boolean isFuncionando() {
		return false;
	}

	public void setFuncionamento(boolean estado) {

	}

	public void adicionarCliente(Cliente cliente) {
		if (isDisponivel()) {
			fila.add(cliente);
		}
	}
}
