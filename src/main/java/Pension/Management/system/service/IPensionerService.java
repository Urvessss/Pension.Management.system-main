package Pension.Management.system.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pension.Management.repository.IBankRepository;

import Pension.Management.system.model.PensionerDetails;
import Pension.Management.system.service.IPensionerService;


@Service
public class IPensionerService {

	private static final Logger LOG = LoggerFactory.getLogger(IPensionerService.class);
	
	@Autowired
	IBankRepository iPensionerRepository;
	
	
}
