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

    private Integer servicetimes;

    private Integer errornums;

    private Integer traineronlinenums;

    private Integer newdevices;

    private Integer newcustomer;

    private Integer delivernums;

    private Date reportdate;

    private String reportdatastr;

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
    public Integer getServicetimes() {
        return servicetimes;
    }

    /**
     * @param servicetimes
     */
    public void setServicetimes(Integer servicetimes) {
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
    public Integer getTraineronlinenums() {
        return traineronlinenums;
    }

    /**
     * @param traineronlinenums
     */
    public void setTraineronlinenums(Integer traineronlinenums) {
        this.traineronlinenums = traineronlinenums;
    }

    /**
     * @return newdevices
     */
    public Integer getNewdevices() {
        return newdevices;
    }

    /**
     * @param newdevices
     */
    public void setNewdevices(Integer newdevices) {
        this.newdevices = newdevices;
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
    public String getReportdatastr() {
        return reportdatastr;
    }

    /**
     * @param reportdatastr
     */
    public void setReportdatastr(String reportdatastr) {
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