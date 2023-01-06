package heranca;

public class funcionario extends gerente{
		public String suborfinada;
		public String superior;
		public funcionario(String nome, String cargo, String suborfinada, String superior) {
		
			super(nome, cargo);
			this.suborfinada = suborfinada;
			this.superior = superior;
		}
		public String getSuborfinada() {
			return suborfinada;
		}
		public void setSuborfinada(String suborfinada) {
			this.suborfinada = suborfinada;
		}
		public String getSuperior() {
			return superior;
		}
		public void setSuperior(String superior) {
			this.superior = superior;
		}
		public void imprintInfo() {
			System.out.println("\nNome: "+getNome());
			System.out.println("Cargo: "+getCargo());
			System.out.println("Inferior a: "+getSuborfinada());
			System.out.println("Superior a: "+getSuperior());
		}
		
		
}
