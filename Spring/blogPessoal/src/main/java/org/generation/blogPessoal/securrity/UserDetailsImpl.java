package org.generation.blogPessoal.securrity;

import java.util.Collection;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails{

	private static final long SerialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}
	
	public UserDetailsImpl() {
		
	}
	

	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}


	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
