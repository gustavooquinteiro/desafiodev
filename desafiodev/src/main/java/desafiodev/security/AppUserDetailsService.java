package desafiodev.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import desafiodev.model.Usuario;
import desafiodev.repository.Usuarios;
import com.SiteGTS.util.cdi.CDIServiceLocator;

public class AppUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuarios usuarios = CDIServiceLocator.getBean(Usuarios.class);
		Usuario usuario = usuarios.porEmail(email);
		UsuarioSistema user = null;
		if (usuario != null) {
			user = new UsuarioSistema(usuario, getGrupo(usuario));
		}
		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupo(Usuario usuario) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		authorities.add(new SimpleGrantedAuthority(usuario.getGrupo().getNome().toUpperCase()));

		return authorities;
	}

}
