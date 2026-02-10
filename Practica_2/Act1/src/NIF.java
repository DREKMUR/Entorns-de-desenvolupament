public class NIF {
    private int dni;
    private char lletra;

    public NIF(int dni, char lletra) {
        this.dni = dni;
        this.lletra = lletra;
    }

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public char getLletra() {
		return lletra;
	}
	public void setLletra(char lletra) {
		this.lletra = lletra;
	}
}