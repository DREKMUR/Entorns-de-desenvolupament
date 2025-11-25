package documentacio_git;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestec {
	public int idPrestec;
	public Material material;
	public String user;
	public LocalDate initialDate;
	public LocalDate expectedDate;
	public LocalDate endDate;
	public boolean active;
	
	public Prestec(Material material, String user) {
		this.material = material;
		this.user = user;
		this.active = true;
		this.initialDate = LocalDate.now();
		this.expectedDate = initialDate.plusDays(30);
	}
	
	public void endPrestec() {
		this.endDate = LocalDate.now();
		this.active = false;
	}
	
	public long retardDays() {
		LocalDate comparedDate = (this.active) ? LocalDate.now() : this.endDate;
		
		long days = ChronoUnit.DAYS.between(this.expectedDate, comparedDate);
		
		return (days > 0) ? days : 0;
	}
}
