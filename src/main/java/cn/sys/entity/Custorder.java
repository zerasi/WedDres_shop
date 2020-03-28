package cn.sys.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-03-07
 */
public class Custorder {
    private Integer id;

    private String status;

    private BigDecimal payment;

    private String buyer_name;

    private String buyer_postal;

    private String buyer_phone;

    private String buyer_ads;

    private String buyer_email;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date create_time;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date pay_time;

    private Date cosign_time;

    private Date end_time;

    private String shop_name;

    private String shop_code;

    private Integer uid;

    private List<Orderitem> orderitems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name == null ? null : buyer_name.trim();
    }

    public String getBuyer_postal() {
        return buyer_postal;
    }

    public void setBuyer_postal(String buyer_postal) {
        this.buyer_postal = buyer_postal == null ? null : buyer_postal.trim();
    }

    public String getBuyer_phone() {
        return buyer_phone;
    }

    public void setBuyer_phone(String buyer_phone) {
        this.buyer_phone = buyer_phone == null ? null : buyer_phone.trim();
    }

    public String getBuyer_ads() {
        return buyer_ads;
    }

    public void setBuyer_ads(String buyer_ads) {
        this.buyer_ads = buyer_ads == null ? null : buyer_ads.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public Date getCosign_time() {
        return cosign_time;
    }

    public void setCosign_time(Date cosign_time) {
        this.cosign_time = cosign_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name == null ? null : shop_name.trim();
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code == null ? null : shop_code.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public List<Orderitem> getOrderitems() {
        return orderitems;
    }

    public String getBuyer_email() {
        return buyer_email;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    public void setOrderitems(List<Orderitem> orderitems) {
        this.orderitems = orderitems;
    }
}