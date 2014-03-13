package excecao;

public class VerificarConsultaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Ocorreu um erro ao verificar a consulta!";
	}

}
