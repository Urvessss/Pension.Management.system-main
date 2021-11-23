package Pension.Management.system.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import Pension.Management.system.service.PensionDisbursmentService;
import io.swagger.annotations.ApiOperation;

@RestController
public class PensionDisbursementModuleController {

	private static Logger logger = LoggerFactory.getLogger(PensionDisbursementModuleController.class);
	@Autowired
	private PensionDisbursmentService pensionDisbursementService;
	@PostMapping("/DisbursePension")
	@ApiOperation(value="Provides the processing code",
					notes="10 - successful calculation of pension amount , 21 - wrong calculation of pension amount")
	public int processPension(@RequestHeader("Authorization") String token,
			@RequestBody ProcessPensionInput processPensionInput) {
		logger.info("START");
		int processCode = 21;
		if (pensionDisbursementService.equals(processPensionInput)) {
			processCode = pensionDisbursementService.processPension( processPensionInput);
			logger.info("END");
			return processCode;
		}
		logger.info("END -invalid");

		return processCode;
	}
	
	
	
}
