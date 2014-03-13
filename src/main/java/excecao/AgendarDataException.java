package excecao;

public class AgendarDataException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Erro ao agendar data disponivel!";
	}

	
}
