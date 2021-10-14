package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PasswordDetails;

@Service
public class PasswordListService {
	@Autowired
	private Repository repo;

	public List<Map<String, String>> displayList(long id) {
		return repo.findAllBycustomerid(id);
	}

	public int addPasswordIntoVault(PasswordDetails pass) {
		if (repo.findByUrl(pass.getUrl()) != null) {
			return 0;
		}
		repo.save(pass);
		return 1;
	}

	public int removePassword(long id) {
		PasswordDetails res = repo.findById(id);
		repo.delete(res);
		return 1;
	}
}
