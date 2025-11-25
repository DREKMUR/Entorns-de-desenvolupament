package documentacio_git;

import java.util.List;

public class InventariService {
	
	private InventariRepository repository;

	public InventariService() {
		this.repository = new InventariRepository();
	}

	public void addNewMaterial(int id, String name, int serialNumber) {
		Material m = new Material(id, name, serialNumber);
		repository.saveMaterial(m);
	}

	public boolean registerPrestec(String user, int materialId) {
		Material m = repository.findMaterialById(materialId);
		
		if (m != null && m.getState() == MaterialStates.DISPONIBLE) {
			m.setState(MaterialStates.PRESTADO);
			Prestec p = new Prestec(m, user);
			repository.savePrestec(p);
			return true;
		}
		return false;
	}

	public void returnMaterial(int materialId) {
		Material m = repository.findMaterialById(materialId);
		if (m != null) {
			m.setState(MaterialStates.DISPONIBLE);
			
			List<Prestec> history = repository.getAllPrestecs();
			for (Prestec p : history) {
				if (p.material.getId() == materialId && p.active) {
					p.endPrestec();
				}
			}
		}
	}

	public List<Material> getAvailableMaterials() {
		return repository.findMaterialsByState(MaterialStates.DISPONIBLE);
	}

	public int countStockTotal() {
		return repository.getAllMaterials().size();
	}
}