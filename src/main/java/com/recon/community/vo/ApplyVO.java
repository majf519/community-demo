package com.recon.community.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.util.Date;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
public class ApplyVO {

    @TableId(value = "id")
    private String id;

    @TableField(value="resident_id")
    private String residentId;

    @TableField(value="withdrawal_time")
    private Date withdrawalTime;

    @TableField(value="expropriation_time")
    private Date expropriationTime;

    @TableField(value="expropriation_unit")
    private String expropriationUnit;

    @TableField(value="unemployment_time")
    private Date unemploymentTime;

    @TableField(value="remedies_type")
    private String remediesType;

    @TableField(value="relief_reason")
    private String reliefReason;

    @TableField(value="status")
    private String status;

    @TableField(value="create_unit")
    private String createUnit;

    @TableField(value="create_user")
    private String createUser;

    @TableField(value="create_time")
    private Date createTime;

    @TableField(value="update_user")
    private String updateUser;

    @TableField(value="update_time")
    private Date updateTime;

    @TableField(value="del_flag")
    private String delFlag;

    @TableField(value = "name")
    private String name;

    @TableField(value = "gender")
    private String gender;

    @TableField(value = "birthday")
    private Date birthday;

    @TableField(value = "household_address")
    private String householdAddress;

    @TableField(value = "domicile_number")
    private String domicileNumber;

    @TableField(value = "domicile_address")
    private String domicileAddress;

    @TableField(value ="company")
    private String company;

    @TableField(value ="division_unit")
    private String divisionUnit;

    @TableField(value ="marriage_status")
    private String marriageStatus;

    @TableField(value ="division_unit")
    private String marriageNo;

    @TableField(value ="marriage_date")
    private Date marriageDate;

    @TableField(value ="political_status")
    private String politicalStatus;

    @TableField(value ="is_foreign")
    private String isForeign;

    @TableField(value = "id_card")
    private String idCard;

    @TableField(value = "contact_phone")
    private String contactPhone;

    @TableField(value ="native_place")
    private String nativePlace;

    @TableField(value ="zip_code")
    private String zipCode;

    @TableField(value ="remark")
    private String remark;

    @TableField(value ="household_relation")
    private String householdRelation;

    @TableField(value ="person_type")
    private String personType;

    @TableField(value = "education_level")
    private String educationLevel;

    @TableField(value ="is_only")
    private String isOnly;

    @TableField(value ="household_register")
    private String householdRegister;

    @TableField(value ="company_register")
    private String companyRegister;

    @TableField(value ="household_code")
    private String householdCode;

    @TableField(value ="household_number")
    private String householdNumber;

    @TableField(value ="is_violation")
    private String isViolation;

    @TableField(value ="husband_id")
    private String husbandId;

    @TableField(value = "social_security_code")
    private String socialSecurityCode;

    @TableField(value ="social_security_address")
    private String socialSecurityAddress;

    @TableField(value ="manage_code")
    private String manageCode;

    @TableField(value = "national")
    private String national;

    @TableField(value = "family_num")
    private Integer familyNum;

    @TableField(value ="professional_type")
    private String professionalType;

    @TableField(value ="residential_code")
    private String residentialCode;

    @TableField(value ="house_code")
    private String houseCode;

    @TableField(value ="work_status")
    private String workStatus;

    @TableField(value ="labor_ability")
    private String laborAbility;

    @TableField(value ="health")
    private String health;

    @TableField(value ="serious_disease")
    private String seriousDisease;

    @TableField(value ="disablity_syndrome")
    private String disablitySyndrome;

    @TableField(value ="disability_category")
    private String disabilityCategory;

    @TableField(value ="disability_grade")
    private String disabilityGrade;

    @TableField(value ="specific_salvation")
    private String specificSalvation;

    @TableField(value ="academic_status")
    private String academicStatus;

    @TableField(value = "relationship_applicant")
    private String relationshipApplicant;

    @TableField(value ="is_supplied")
    private String isSupplied;

    @TableField(value ="is_be_supplied")
    private String isBeSupplied;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public Date getWithdrawalTime() {
        return withdrawalTime;
    }

    public void setWithdrawalTime(Date withdrawalTime) {
        this.withdrawalTime = withdrawalTime;
    }

    public Date getExpropriationTime() {
        return expropriationTime;
    }

    public void setExpropriationTime(Date expropriationTime) {
        this.expropriationTime = expropriationTime;
    }

    public String getExpropriationUnit() {
        return expropriationUnit;
    }

    public void setExpropriationUnit(String expropriationUnit) {
        this.expropriationUnit = expropriationUnit;
    }

    public Date getUnemploymentTime() {
        return unemploymentTime;
    }

    public void setUnemploymentTime(Date unemploymentTime) {
        this.unemploymentTime = unemploymentTime;
    }

    public String getRemediesType() {
        return remediesType;
    }

    public void setRemediesType(String remediesType) {
        this.remediesType = remediesType;
    }

    public String getReliefReason() {
        return reliefReason;
    }

