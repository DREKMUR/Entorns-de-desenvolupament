
public class Empleat extends Persona{
	protected int souBrut;
    protected int souNet;

    public Empleat(String nom, int edat, NIF nif, Data dataNaixement, int souBrut, int souNet) {
        super(nom, edat, nif, dataNaixement);
        this.souBrut = souBrut;
        this.souNet = souNet;
    }

	public int getSouBrut() {
		return souBrut;
	}

	public void setSouBrut(int souBrut) {
		this.souBrut = souBrut;
	}

	public int getSouNet() {
		return souNet;
	}

	public void setSouNet(int souNet) {
		this.souNet = souNet;
	}
}
