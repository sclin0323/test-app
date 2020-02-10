package com.fubon.testapp.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fubon.testapp.entity.Role;

public interface RoleService {

	public Role create(Role obj);

	public Role update(Role obj);

	public Role delete(Role obj);

	public Page<Role> findByExample(Example example, Pageable pageable);

	public Page<Role> findAll(Pageable pageable);

	public Role findByRoleId(String roleId);

}
