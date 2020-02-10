package com.fubon.testapp.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fubon.testapp.entity.Role;
import com.fubon.testapp.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService{
	
	private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	@Autowired
    RoleRepository roleRepository;

	@Override
	public Role create(Role obj) {
		
		roleRepository.save(obj);

        return obj;
	}

	@Override
	public Role update(Role obj) {
		
		roleRepository.save(obj);

        return obj;
	}

	@Override
	public Role delete(Role obj) {
		
		roleRepository.delete(obj);

        return obj;
	}

	@Override
	public Page<Role> findByExample(Example example, Pageable pageable) {
		 Page<Role> page = roleRepository.findAll(example, pageable);
         return page;
	}

	@Override
	public Page<Role> findAll(Pageable pageable) {
		 Page<Role> page = roleRepository.findAll(pageable);
         return page;
	}

	@Override
	public Role findByRoleId(String roleId) {
		Optional<Role> op = roleRepository.findById(roleId.trim());

        if(op.isPresent() == false) {
        	throw new IllegalArgumentException("查無此ID，請重新確認！！");
        }
        return op.get();
	}

}
