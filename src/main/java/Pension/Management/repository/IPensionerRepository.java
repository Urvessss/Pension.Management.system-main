package Pension.Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pension.Management.system.model.Pensioner;
import Pension.Management.system.model.PensionerDetails;

@Repository
public interface IPensionerRepository extends JpaRespository<PensionerDetails,Integer>() {

	public abstract Pensioner findByAadhar(int iPensioner) ;
}
