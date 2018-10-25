package com.verizon.adb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.adb.dao.PackageRepository;
import com.verizon.adb.dao.CustomerRepository;
import com.verizon.adb.dao.CustomerRepository;
import com.verizon.adb.model.Customer;
import com.verizon.adb.model.Packages;

@Service 
public class PackageServiceImpl implements PackageService{
	
	@Autowired
	private PackageRepository PackagesRepo;
	
	

	@Override
	public Packages getPackageById(String Title) {
		Packages packages =null;

		Optional<Packages> optContact=PackagesRepo.findById(Title);
		if(optContact.isPresent()){// checking if data is available
			packages=optContact.get();// retrieve the data using .get
		}
		return packages;
	}

	@Override
	public List<Packages> getAllPackages() {
		return PackagesRepo.findAll();
	}


	@Override
	public Packages findBycost(int cost) {
		
		return PackagesRepo.findBycost(cost);
	}

	@Override
	public Packages findByNet(int net) {
		
		return PackagesRepo.findByNet(net);
	}
	

	@Override
	public Packages findByMaxUsage(int maxusage) {
		
		return PackagesRepo.findByMaxusage(maxusage);
	}

}
