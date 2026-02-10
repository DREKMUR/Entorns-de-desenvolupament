public class Correu {
    private String usuari;
    private String domini;

    public Correu(String usuari, String domini) {
        this.usuari = usuari;
        this.domini = domini;
    }

	public String getUsuari() {
		return usuari;
	}

	public void setUsuari(String usuari) {
		this.usuari = usuari;
	}

	public String getDomini() {
		return domini;
	}

	public void setDomini(String domini) {
		this.domini = domini;
	}
}