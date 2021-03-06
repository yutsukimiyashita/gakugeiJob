package gakugeiJob.service;

import java.sql.Timestamp;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.SchoolAplicantCB;
import gakugeiJob.db.cbean.SchoolFavoCB;
import gakugeiJob.db.cbean.SchoolOfferCB;
import gakugeiJob.db.exbhv.SchoolAplicantBhv;
import gakugeiJob.db.exbhv.SchoolFavoBhv;
import gakugeiJob.db.exbhv.SchoolOfferBhv;
import gakugeiJob.db.exentity.SchoolAplicant;
import gakugeiJob.db.exentity.SchoolFavo;
import gakugeiJob.db.exentity.SchoolOffer;

public class SchoolOfferService {
	@Binding(bindingType = BindingType.MUST)
	protected SchoolOfferBhv schoolOfferBhv;

	@Binding(bindingType = BindingType.MUST)
	protected SchoolAplicantBhv schoolAplicantBhv;

	@Binding(bindingType = BindingType.MUST)
	protected SchoolFavoBhv schoolFavoBhv;

	public ListResultBean<SchoolOffer> selectAll(){
		SchoolOfferCB schoolOfferCB = new SchoolOfferCB();
		schoolOfferCB.query().addOrderBy_SchoolOfferId_Desc();
		return schoolOfferBhv.selectList(schoolOfferCB);
	}

	public ListResultBean<SchoolAplicant> selectAllAplicant(){
		SchoolAplicantCB schoolAplicantCB = new SchoolAplicantCB();
		return schoolAplicantBhv.selectList(schoolAplicantCB);
	}

	public ListResultBean<SchoolFavo> selectAllFavo(){
		SchoolFavoCB schoolFavoCB = new SchoolFavoCB();
		return schoolFavoBhv.selectList(schoolFavoCB);
	}

	public void insertSchoolAplicant(int schoolOfferId, int studentId, String title, String content){
		SchoolAplicant schoolAplicant = new SchoolAplicant();
		schoolAplicant.setSchoolOfferId(schoolOfferId);
		schoolAplicant.setStudentId(studentId);
		schoolAplicant.setTitle(title);
		schoolAplicant.setContent(content);
		schoolAplicantBhv.insert(schoolAplicant);
	}

	public void insertSchoolFavo(int schoolOfferId, int studentId){
		SchoolFavo schoolFavo = new SchoolFavo();
		schoolFavo.setSchoolOfferId(schoolOfferId);
		schoolFavo.setStudentId(studentId);
		schoolFavoBhv.insert(schoolFavo);
	}

	public void updateSchoolFavo(int schoolOfferId){
		SchoolOffer schoolOffer = new SchoolOffer();
		schoolOffer = schoolOfferBhv.selectByPKValue(schoolOfferId);
		int fixedFavo = schoolOffer.getFavo() + 1;
		schoolOffer.setFavo(fixedFavo);
		schoolOfferBhv.update(schoolOffer);
	}

	public void deleteFavo(int schoolOfferId, int studentId){
		SchoolFavo schoolFavo = new SchoolFavo();
		schoolFavo.setSchoolOfferId(schoolOfferId);
		schoolFavo.setStudentId(studentId);
		schoolFavoBhv.delete(schoolFavo);

		SchoolOffer schoolOffer = new SchoolOffer();
		schoolOffer = schoolOfferBhv.selectByPKValue(schoolOfferId);
		int fixedFavo = schoolOffer.getFavo() - 1;
		schoolOffer.setFavo(fixedFavo);
		schoolOfferBhv.update(schoolOffer);
	}

	public void deleteAplicant(int schoolOfferId, int studentId){
		SchoolAplicant schoolAplicant = new SchoolAplicant();
		schoolAplicant.setSchoolOfferId(schoolOfferId);
		schoolAplicant.setStudentId(studentId);
		schoolAplicantBhv.delete(schoolAplicant);
	}

	public ListResultBean<SchoolAplicant> selectAplicant(int schoolOfferId) {
		SchoolAplicantCB schoolAplicantCB = new SchoolAplicantCB();
		schoolAplicantCB.query().setSchoolOfferId_Equal(schoolOfferId);
		return schoolAplicantBhv.selectList(schoolAplicantCB);
	}

	public void deleteOffer(int schoolOfferId){
		SchoolOffer schoolOffer = new SchoolOffer();
		schoolOffer.setSchoolOfferId(schoolOfferId);
		schoolOfferBhv.delete(schoolOffer);
	}

	public void updateOffer(int schoolOfferId, int  schoolId, String description, String salary,
			String workSchedule, String period, String address, String station,
			String qualification, String welfare, String oneThing){

		SchoolOffer schoolOffer = new SchoolOffer();

		schoolOffer.setSchoolId(schoolId);
		schoolOffer.setDescription(description);
		schoolOffer.setSalary(salary);
		schoolOffer.setWorkSchedule(workSchedule);
		schoolOffer.setPeriod(period);
		schoolOffer.setAddress(address);
		schoolOffer.setStation(station);
		schoolOffer.setQualification(qualification);
		schoolOffer.setWelfare(welfare);
		schoolOffer.setOneThing(oneThing);
		Timestamp registrationDate = new Timestamp(System.currentTimeMillis());
		schoolOffer.setRegistrationDate(registrationDate);
		schoolOffer.setFavo(0);
		schoolOfferBhv.insert(schoolOffer);
	}

}
