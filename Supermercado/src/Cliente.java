public class Cliente {

	private double valorCompra;

	public Cliente(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorCompra() {
		if (valorCompra < 0) {
			valorCompra = 0;
		}
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {

	}

}
