package documentacio_git;

import java.util.ArrayList;
import java.util.List;

public class InventariRepository {
	public static List<Material> materialsList = new ArrayList<>();
	public static List<Prestec> prestecsHistory = new ArrayList<>();

	public void saveMaterial(Material m) {
		materialsList.add(m);
	}

	public Material findMaterialById(int id) {
		for (Material m : materialsList) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}
	
	public List<Material> findMaterialsByState(MaterialStates state) {
		List<Material> result = new ArrayList<>();
		for (Material m : materialsList) {
			if (m.getState() == state) {
				result.add(m);
			}
		}
		return result;
	}

	public void deleteMaterial(int id) {
		materialsList.removeIf(m -> m.getId() == id);
	}

	public List<Material> getAllMaterials() {
		return materialsList;
	}

	public void savePrestec(Prestec p) {
		prestecsHistory.add(p);
	}

	public List<Prestec> getAllPrestecs() {
		return prestecsHistory;
	}

	public List<Prestec> findPrestecsByUser(String user) {
		List<Prestec> userPrestecs = new ArrayList<>();
		for (Prestec p : prestecsHistory) {
			if (p.user.equals(user)) {
				userPrestecs.add(p);
			}
		}
		return userPrestecs;
	}
}