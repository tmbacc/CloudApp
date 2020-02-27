package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Dayreportlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productcode;

    private String productname;

    @Column(name = "product_id")
    private Integer productId;

    private String typecode;

    private String typename;

    @Column(name = "type_id")
    private Integer typeId;

    private Integer totalnums;

    private Integer onlineworknums;

    private Integer onlinenoworknums;

    private String servicetimes;

    private Integer errornums;

    private String traineronlinenums;

    private Integer newcustomer;

    private Integer newarragedevicesnums;

    private Integer newonlinedevicesnums;

    private String servicedevicesnums;

    private Integer delivernums;

    private Date reportdate;

    private Date reportdatastr;

    private Date createdate;

    private Date updatedate;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return productcode
     */
    public String getProductcode() {
        return productcode;
    }

    /**
     * @param productcode
     */
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    /**
     * @return productname
     */
    public String getProductname() {
        return productname;
    }

    /**
     * @param productname
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * @return product_id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return typecode
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * @param typecode
     */
    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    /**
     * @return typename
     */
    public String getTypename() {
        return typename;
    }

    /**
     * @param typename
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
     * @return type_id
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * @param typeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * @return totalnums
     */
    public Integer getTotalnums() {
        return totalnums;
    }

    /**
     * @param totalnums
     */
    public void setTotalnums(Integer totalnums) {
        this.totalnums = totalnums;
    }

    /**
     * @return onlineworknums
     */
    public Integer getOnlineworknums() {
        return onlineworknums;
    }

    /**
     * @param onlineworknums
     */
    public void setOnlineworknums(Integer onlineworknums) {
        this.onlineworknums = onlineworknums;
    }

    /**
     * @return onlinenoworknums
     */
    public Integer getOnlinenoworknums() {
        return onlinenoworknums;
    }

    /**
     * @param onlinenoworknums
     */
    public void setOnlinenoworknums(Integer onlinenoworknums) {
        this.onlinenoworknums = onlinenoworknums;
    }

    /**
     * @return servicetimes
     */
    public String getServicetimes() {
        return servicetimes;
    }

    /**
     * @param servicetimes
     */
    public void setServicetimes(String servicetimes) {
        this.servicetimes = servicetimes;
    }

    /**
     * @return errornums
     */
    public Integer getErrornums() {
        return errornums;
    }

    /**
     * @param errornums
     */
    public void setErrornums(Integer errornums) {
        this.errornums = errornums;
    }

    /**
     * @return traineronlinenums
     */
    public String getTraineronlinenums() {
        return traineronlinenums;
    }

    /**
     * @param traineronlinenums
     */
    public void setTraineronlinenums(String traineronlinenums) {
        this.traineronlinenums = traineronlinenums;
    }

    /**
     * @return newcustomer
     */
    public Integer getNewcustomer() {
        return newcustomer;
    }

    /**
     * @param newcustomer
     */
    public void setNewcustomer(Integer newcustomer) {
        this.newcustomer = newcustomer;
    }

    /**
     * @return newarragedevicesnums
     */
    public Integer getNewarragedevicesnums() {
        return newarragedevicesnums;
    }

    /**
     * @param newarragedevicesnums
     */
    public void setNewarragedevicesnums(Integer newarragedevicesnums) {
        this.newarragedevicesnums = newarragedevicesnums;
    }

    /**
     * @return newonlinedevicesnums
     */
    public Integer getNewonlinedevicesnums() {
        return newonlinedevicesnums;
    }

    /**
     * @param newonlinedevicesnums
     */
    public void setNewonlinedevicesnums(Integer newonlinedevicesnums) {
        this.newonlinedevicesnums = newonlinedevicesnums;
    }

    /**
     * @return servicedevicesnums
     */
    public String getServicedevicesnums() {
        return servicedevicesnums;
    }

    /**
     * @param servicedevicesnums
     */
    public void setServicedevicesnums(String servicedevicesnums) {
        this.servicedevicesnums = servicedevicesnums;
    }

    /**
     * @return delivernums
     */
    public Integer getDelivernums() {
        return delivernums;
    }

    /**
     * @param delivernums
     */
    public void setDelivernums(Integer delivernums) {
        this.delivernums = delivernums;
    }

    /**
     * @return reportdate
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
     * @param reportdate
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    /**
     * @return reportdatastr
     */
    public Date getReportdatastr() {
        return reportdatastr;
    }

    /**
     * @param reportdatastr
     */
    public void setReportdatastr(Date reportdatastr) {
        this.reportdatastr = reportdatastr;
    }

    /**
     * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return updatedate
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}