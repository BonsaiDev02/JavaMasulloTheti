package ListinoCatalogo;

	public class Telefono {
		
		private String marca;
		private String cpu;
		private int ram;
		private int memory;
		private int autonomia;
		
		public Telefono() {
			setMarca("Valore costruttore");
			setCpu("Valore costruttore");
			setRam(0);
			setMemory(0);
			setAutonomia(0);
	}

		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getMemory() {
			return memory;
		}
		public void setMemory(int memory) {
			this.memory = memory;
		}
		public int getAutonomia() {
			return autonomia;
		}
		public void setAutonomia(int autonomia) {
			this.autonomia = autonomia;
		}
		public String toString() {

			return "Marca: " + marca 
				+ "\tCPU: " + cpu
				+ "\tRam: " + ram
				+ "\tMemoria interna: " + memory
				+ "\tAutonomia: " + autonomia;
			}
		
		
}
	