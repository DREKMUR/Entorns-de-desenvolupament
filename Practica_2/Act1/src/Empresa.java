import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nom;
    private Data dataFundacio;
    private List<Empleat> empleats;
    private List<Client> clients;
    
    private Correu correu; 

    public Empresa(String nom, Data dataFundacio, Correu correu) {
        this.nom = nom;
        this.dataFundacio = dataFundacio;
        this.correu = correu;
        this.empleats = new ArrayList<>(); 
        this.clients = new ArrayList<>();
    }
    
    public void addEmpleat(Empleat empleat) {
        this.empleats.add(empleat);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Data getDataFundacio() {
		return dataFundacio;
	}

	public void setDataFundacio(Data dataFundacio) {
		this.dataFundacio = dataFundacio;
	}

	public List<Empleat> getEmpleats() {
		return empleats;
	}

	public void setEmpleats(List<Empleat> empleats) {
		this.empleats = empleats;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Correu getCorreu() {
		return correu;
	}

	public void setCorreu(Correu correu) {
		this.correu = correu;
	}
}