package documentacio_git;

public class Material {
	private int id;
	private String name;
	private int serialNumber;
	private MaterialStates state;
	private Categoria category;
	
	public Material(int id, String name, int serialNumber){
		this.id = id;
		this.name = name;
		this.serialNumber = serialNumber;
		this.state = MaterialStates.DISPONIBLE;
	}

	public MaterialStates getState() {
		return state;
	}

	public void setState(MaterialStates state) {
		this.state = state;
	}

	public Categoria getCategory() {
		return category;
	}

	public void setCategory(Categoria category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
	
	public boolean isAvailable() {
        return MaterialStates.DISPONIBLE == (this.state);
    }
}
