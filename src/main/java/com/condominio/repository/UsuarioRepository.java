package com.condominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.condominio.entity.*;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Integer>{
	
	@Query("Select x from Usuario x where x.login = :#{#usu.login} and x.password = :#{#usu.password}")
	public abstract UsuarioEntity login (@Param(value = "usu") UsuarioEntity bean);
	
	@Query("Select p from Option p, RoleHasOption pr, Role r, UsuarioHasRole u where p.idOption = pr.option.idOption and pr.role.idRol = r.idRol and r.idRol = u.rol.idRol and u.usuario.idUsuario =:var_idUsuario and p.estado = 1")
	public abstract List<OptionUsuario> EnlaceUsuario(@Param("var_idUsuario") int idUsuario);
	
	@Query("Select r from Rol r, UsuarioHasRol u where r.idRol = u.rol.idRol and u.usuario.idUsuario =:var_idUsuario")
	public abstract List<RoleUsuarioEntity> EnlaceRolesUsuario(@Param("var_idUsuario") int idUsuario);
}
