package excecao;

public class UltimaDataException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Erro ao pegar a ultima data de consulta do paciente!";
	}

	
}
