package Pension.Management.system.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pension.Management.system.controller.ProcessPensionInput;
import Pension.Management.system.model.Pensioner;
import Pension.Management.system.model.PensionerDetails;

@Service
public class PensionDisbursmentService {
	private static Logger logger = LoggerFactory.getLogger(PensionDisbursmentService.class);

	@Autowired
	PensionerDetails pensionerDetails;

//	public int processPension( ProcessPensionInput processPensionInput) {
//		logger.info("START");
//
//		Pensioner pensioner = PensionerDetails.getPensionerDetailByAadhaar(processPensionInput.getAadhaarNumber());
//		if (pensioner == null) {
//			logger.info("END");
//
//			return 21;
//		}
//
//		double bankServiceCharge = banks.get(pensioner.getBankName().toUpperCase());
//		if ((processPensionInput.getPensionAmount().equals(pensioner.getPensionAmount()))
//				&& (processPensionInput.getBankServiceCharge().equals(bankServiceCharge))) {
//			pensioner.setBankServiceCharge(bankServiceCharge);
//			if (pensionerDetails.logTransaction( pensioner)
//					&& pensionerDetails.updatePensioner( pensioner)) {
//				logger.info("END");
//
//				return 10;
//			}
//		}
//		logger.info("END");
//
//		return 21;
//	}

}
