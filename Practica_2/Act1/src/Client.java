
public class Client extends Persona{
	private Correu correu;
    private int telefon;

    public Client(String nom, int edat, NIF nif, Data dataNaixement, Correu correu, int telefon) {
        super(nom, edat, nif, dataNaixement);
        this.correu = correu;
        this.telefon = telefon;
    }

	public Correu getCorreu() {
		return correu;
	}

	public void setCorreu(Correu correu) {
		this.correu = correu;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
}
