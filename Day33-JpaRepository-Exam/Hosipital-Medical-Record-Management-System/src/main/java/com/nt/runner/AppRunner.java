package com.nt.runner;

import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PatientRecord;
import com.nt.repository.PatientRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private PatientRepository erepo;
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Save Operation");
		PatientRecord emp1 = new PatientRecord();
		emp1.setId(103l);
		emp1.setName("vesh");
		emp1.setReport(Files.readAllBytes(Paths.get("C:\\Users\\DELL\\Pictures\\Screenshots\\githubProfile.png")));
		emp1.setDiagnosis(new String(Files.readAllBytes(Paths.get("C:\\banner.txt"))));
		erepo.save(emp1);
		
		Optional<PatientRecord> byId = erepo.findById(103l);
	    PatientRecord e = byId.get();
	    System.out.println(e.getId());
	    System.out.println(e.getName());
	    System.out.println(e.getReport());
	    System.out.println(e.getDiagnosis());
	  
	    Files.write(Paths.get("githubProfile.png"), e.getReport());
	    Files.write(Paths.get("banner.txt"), e.getDiagnosis().getBytes());

//			List<PatientRecord> em = erepo.findAll();
//			em.forEach(emp -> {
//			
//		System.out.println(emp.getId());
//		System.out.println(emp.getName());
//		System.out.println(emp.getDiagnosis());
//		System.out.println(emp.getReport());
//		});
//			Files.write(Paths.get("C:\\banner.txt"), emp1.getDiagnosis().getBytes());
//			Files.write(Paths.get("C:\\Users\\DELL\\Pictures\\Screenshots\\githubProfile.png"), emp1.getReport());
		
		erepo.deleteById(103l);
		System.out.println("Record Deleted");
		
		
		
	}

}
