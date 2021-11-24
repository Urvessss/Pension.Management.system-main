package Pension.Management.system.controller;

import org.apache.catalina.users.AbstractUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Pension.Management.system.model.PensionerDetails;
import Pension.Management.system.service.IPensionerService;



@RestController
public class IPensionerController {
//
//	private final Logger log = LoggerFactory.getLogger(IPensionerController.class);
//	
//	@Autowired
//	private IPensionerService appService;
//	
//	@PostMapping("/pensionerValidation")
//	public PensionerDetails validatePensioner(@RequestBody PensionerDetails pensionerDetails) {
//	    log.info("ValidatingPensionerController");
//		return appService.validatePensioner(pensionerDetails);
//	}
//	
}
