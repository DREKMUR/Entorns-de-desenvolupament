import java.util.ArrayList;
import java.util.List;

public class Directiu extends Empleat{
	private Categoria categoria;
    private List<Empleat> subordinats;

    public Directiu(String nom, int edat, NIF nif, Data dataNaixement, int souBrut, int souNet, Categoria categoria) {
        super(nom, edat, nif, dataNaixement, souBrut, souNet);
        this.categoria = categoria;
        this.subordinats = new ArrayList<>(); 
    }
    
    public void addSubordinat(Empleat empleat) {
        this.subordinats.add(empleat);
    }

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Empleat> getSubordinats() {
		return subordinats;
	}

	public void setSubordinats(List<Empleat> subordinats) {
		this.subordinats = subordinats;
	}
    
    
}
