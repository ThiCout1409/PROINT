package aula09;

public class LoginService {
	
	public static Usuario validarUsuario(Usuario usuario) {
		return LoginDAO.validar(usuario);
	}
}