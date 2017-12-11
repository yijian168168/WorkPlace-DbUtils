package com.myutils;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Goods {

    @Column("goods_id")
    private Long goodsId; //商品ID(主键)

    @Column("goods_name")
    private String goodsName; //商品名称

    @Column("sn")
    private String sn; //商品编号

    @Column("brand_id")
    private Long brandId; //商品品牌ID 关联商品品牌表（csair_brand）

    @Column("category_id")
    private Long categoryId; //商品分类ID

    @Column("goods_type")
    private Byte goodsType; //商品类型

    @Column("unit")
    private String unit; //商品计价单位

    @Column("weight")
    private Double weight; //商品重量

    @Column("market_enable")
    private Byte marketEnable; //商品是否上架 0代表已下架，1代表已上架，2 代表草稿

    @Column("brief")
    private String brief; //商品说明(简介)

    @Column("intro")
    private String intro; //商品详情

    @Column("price")
    private BigDecimal price; //商品价格

    @Column("cost")
    private BigDecimal cost; //商品成本价

    @Column("mktprice")
    private BigDecimal mktprice; //商品市场价

    @Column("params")
    private String params; //商品参数字符串

    @Column("props")
    private String props; //商品属性字符串

    @Column("have_spec")
    private Byte haveSpec; //是否开启规格 0代表未开启，1代表已开启

    @Column("create_time")
    private Timestamp createTime; //商品添加时间

    @Column("last_modify")
    private Timestamp lastModify; //商品最后更新时间

    @Column("view_count")
    private Long viewCount; //商品被浏览次数

    @Column("buy_count")
    private Long buyCount; //商品被购买次数

    @Column("disabled")
    private Byte disabled; //商品是否被禁用 0代表未禁用，1代表已禁用

    @Column("quantity")
    private Long quantity; //商品可用库存

    @Column("enable_quantity")
    private Long enableQuantity; //商品总库存

    @Column("point")
    private Long point; //商品积分

    @Column("page_title")
    private String pageTitle; //页面标题

    @Column("meta_keywords")
    private String metaKeywords; //页面关键字

    @Column("meta_description")
    private String metaDescription; //页面描述

    @Column("sord")
    private Long sord; //商品排序

    @Column("is_pack")
    private Byte isPack; //是否是捆绑商品 0：不是，1：是

    @Column("thumbnail")
    private String thumbnail; //商品缩略图

    @Column("big")
    private String big; //商品展示大图

    @Column("small")
    private String small; //商品展示小图

    @Column("original")
    private String original; //商品原始图片

    @Column("shop_id")
    private Long shopId; //商品所属卖家ID

    @Column("shop_cat_id")
    private Long shopCatId; //商品所属店铺类目ID

    @Column("buy_num")
    private Long buyNum; //商品被购买数量

    @Column("template_id")
    private Long templateId; //商品运费模板ID

    @Column("goods_transfee_charge")
    private Byte goodsTransfeeCharge; //是否为买家承担运费 0：买家承担，1：卖家承担

    @Column("seller_name")
    private String sellerName; //商品所属店铺名称

    @Column("commission")
    private Double commission; //商品佣金比例

    @Column("is_auth")
    private Long isAuth; // 是否审核:0,未审核,1,已审核通过,2,审核未通过

    @Column("auth_message")
    private String authMessage; //审核消息



    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }


    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }


    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


    public Byte getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Byte goodsType) {
        this.goodsType = goodsType;
    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    public Byte getMarketEnable() {
        return marketEnable;
    }

    public void setMarketEnable(Byte marketEnable) {
        this.marketEnable = marketEnable;
    }


    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }


    public BigDecimal getMktprice() {
        return mktprice;
    }

    public void setMktprice(BigDecimal mktprice) {
        this.mktprice = mktprice;
    }


    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }


    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }


    public Byte getHaveSpec() {
        return haveSpec;
    }

    public void setHaveSpec(Byte haveSpec) {
        this.haveSpec = haveSpec;
    }


    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }


    public Timestamp getLastModify() {
        return lastModify;
    }

    public void setLastModify(Timestamp lastModify) {
        this.lastModify = lastModify;
    }


    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }


    public Long getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Long buyCount) {
        this.buyCount = buyCount;
    }


    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }


    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


    public Long getEnableQuantity() {
        return enableQuantity;
    }

    public void setEnableQuantity(Long enableQuantity) {
        this.enableQuantity = enableQuantity;
    }


    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }


    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }


    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }


    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }


    public Long getSord() {
        return sord;
    }

    public void setSord(Long sord) {
        this.sord = sord;
    }


    public Byte getIsPack() {
        return isPack;
    }

    public void setIsPack(Byte isPack) {
        this.isPack = isPack;
    }


    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }


    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }


    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }


    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }


    public Long getShopCatId() {
        return shopCatId;
    }

    public void setShopCatId(Long shopCatId) {
        this.shopCatId = shopCatId;
    }


    public Long getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Long buyNum) {
        this.buyNum = buyNum;
    }


    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }


    public Byte getGoodsTransfeeCharge() {
        return goodsTransfeeCharge;
    }

    public void setGoodsTransfeeCharge(Byte goodsTransfeeCharge) {
        this.goodsTransfeeCharge = goodsTransfeeCharge;
    }


    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }


    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }


    public Long getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Long isAuth) {
        this.isAuth = isAuth;
    }


    public String getAuthMessage() {
        return authMessage;
    }

    public void setAuthMessage(String authMessage) {
        this.authMessage = authMessage;
    }

    @Override
    public String toString() {
        return "Activity{" + 
              ", goodsId = " + goodsId +
              ", goodsName = " + goodsName +
              ", sn = " + sn +
              ", brandId = " + brandId +
              ", categoryId = " + categoryId +
              ", goodsType = " + goodsType +
              ", unit = " + unit +
              ", weight = " + weight +
              ", marketEnable = " + marketEnable +
              ", brief = " + brief +
              ", intro = " + intro +
              ", price = " + price +
              ", cost = " + cost +
              ", mktprice = " + mktprice +
              ", params = " + params +
              ", props = " + props +
              ", haveSpec = " + haveSpec +
              ", createTime = " + createTime +
              ", lastModify = " + lastModify +
              ", viewCount = " + viewCount +
              ", buyCount = " + buyCount +
              ", disabled = " + disabled +
              ", quantity = " + quantity +
              ", enableQuantity = " + enableQuantity +
              ", point = " + point +
              ", pageTitle = " + pageTitle +
              ", metaKeywords = " + metaKeywords +
              ", metaDescription = " + metaDescription +
              ", sord = " + sord +
              ", isPack = " + isPack +
              ", thumbnail = " + thumbnail +
              ", big = " + big +
              ", small = " + small +
              ", original = " + original +
              ", shopId = " + shopId +
              ", shopCatId = " + shopCatId +
              ", buyNum = " + buyNum +
              ", templateId = " + templateId +
              ", goodsTransfeeCharge = " + goodsTransfeeCharge +
              ", sellerName = " + sellerName +
              ", commission = " + commission +
              ", isAuth = " + isAuth +
              ", authMessage = " + authMessage +
                "}";
    }
}
