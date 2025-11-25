package documentacio_git;

public class Categoria {
	private String code;
	private String name;
	private String description;

	public Categoria(String code, String name, String description) {
		this.code = code;
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}
}
