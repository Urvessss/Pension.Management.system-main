package Pension.Management.system.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pension.Management.repository.IBankRepository;
import Pension.Management.system.model.BankDetails;

@Service
public class IBankService {

	private static final Logger LOG = LoggerFactory.getLogger(IBankService.class);

	@Autowired
	private IBankRepository iBankRepository;
	
	public BankDetails addBank(BankDetails bankDetails) {
		LOG.info("Service addBank");
		return bankDetails;

	}

	public BankDetails deleteBankByAcc(int accno) {
		LOG.info("deleteBankByAcc");
		List<BankDetails> bank = iBankRepository.findByaccno(accno);
		if (bank.isEmpty()) {
			iBankRepository.findByaccno(accno);
			return bank.get(accno);
		} else {
			LOG.info("acc No not avilable");
			// throw new EmployeeNotFoundException(eid + " this employee does not exits.");

			return deleteBankByAcc(accno);
		}
	}
}
