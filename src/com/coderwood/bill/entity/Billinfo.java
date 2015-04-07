package com.coderwood.bill.entity;

import java.util.Date;

public class Billinfo {
    private Long infoid;

    private Long itemid;

    private Float amout;

    private Boolean infotype;

    private Date createtime;

    private Date updatetime;

    public Long getInfoid() {
        return infoid;
    }

    public void setInfoid(Long infoid) {
        this.infoid = infoid;
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public Float getAmout() {
        return amout;
    }

    public void setAmout(Float amout) {
        this.amout = amout;
    }

    public Boolean getInfotype() {
        return infotype;
    }

    public void setInfotype(Boolean infotype) {
        this.infotype = infotype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}