    public void setReliefReason(String reliefReason) {
        this.reliefReason = reliefReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateUnit() {
        return createUnit;
    }

    public void setCreateUnit(String createUnit) {
        this.createUnit = createUnit;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHouseholdAddress() {
        return householdAddress;
    }

    public void setHouseholdAddress(String householdAddress) {
        this.householdAddress = householdAddress;
    }

    public String getDomicileNumber() {
        return domicileNumber;
    }

    public void setDomicileNumber(String domicileNumber) {
        this.domicileNumber = domicileNumber;
    }

    public String getDomicileAddress() {
        return domicileAddress;
    }

    public void setDomicileAddress(String domicileAddress) {
        this.domicileAddress = domicileAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDivisionUnit() {
        return divisionUnit;
    }

    public void setDivisionUnit(String divisionUnit) {
        this.divisionUnit = divisionUnit;
    }

    public String getMarriageStatus() {
        return marriageStatus;
    }

    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    public String getMarriageNo() {
        return marriageNo;
    }

    public void setMarriageNo(String marriageNo) {
        this.marriageNo = marriageNo;
    }

    public Date getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getIsForeign() {
        return isForeign;
    }

    public void setIsForeign(String isForeign) {
        this.isForeign = isForeign;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHouseholdRelation() {
        return householdRelation;
    }

    public void setHouseholdRelation(String householdRelation) {
        this.householdRelation = householdRelation;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getIsOnly() {
        return isOnly;
    }

    public void setIsOnly(String isOnly) {
        this.isOnly = isOnly;
    }

    public String getHouseholdRegister() {
        return householdRegister;
    }

    public void setHouseholdRegister(String householdRegister) {
        this.householdRegister = householdRegister;
    }

    public String getCompanyRegister() {
        return companyRegister;
    }

    public void setCompanyRegister(String companyRegister) {
        this.companyRegister = companyRegister;
    }

    public String getHouseholdCode() {
        return householdCode;
    }

    public void setHouseholdCode(String householdCode) {
        this.householdCode = householdCode;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public String getIsViolation() {
        return isViolation;
    }

    public void setIsViolation(String isViolation) {
        this.isViolation = isViolation;
    }

    public String getHusbandId() {
        return husbandId;
    }

    public void setHusbandId(String husbandId) {
        this.husbandId = husbandId;
    }

    public String getSocialSecurityCode() {
        return socialSecurityCode;
    }

    public void setSocialSecurityCode(String socialSecurityCode) {
        this.socialSecurityCode = socialSecurityCode;
    }

    public String getSocialSecurityAddress() {
        return socialSecurityAddress;
    }

    public void setSocialSecurityAddress(String socialSecurityAddress) {
        this.socialSecurityAddress = socialSecurityAddress;
    }

    public String getManageCode() {
        return manageCode;
    }

    public void setManageCode(String manageCode) {
        this.manageCode = manageCode;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public Integer getFamilyNum() {
        return familyNum;
    }

    public void setFamilyNum(Integer familyNum) {
        this.familyNum = familyNum;
    }

    public String getProfessionalType() {
        return professionalType;
    }

    public void setProfessionalType(String professionalType) {
        this.professionalType = professionalType;
    }

    public String getResidentialCode() {
        return residentialCode;
    }

    public void setResidentialCode(String residentialCode) {
        this.residentialCode = residentialCode;
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getLaborAbility() {
        return laborAbility;
    }

    public void setLaborAbility(String laborAbility) {
        this.laborAbility = laborAbility;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getSeriousDisease() {
        return seriousDisease;
    }

    public void setSeriousDisease(String seriousDisease) {
        this.seriousDisease = seriousDisease;
    }

    public String getDisablitySyndrome() {
        return disablitySyndrome;
    }

    public void setDisablitySyndrome(String disablitySyndrome) {
        this.disablitySyndrome = disablitySyndrome;
    }

    public String getDisabilityCategory() {
        return disabilityCategory;
    }

    public void setDisabilityCategory(String disabilityCategory) {
        this.disabilityCategory = disabilityCategory;
    }

    public String getDisabilityGrade() {
        return disabilityGrade;
    }

    public void setDisabilityGrade(String disabilityGrade) {
        this.disabilityGrade = disabilityGrade;
    }

    public String getSpecificSalvation() {
        return specificSalvation;
    }

    public void setSpecificSalvation(String specificSalvation) {
        this.specificSalvation = specificSalvation;
    }

    public String getAcademicStatus() {
        return academicStatus;
    }

    public void setAcademicStatus(String academicStatus) {
        this.academicStatus = academicStatus;
    }

    public String getRelationshipApplicant() {
        return relationshipApplicant;
    }

    public void setRelationshipApplicant(String relationshipApplicant) {
        this.relationshipApplicant = relationshipApplicant;
    }

    public String getIsSupplied() {
        return isSupplied;
    }

    public void setIsSupplied(String isSupplied) {
        this.isSupplied = isSupplied;
    }

    public String getIsBeSupplied() {
        return isBeSupplied;
    }

    public void setIsBeSupplied(String isBeSupplied) {
        this.isBeSupplied = isBeSupplied;
    }
}
