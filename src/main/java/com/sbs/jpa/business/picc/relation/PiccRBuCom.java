package com.sbs.jpa.business.picc.relation;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;

//import com.alibaba.fastjson.annotation.JSONField;

/**
 * PiccRBuCom pojo
 * @author
 * @version 1.0
 * @created
 */
@Entity
@Table(name = "picc_r_bu_com")
public class PiccRBuCom implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    //
    @Column(name = "bu_id")
    private Integer buId;

    //
    @Column(name = "com_id")
    private Integer comId;



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
     * @return Integer
     */
    public Integer getBuId(){
        return buId;
    }

    /**
     * 赋值
     * @param buId;
     */
    public void setBuId(Integer buId){
        this.buId = buId;
    }
    /**
     * 获取
     * @return Integer
     */
    public Integer getComId(){
        return comId;
    }

    /**
     * 赋值
     * @param comId;
     */
    public void setComId(Integer comId){
        this.comId = comId;
    }


    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}