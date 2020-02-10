package com.fubon.testapp.controller;

import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fubon.testapp.entity.Role;
import com.fubon.testapp.service.RoleService;

//
//1. 資料庫 新增/刪除/修改/查詢 JPA Repository 使用
//2. CRUD 對於分頁如何處理 EXAMPLE
/////
//3. 1:N N:N 資料庫處理 ..
//4. 例外處理 錯誤訊息處理..

@RestController
@RequestMapping(value = "/api/role")
public class RoleController {

	@Autowired
	RoleService roleService;

	public String urlPrefix;

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public List<Role> read(HttpServletRequest request) throws UnsupportedEncodingException, InstantiationException,
			IllegalAccessException, NoSuchFieldException, SecurityException {

		Pageable pageable = PageRequest.of(0, 250);
		Page<Role> pages = roleService.findAll(pageable);
		return pages.getContent();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Role create(@RequestBody Role obj, Principal principal) {

		Role o = roleService.create(obj);
		return o;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Role update(@RequestBody Role obj, Principal principal) {

		Role o = roleService.update(obj);
		return o;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Role destroy(@RequestBody Role obj) {

       Role o = roleService.delete(obj);
       return o;
    }

}
