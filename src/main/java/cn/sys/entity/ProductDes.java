package cn.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class ProductDes implements Serializable {

    private Integer id;

    private Integer pid;

    private String img_base;

    private String lookIndex;

    private String img_format;

    private Date create_time;

    private String bak1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getImg_base() {
        return img_base;
    }

    public void setImg_base(String img_base) {
        this.img_base = img_base;
    }

    public String getLookIndex() {
        return lookIndex;
    }

    public void setLookIndex(String lookIndex) {
        this.lookIndex = lookIndex;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getImg_format() {
        return img_format;
    }

    public void setImg_format(String img_format) {
        this.img_format = img_format;
    }
}
