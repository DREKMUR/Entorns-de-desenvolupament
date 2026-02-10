public class Persona {
    protected String nom;
    protected int edat;
    protected NIF nif;
    protected Data dataNaixement;

    public Persona(String nom, int edat, NIF nif, Data dataNaixement) {
        this.nom = nom;
        this.edat = edat;
        this.nif = nif;
        this.dataNaixement = dataNaixement;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public NIF getNif() {
		return nif;
	}

	public void setNif(NIF nif) {
		this.nif = nif;
	}

	public Data getDataNaixement() {
		return dataNaixement;
	}

	public void setDataNaixement(Data dataNaixement) {
		this.dataNaixement = dataNaixement;
	}
}