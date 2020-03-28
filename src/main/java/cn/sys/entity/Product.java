package cn.sys.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2020-03-07
 */
public class Product {
    private Integer id;

    private String name;

    private BigDecimal market_price;

    private BigDecimal shop_price;

    private String img;

    private String decoration;

    private Integer is_hot;

    private Date date;

    private Integer cid;

    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getMarket_price() {
        return market_price;
    }

    public void setMarket_price(BigDecimal market_price) {
        this.market_price = market_price;
    }

    public BigDecimal getShop_price() {
        return shop_price;
    }

    public void setShop_price(BigDecimal shop_price) {
        this.shop_price = shop_price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration == null ? null : decoration.trim();
    }

    public Integer getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(Integer is_hot) {
        this.is_hot = is_hot;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}