package com.sbs.jpa.business.picc.company;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;

/**
 * PiccCompany pojo
 * @author
 * @version 1.0
 * @created
 */
@Entity
@Table(name = "PICC_COMPANY")
public class PiccCompany implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //

    private Integer id;

    //
    private String comcode;

    //
    private String comname;

    //
    private String depcode;

    //
    private Integer comtype;

    //
    @Column(updatable = false, insertable = false)
    private java.util.Date createtime;



    /**
     * 获取
     * @return Long
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
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
    public String getComcode(){
        return comcode;
    }

    /**
     * 赋值
     * @param comcode;
     */
    public void setComcode(String comcode){
        this.comcode = comcode;
    }
    /**
     * 获取
     * @return String
     */
    public String getComname(){
        return comname;
    }

    /**
     * 赋值
     * @param comname;
     */
    public void setComname(String comname){
        this.comname = comname;
    }
    /**
     * 获取
     * @return String
     */
    public String getDepcode(){
        return depcode;
    }

    /**
     * 赋值
     * @param depcode;
     */
    public void setDepcode(String depcode){
        this.depcode = depcode;
    }
    /**
     * 获取
     * @return Long
     */
    public Integer getComtype(){
        return comtype;
    }

    /**
     * 赋值
     * @param comtype;
     */
    public void setComtype(Integer comtype){
        this.comtype = comtype;
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


    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}