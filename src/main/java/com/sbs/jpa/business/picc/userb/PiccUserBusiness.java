package com.sbs.jpa.business.picc.userb;


import com.sbs.jpa.business.picc.company.PiccCompany;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * PiccUserBusiness pojo
 * @author
 * @version 1.0
 * @created
 */
@Entity
@Table(name = "picc_user_business")
public class PiccUserBusiness implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    //
    @Column(name = "user_name")
    private String userName;

    //
    @Column(name = "user_mobile")
    private String userMobile;

    //
    @Column(name = "user_account")
    private String userAccount;

    //
    @Column(name = "user_type")
    private String userType;

    //
    @Column(name = "user_depcode")
    private String userDepcode;

    //
    @Column(name = "flag")
    private Integer flag;

    @Column(name = "createtime", insertable = false, updatable = false)
    private java.util.Date createtime;

    @OneToMany
    @JoinTable(name = "picc_r_bu_com",
            joinColumns = @JoinColumn(name="bu_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "com_id", referencedColumnName = "id")

    )
    private List<PiccCompany> piccCompanyList;


    /**
     * 获取
     * @return Integer
     */
    public Integer getId(){
        return id;
    }

    /**
     * 赋值
     * @param id;
     */
    public void setId(Integer id){
        this.id = id;
    }
    /**
     * 获取
     * @return String
     */
    public String getUserName(){
        return userName;
    }

    /**
     * 赋值
     * @param userName;
     */
    public void setUserName(String userName){
        this.userName = userName;
    }
    /**
     * 获取
     * @return String
     */
    public String getUserMobile(){
        return userMobile;
    }

    /**
     * 赋值
     * @param userMobile;
     */
    public void setUserMobile(String userMobile){
        this.userMobile = userMobile;
    }
    /**
     * 获取
     * @return String
     */
    public String getUserAccount(){
        return userAccount;
    }

    /**
     * 赋值
     * @param userAccount;
     */
    public void setUserAccount(String userAccount){
        this.userAccount = userAccount;
    }
    /**
     * 获取
     * @return String
     */
    public String getUserType(){
        return userType;
    }

    /**
     * 赋值
     * @param userType;
     */
    public void setUserType(String userType){
        this.userType = userType;
    }
    /**
     * 获取
     * @return String
     */
    public String getUserDepcode(){
        return userDepcode;
    }

    /**
     * 赋值
     * @param userDepcode;
     */
    public void setUserDepcode(String userDepcode){
        this.userDepcode = userDepcode;
    }
    /**
     * 获取
     * @return Integer
     */
    public Integer getFlag(){
        return flag;
    }

    /**
     * 赋值
     * @param flag;
     */
    public void setFlag(Integer flag){
        this.flag = flag;
    }
    /**
     * 获取
     * @return java.util.Date
     */
    public java.util.Date getCreatetime(){
        return createtime;
    }

    /**
     * 赋值
     * @param createtime;
     */
    public void setCreatetime(java.util.Date createtime){
        this.createtime = createtime;
    }

    public List<PiccCompany> getPiccCompanyList() {
        return piccCompanyList;
    }

    public void setPiccCompanyList(List<PiccCompany> piccCompanyList) {
        this.piccCompanyList = piccCompanyList;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}