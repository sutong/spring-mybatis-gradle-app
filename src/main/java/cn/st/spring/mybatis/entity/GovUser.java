package cn.st.spring.mybatis.entity;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table gov_user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class GovUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   登录名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.login_name
     *
     * @mbg.generated
     */
    private String loginName;

    /**
     * Database Column Remarks:
     *   密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * Database Column Remarks:
     *   中文名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.chinese_name
     *
     * @mbg.generated
     */
    private String chineseName;

    /**
     * Database Column Remarks:
     *   身份证号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.identify_code
     *
     * @mbg.generated
     */
    private String identifyCode;

    /**
     * Database Column Remarks:
     *   警号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.police_code
     *
     * @mbg.generated
     */
    private String policeCode;

    /**
     * Database Column Remarks:
     *   联系方式
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.phone_number
     *
     * @mbg.generated
     */
    private String phoneNumber;

    /**
     * Database Column Remarks:
     *   邮箱地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     *   外键、单位ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.dept_id
     *
     * @mbg.generated
     */
    private Integer deptId;

    /**
     * Database Column Remarks:
     *   单位代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.dept_code
     *
     * @mbg.generated
     */
    private String deptCode;

    /**
     * Database Column Remarks:
     *   创建人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.creator
     *
     * @mbg.generated
     */
    private Integer creator;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   修改人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.modify_man
     *
     * @mbg.generated
     */
    private Integer modifyMan;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.modify_date
     *
     * @mbg.generated
     */
    private Date modifyDate;

    /**
     * Database Column Remarks:
     *   伪删除状态（1：正常，2：删除）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gov_user.state
     *
     * @mbg.generated
     */
    private Boolean state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.id
     *
     * @return the value of gov_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.id
     *
     * @param id the value for gov_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.login_name
     *
     * @return the value of gov_user.login_name
     *
     * @mbg.generated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.login_name
     *
     * @param loginName the value for gov_user.login_name
     *
     * @mbg.generated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.password
     *
     * @return the value of gov_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.password
     *
     * @param password the value for gov_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.chinese_name
     *
     * @return the value of gov_user.chinese_name
     *
     * @mbg.generated
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.chinese_name
     *
     * @param chineseName the value for gov_user.chinese_name
     *
     * @mbg.generated
     */
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName == null ? null : chineseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.identify_code
     *
     * @return the value of gov_user.identify_code
     *
     * @mbg.generated
     */
    public String getIdentifyCode() {
        return identifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.identify_code
     *
     * @param identifyCode the value for gov_user.identify_code
     *
     * @mbg.generated
     */
    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode == null ? null : identifyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.police_code
     *
     * @return the value of gov_user.police_code
     *
     * @mbg.generated
     */
    public String getPoliceCode() {
        return policeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.police_code
     *
     * @param policeCode the value for gov_user.police_code
     *
     * @mbg.generated
     */
    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode == null ? null : policeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.phone_number
     *
     * @return the value of gov_user.phone_number
     *
     * @mbg.generated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.phone_number
     *
     * @param phoneNumber the value for gov_user.phone_number
     *
     * @mbg.generated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.email
     *
     * @return the value of gov_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.email
     *
     * @param email the value for gov_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.dept_id
     *
     * @return the value of gov_user.dept_id
     *
     * @mbg.generated
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.dept_id
     *
     * @param deptId the value for gov_user.dept_id
     *
     * @mbg.generated
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.dept_code
     *
     * @return the value of gov_user.dept_code
     *
     * @mbg.generated
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.dept_code
     *
     * @param deptCode the value for gov_user.dept_code
     *
     * @mbg.generated
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.creator
     *
     * @return the value of gov_user.creator
     *
     * @mbg.generated
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.creator
     *
     * @param creator the value for gov_user.creator
     *
     * @mbg.generated
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.create_date
     *
     * @return the value of gov_user.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.create_date
     *
     * @param createDate the value for gov_user.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.modify_man
     *
     * @return the value of gov_user.modify_man
     *
     * @mbg.generated
     */
    public Integer getModifyMan() {
        return modifyMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.modify_man
     *
     * @param modifyMan the value for gov_user.modify_man
     *
     * @mbg.generated
     */
    public void setModifyMan(Integer modifyMan) {
        this.modifyMan = modifyMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.modify_date
     *
     * @return the value of gov_user.modify_date
     *
     * @mbg.generated
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.modify_date
     *
     * @param modifyDate the value for gov_user.modify_date
     *
     * @mbg.generated
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gov_user.state
     *
     * @return the value of gov_user.state
     *
     * @mbg.generated
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gov_user.state
     *
     * @param state the value for gov_user.state
     *
     * @mbg.generated
     */
    public void setState(Boolean state) {
        this.state = state;
    }
}