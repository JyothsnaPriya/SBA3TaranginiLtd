package com.verizon.adb.service;

import java.util.List;

import com.verizon.adb.model.Customer;
import com.verizon.adb.model.Packages;
import com.verizon.adb.model.Packages;

public interface PackageService {
	Packages getPackageById(String Title);
	List<Packages> getAllPackages();

	Packages findBycost(int cost);
	Packages findByNet(int net);
	Packages findByMaxUsage(int maxusage);
	
}
