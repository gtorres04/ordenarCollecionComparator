
public class Subcuenta {
	private String id;
	private String textoCompleto;

	public Subcuenta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param textoCompleto
	 */
	public Subcuenta(String id, String textoCompleto) {
		super();
		this.id = id;
		this.textoCompleto = textoCompleto;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the textoCompleto
	 */
	public String getTextoCompleto() {
		return textoCompleto;
	}

	/**
	 * @param textoCompleto the textoCompleto to set
	 */
	public void setTextoCompleto(String textoCompleto) {
		this.textoCompleto = textoCompleto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Subcuenta [id=" + id + ", textoCompleto=" + textoCompleto + "]";
	}
	
}
