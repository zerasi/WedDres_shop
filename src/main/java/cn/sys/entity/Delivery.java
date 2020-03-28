package cn.sys.entity;

/**
 * InnoDB free: 9216 kB
 * 
 * @author wcyong
 * 
 * @date 2019-03-02
 */
public class Delivery {
    private Integer id;

    private String buyer_name;

    private String buyer_ads;

    private String buyer_phone;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name == null ? null : buyer_name.trim();
    }

    public String getBuyer_ads() {
        return buyer_ads;
    }

    public void setBuyer_ads(String buyer_ads) {
        this.buyer_ads = buyer_ads == null ? null : buyer_ads.trim();
    }

    public String getBuyer_phone() {
        return buyer_phone;
    }

    public void setBuyer_phone(String buyer_phone) {
        this.buyer_phone = buyer_phone == null ? null : buyer_phone.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}