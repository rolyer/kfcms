package com.kfcms.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.kfcms.dao.AdminDao;
import com.kfcms.dto.Result;
import com.kfcms.model.Admin;
import com.kfcms.service.AdminService;
import com.kfcms.util.AlgorithmUtils;
import com.kfcms.util.Constants;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	public Result login(String account, String password) {
		Assert.hasLength(account, "Account must not be empty");
		Assert.hasLength(password, "Password must not be empty");
		
		Result result =  new Result();
		
		Admin admin = adminDao.queryByAccount(account);
		if (admin==null) {
			result.setData("改用户不存在");
			return result;
		}
		
		try {
			String encryptPassword = AlgorithmUtils.MD5(password, Constants.MD5_LENGTH);
			
			if (!admin.getPassword().equals(encryptPassword)) {
				result.setData("您输入的密码有误");
				return result;
			}
			
			result.setData(admin);
			result.setSuccess(true);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public List<Admin> queryAll() {
		return adminDao.queryAll();
	}

	public int updatePassword(String account, String password) {
		Assert.hasLength(account, "Account must not be empty");
		Assert.hasLength(password, "Password must not be empty");
		
		return adminDao.updatePassword(account, password);
	}

	public int delete(Integer id) {
		Assert.notNull(id, "Admin id must not be null");
		
		return adminDao.deleteById(id);
	}

	public int add(Admin admin) {
		Assert.notNull(admin, "Admin must not be null");
		Assert.hasLength(admin.getAccount(), "Account must not be empty");
		Assert.hasLength(admin.getPassword(), "Password must not be empty");
		
		return adminDao.insert(admin);
	}

}
