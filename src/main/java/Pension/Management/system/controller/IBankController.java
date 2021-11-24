package Pension.Management.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Pension.Management.system.model.BankDetails;
import Pension.Management.system.service.IBankService;


@RestController
public class IBankController {
	private static final Logger LOG = LoggerFactory.getLogger(IBankController.class);

	@Autowired
	
	private IBankService iBankService;
	@Autowired
	
	

@Bean
	@PostMapping("/addBank")
	public ResponseEntity<BankDetails> addBank(@RequestBody BankDetails bankdetails) {
		System.out.println("Controller addBank");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Bank addded  successfully.");
		return new ResponseEntity<BankDetails>(iBankService.addBank(bankdetails), headers, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deletebankbyaccno/{accno}")
	public ResponseEntity<BankDetails> deleteBankByAcc(@PathVariable(name = "accno") int accno) {
		LOG.info("deletebankbyaccno");
		BankDetails bank = iBankService.deleteBankByAcc(accno); // line
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This is Bank deleted");
		LOG.info(headers.toString());
		ResponseEntity<BankDetails> response = new ResponseEntity<BankDetails>(bank, headers, HttpStatus.OK);
		return response;
		
	}
	
}
