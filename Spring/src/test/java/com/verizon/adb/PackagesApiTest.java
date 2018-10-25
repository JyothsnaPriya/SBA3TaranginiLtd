//package com.verizon.adb;
//
//import static org.junit.Assert.*;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.verizon.adb.model.Packages;
//import com.verizon.adb.restapi.PackageController;
//import com.verizon.adb.service.PackageServiceImpl;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(controllers=PackageController.class)
//public class PackagesApiTest {
//	
//	private  MockMvc mockMvc;
//	
//	@Autowired
//	private  WebApplicationContext webapplicationcontext;
//	
//	@MockBean
//	private PackageServiceImpl packageServiceWork;
//
//	@Before
//	public void setUp(){
//		
//		mockMvc = MockMvcBuilders.webAppContextSetup(webapplicationcontext).build();
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		this.mockMvc=null;
//	}
////	@Test
////	public void testListPackages() throws Exception{
////		assertThat(this.packageServiceWork).isNotNull();
////		List<Packages> elistPage = new ArrayList<>();
////		elistPage.add(new Packages());
////		when(packageServiceWork.getAllPackages()).thenReturn(elistPage);
////		
////		mockMvc.perform(get("/packages"))
////		.andExpect(status().isOk())
////		.andExpect(view().name("elistPage"))
////		.andExpect(model().attributeExists("packages"))
////		.andExpect(model().attribute("packages",elistPage))
////		.andDo(print());
////	}
////	
//
//}
