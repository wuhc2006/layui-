package com.yhxd.sk.om.model.gen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "om_order")
public abstract class AbstractOmOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * �û�id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * �û�����ȫ��
     */
    @Column(name = "user_full_name")
    private String userFullName;

    /**
     * �û���Ա�����
     */
    @Column(name = "org_user_no")
    private String orgUserNo;

    /**
     * �û�������ҵid
     */
    @Column(name = "org_id")
    private Integer orgId;

    /**
     * ����״̬@om_catalog_status ����
     */
    @Column(name = "status_id")
    private Integer statusId;

    /**
     * ��������
     */
    private String title;

    /**
     * �������. yyMMddHH+6λ˳���
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * �̼�id
     */
    @Column(name = "shop_id")
    private Integer shopId;

    /**
     * �̼ұ���
     */
    @Column(name = "shop_title")
    private String shopTitle;

    /**
     * ��ƷͼƬURL
     */
    @Column(name = "item_icon_url")
    private String itemIconUrl;

    /**
     * �̼�LOGO URL
     */
    @Column(name = "shop_icon_url")
    private String shopIconUrl;

    /**
     * ��Ʒ����
     */
    @Column(name = "total_item")
    private Integer totalItem;

    /**
     * ��Ʒ�ܼ�
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    /**
     * ������֧�����
     */
    @Column(name = "total_paid")
    private BigDecimal totalPaid;

    /**
     * ��װ��
     */
    @Column(name = "pack_fee")
    private BigDecimal packFee;

    /**
     * ���ͷ�
     */
    @Column(name = "delivery_fee")
    private BigDecimal deliveryFee;

    /**
     * ����Ӧ���ܽ��=��Ʒ�ܼ�+��װ+����
     */
    @Column(name = "total_pay")
    private BigDecimal totalPay;

    /**
     * ֧����ʽ. (10:�Թ�֧��,20:΢��,30:֧����)
     */
    @Column(name = "pay_mode")
    private Integer payMode;

    /**
     * ��ֹ֧��ʱ��
     */
    @Column(name = "pay_end_time")
    private Date payEndTime;

    /**
     * ֧�����ʱ��
     */
    @Column(name = "paid_time")
    private Date paidTime;

    /**
     * �ʹ�ʱ�䷶Χ-��ʼ
     */
    @Column(name = "delivery_start_time")
    private Date deliveryStartTime;

    /**
     * �ʹ�ʱ�䷶Χ-����
     */
    @Column(name = "delivery_end_time")
    private Date deliveryEndTime;

    /**
     * �ʹ��ַȫ��
     */
    @Column(name = "delivery_address")
    private String deliveryAddress;

    /**
     * ���ͷ�ʽ. 10:ƽ̨����,20:�̼�����
     */
    @Column(name = "delivery_mode")
    private Integer deliveryMode;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * ����״̬��0:Ĭ��,1:������,2:�������)
     */
    @Column(name = "comment_status_id")
    private Integer commentStatusId;

    /**
     * ���۷�ʽ. 1:��������,2:��������
     */
    @Column(name = "comment_mode")
    private Integer commentMode;

    /**
     * �������ʱ��
     */
    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * �˿�״̬��0:Ĭ��,1:������,2:��ʵ��,3:�ܾ��˿�,4:�˿������,5:�˿����)
     */
    @Column(name = "refund_status_id")
    private Integer refundStatusId;

    /**
     * �˿ʽ. 1:ԭ������
     */
    @Column(name = "refund_mode")
    private Integer refundMode;

    /**
     * �˿����ʱ��
     */
    @Column(name = "refund_time")
    private Date refundTime;

    /**
     * �µ��Ựid
     */
    @Column(name = "session_id")
    private String sessionId;

    /**
     * ��ע
     */
    private String remark;

    /**
     * ��������. 1:���충��,2:Ԥ�µ�,3:��ʱ����
     */
    @Column(name = "order_kind")
    private Integer orderKind;

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
     * ��ȡ�û�id
     *
     * @return user_id - �û�id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * �����û�id
     *
     * @param userId �û�id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ�û�����ȫ��
     *
     * @return user_full_name - �û�����ȫ��
     */
    public String getUserFullName() {
        return userFullName;
    }

    /**
     * �����û�����ȫ��
     *
     * @param userFullName �û�����ȫ��
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName == null ? null : userFullName.trim();
    }

    /**
     * ��ȡ�û���Ա�����
     *
     * @return org_user_no - �û���Ա�����
     */
    public String getOrgUserNo() {
        return orgUserNo;
    }

    /**
     * �����û���Ա�����
     *
     * @param orgUserNo �û���Ա�����
     */
    public void setOrgUserNo(String orgUserNo) {
        this.orgUserNo = orgUserNo == null ? null : orgUserNo.trim();
    }

    /**
     * ��ȡ�û�������ҵid
     *
     * @return org_id - �û�������ҵid
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * �����û�������ҵid
     *
     * @param orgId �û�������ҵid
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * ��ȡ����״̬@om_catalog_status ����
     *
     * @return status_id - ����״̬@om_catalog_status ����
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * ���ö���״̬@om_catalog_status ����
     *
     * @param statusId ����״̬@om_catalog_status ����
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * ��ȡ��������
     *
     * @return title - ��������
     */
    public String getTitle() {
        return title;
    }

    /**
     * ���ö�������
     *
     * @param title ��������
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * ��ȡ�������. yyMMddHH+6λ˳���
     *
     * @return order_no - �������. yyMMddHH+6λ˳���
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * ���ö������. yyMMddHH+6λ˳���
     *
     * @param orderNo �������. yyMMddHH+6λ˳���
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * ��ȡ�̼�id
     *
     * @return shop_id - �̼�id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * �����̼�id
     *
     * @param shopId �̼�id
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * ��ȡ�̼ұ���
     *
     * @return shop_title - �̼ұ���
     */
    public String getShopTitle() {
        return shopTitle;
    }

    /**
     * �����̼ұ���
     *
     * @param shopTitle �̼ұ���
     */
    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle == null ? null : shopTitle.trim();
    }

    /**
     * ��ȡ��ƷͼƬURL
     *
     * @return item_icon_url - ��ƷͼƬURL
     */
    public String getItemIconUrl() {
        return itemIconUrl;
    }

    /**
     * ������ƷͼƬURL
     *
     * @param itemIconUrl ��ƷͼƬURL
     */
    public void setItemIconUrl(String itemIconUrl) {
        this.itemIconUrl = itemIconUrl == null ? null : itemIconUrl.trim();
    }

    /**
     * ��ȡ�̼�LOGO URL
     *
     * @return shop_icon_url - �̼�LOGO URL
     */
    public String getShopIconUrl() {
        return shopIconUrl;
    }

    /**
     * �����̼�LOGO URL
     *
     * @param shopIconUrl �̼�LOGO URL
     */
    public void setShopIconUrl(String shopIconUrl) {
        this.shopIconUrl = shopIconUrl == null ? null : shopIconUrl.trim();
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return total_item - ��Ʒ����
     */
    public Integer getTotalItem() {
        return totalItem;
    }

    /**
     * ������Ʒ����
     *
     * @param totalItem ��Ʒ����
     */
    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

    /**
     * ��ȡ��Ʒ�ܼ�
     *
     * @return total_price - ��Ʒ�ܼ�
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * ������Ʒ�ܼ�
     *
     * @param totalPrice ��Ʒ�ܼ�
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * ��ȡ������֧�����
     *
     * @return total_paid - ������֧�����
     */
    public BigDecimal getTotalPaid() {
        return totalPaid;
    }

    /**
     * ���ö�����֧�����
     *
     * @param totalPaid ������֧�����
     */
    public void setTotalPaid(BigDecimal totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     * ��ȡ��װ��
     *
     * @return pack_fee - ��װ��
     */
    public BigDecimal getPackFee() {
        return packFee;
    }

    /**
     * ���ð�װ��
     *
     * @param packFee ��װ��
     */
    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    /**
     * ��ȡ���ͷ�
     *
     * @return delivery_fee - ���ͷ�
     */
    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * �������ͷ�
     *
     * @param deliveryFee ���ͷ�
     */
    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * ��ȡ����Ӧ���ܽ��=��Ʒ�ܼ�+��װ+����
     *
     * @return total_pay - ����Ӧ���ܽ��=��Ʒ�ܼ�+��װ+����
     */
    public BigDecimal getTotalPay() {
        return totalPay;
    }

    /**
     * ���ö���Ӧ���ܽ��=��Ʒ�ܼ�+��װ+����
     *
     * @param totalPay ����Ӧ���ܽ��=��Ʒ�ܼ�+��װ+����
     */
    public void setTotalPay(BigDecimal totalPay) {
        this.totalPay = totalPay;
    }

    /**
     * ��ȡ֧����ʽ. (10:�Թ�֧��,20:΢��,30:֧����)
     *
     * @return pay_mode - ֧����ʽ. (10:�Թ�֧��,20:΢��,30:֧����)
     */
    public Integer getPayMode() {
        return payMode;
    }

    /**
     * ����֧����ʽ. (10:�Թ�֧��,20:΢��,30:֧����)
     *
     * @param payMode ֧����ʽ. (10:�Թ�֧��,20:΢��,30:֧����)
     */
    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    /**
     * ��ȡ��ֹ֧��ʱ��
     *
     * @return pay_end_time - ��ֹ֧��ʱ��
     */
    public Date getPayEndTime() {
        return payEndTime;
    }

    /**
     * ���ý�ֹ֧��ʱ��
     *
     * @param payEndTime ��ֹ֧��ʱ��
     */
    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    /**
     * ��ȡ֧�����ʱ��
     *
     * @return paid_time - ֧�����ʱ��
     */
    public Date getPaidTime() {
        return paidTime;
    }

    /**
     * ����֧�����ʱ��
     *
     * @param paidTime ֧�����ʱ��
     */
    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    /**
     * ��ȡ�ʹ�ʱ�䷶Χ-��ʼ
     *
     * @return delivery_start_time - �ʹ�ʱ�䷶Χ-��ʼ
     */
    public Date getDeliveryStartTime() {
        return deliveryStartTime;
    }

    /**
     * �����ʹ�ʱ�䷶Χ-��ʼ
     *
     * @param deliveryStartTime �ʹ�ʱ�䷶Χ-��ʼ
     */
    public void setDeliveryStartTime(Date deliveryStartTime) {
        this.deliveryStartTime = deliveryStartTime;
    }

    /**
     * ��ȡ�ʹ�ʱ�䷶Χ-����
     *
     * @return delivery_end_time - �ʹ�ʱ�䷶Χ-����
     */
    public Date getDeliveryEndTime() {
        return deliveryEndTime;
    }

    /**
     * �����ʹ�ʱ�䷶Χ-����
     *
     * @param deliveryEndTime �ʹ�ʱ�䷶Χ-����
     */
    public void setDeliveryEndTime(Date deliveryEndTime) {
        this.deliveryEndTime = deliveryEndTime;
    }

    /**
     * ��ȡ�ʹ��ַȫ��
     *
     * @return delivery_address - �ʹ��ַȫ��
     */
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * �����ʹ��ַȫ��
     *
     * @param deliveryAddress �ʹ��ַȫ��
     */
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    /**
     * ��ȡ���ͷ�ʽ. 10:ƽ̨����,20:�̼�����
     *
     * @return delivery_mode - ���ͷ�ʽ. 10:ƽ̨����,20:�̼�����
     */
    public Integer getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * �������ͷ�ʽ. 10:ƽ̨����,20:�̼�����
     *
     * @param deliveryMode ���ͷ�ʽ. 10:ƽ̨����,20:�̼�����
     */
    public void setDeliveryMode(Integer deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ���ô���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_time - ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateTime ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * ��ȡ����״̬��0:Ĭ��,1:������,2:�������)
     *
     * @return comment_status_id - ����״̬��0:Ĭ��,1:������,2:�������)
     */
    public Integer getCommentStatusId() {
        return commentStatusId;
    }

    /**
     * ��������״̬��0:Ĭ��,1:������,2:�������)
     *
     * @param commentStatusId ����״̬��0:Ĭ��,1:������,2:�������)
     */
    public void setCommentStatusId(Integer commentStatusId) {
        this.commentStatusId = commentStatusId;
    }

    /**
     * ��ȡ���۷�ʽ. 1:��������,2:��������
     *
     * @return comment_mode - ���۷�ʽ. 1:��������,2:��������
     */
    public Integer getCommentMode() {
        return commentMode;
    }

    /**
     * �������۷�ʽ. 1:��������,2:��������
     *
     * @param commentMode ���۷�ʽ. 1:��������,2:��������
     */
    public void setCommentMode(Integer commentMode) {
        this.commentMode = commentMode;
    }

    /**
     * ��ȡ�������ʱ��
     *
     * @return comment_time - �������ʱ��
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * �����������ʱ��
     *
     * @param commentTime �������ʱ��
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * ��ȡ�˿�״̬��0:Ĭ��,1:������,2:��ʵ��,3:�ܾ��˿�,4:�˿������,5:�˿����)
     *
     * @return refund_status_id - �˿�״̬��0:Ĭ��,1:������,2:��ʵ��,3:�ܾ��˿�,4:�˿������,5:�˿����)
     */
    public Integer getRefundStatusId() {
        return refundStatusId;
    }

    /**
     * �����˿�״̬��0:Ĭ��,1:������,2:��ʵ��,3:�ܾ��˿�,4:�˿������,5:�˿����)
     *
     * @param refundStatusId �˿�״̬��0:Ĭ��,1:������,2:��ʵ��,3:�ܾ��˿�,4:�˿������,5:�˿����)
     */
    public void setRefundStatusId(Integer refundStatusId) {
        this.refundStatusId = refundStatusId;
    }

    /**
     * ��ȡ�˿ʽ. 1:ԭ������
     *
     * @return refund_mode - �˿ʽ. 1:ԭ������
     */
    public Integer getRefundMode() {
        return refundMode;
    }

    /**
     * �����˿ʽ. 1:ԭ������
     *
     * @param refundMode �˿ʽ. 1:ԭ������
     */
    public void setRefundMode(Integer refundMode) {
        this.refundMode = refundMode;
    }

    /**
     * ��ȡ�˿����ʱ��
     *
     * @return refund_time - �˿����ʱ��
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * �����˿����ʱ��
     *
     * @param refundTime �˿����ʱ��
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * ��ȡ�µ��Ựid
     *
     * @return session_id - �µ��Ựid
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * �����µ��Ựid
     *
     * @param sessionId �µ��Ựid
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    /**
     * ��ȡ��ע
     *
     * @return remark - ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���ñ�ע
     *
     * @param remark ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * ��ȡ��������. 1:���충��,2:Ԥ�µ�,3:��ʱ����
     *
     * @return order_kind - ��������. 1:���충��,2:Ԥ�µ�,3:��ʱ����
     */
    public Integer getOrderKind() {
        return orderKind;
    }

    /**
     * ���ö�������. 1:���충��,2:Ԥ�µ�,3:��ʱ����
     *
     * @param orderKind ��������. 1:���충��,2:Ԥ�µ�,3:��ʱ����
     */
    public void setOrderKind(Integer orderKind) {
        this.orderKind = orderKind;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AbstractOmOrder other = (AbstractOmOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserFullName() == null ? other.getUserFullName() == null : this.getUserFullName().equals(other.getUserFullName()))
            && (this.getOrgUserNo() == null ? other.getOrgUserNo() == null : this.getOrgUserNo().equals(other.getOrgUserNo()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getStatusId() == null ? other.getStatusId() == null : this.getStatusId().equals(other.getStatusId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getShopTitle() == null ? other.getShopTitle() == null : this.getShopTitle().equals(other.getShopTitle()))
            && (this.getItemIconUrl() == null ? other.getItemIconUrl() == null : this.getItemIconUrl().equals(other.getItemIconUrl()))
            && (this.getShopIconUrl() == null ? other.getShopIconUrl() == null : this.getShopIconUrl().equals(other.getShopIconUrl()))
            && (this.getTotalItem() == null ? other.getTotalItem() == null : this.getTotalItem().equals(other.getTotalItem()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
            && (this.getTotalPaid() == null ? other.getTotalPaid() == null : this.getTotalPaid().equals(other.getTotalPaid()))
            && (this.getPackFee() == null ? other.getPackFee() == null : this.getPackFee().equals(other.getPackFee()))
            && (this.getDeliveryFee() == null ? other.getDeliveryFee() == null : this.getDeliveryFee().equals(other.getDeliveryFee()))
            && (this.getTotalPay() == null ? other.getTotalPay() == null : this.getTotalPay().equals(other.getTotalPay()))
            && (this.getPayMode() == null ? other.getPayMode() == null : this.getPayMode().equals(other.getPayMode()))
            && (this.getPayEndTime() == null ? other.getPayEndTime() == null : this.getPayEndTime().equals(other.getPayEndTime()))
            && (this.getPaidTime() == null ? other.getPaidTime() == null : this.getPaidTime().equals(other.getPaidTime()))
            && (this.getDeliveryStartTime() == null ? other.getDeliveryStartTime() == null : this.getDeliveryStartTime().equals(other.getDeliveryStartTime()))
            && (this.getDeliveryEndTime() == null ? other.getDeliveryEndTime() == null : this.getDeliveryEndTime().equals(other.getDeliveryEndTime()))
            && (this.getDeliveryAddress() == null ? other.getDeliveryAddress() == null : this.getDeliveryAddress().equals(other.getDeliveryAddress()))
            && (this.getDeliveryMode() == null ? other.getDeliveryMode() == null : this.getDeliveryMode().equals(other.getDeliveryMode()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCommentStatusId() == null ? other.getCommentStatusId() == null : this.getCommentStatusId().equals(other.getCommentStatusId()))
            && (this.getCommentMode() == null ? other.getCommentMode() == null : this.getCommentMode().equals(other.getCommentMode()))
            && (this.getCommentTime() == null ? other.getCommentTime() == null : this.getCommentTime().equals(other.getCommentTime()))
            && (this.getRefundStatusId() == null ? other.getRefundStatusId() == null : this.getRefundStatusId().equals(other.getRefundStatusId()))
            && (this.getRefundMode() == null ? other.getRefundMode() == null : this.getRefundMode().equals(other.getRefundMode()))
            && (this.getRefundTime() == null ? other.getRefundTime() == null : this.getRefundTime().equals(other.getRefundTime()))
            && (this.getSessionId() == null ? other.getSessionId() == null : this.getSessionId().equals(other.getSessionId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOrderKind() == null ? other.getOrderKind() == null : this.getOrderKind().equals(other.getOrderKind()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserFullName() == null) ? 0 : getUserFullName().hashCode());
        result = prime * result + ((getOrgUserNo() == null) ? 0 : getOrgUserNo().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getStatusId() == null) ? 0 : getStatusId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getShopTitle() == null) ? 0 : getShopTitle().hashCode());
        result = prime * result + ((getItemIconUrl() == null) ? 0 : getItemIconUrl().hashCode());
        result = prime * result + ((getShopIconUrl() == null) ? 0 : getShopIconUrl().hashCode());
        result = prime * result + ((getTotalItem() == null) ? 0 : getTotalItem().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
        result = prime * result + ((getTotalPaid() == null) ? 0 : getTotalPaid().hashCode());
        result = prime * result + ((getPackFee() == null) ? 0 : getPackFee().hashCode());
        result = prime * result + ((getDeliveryFee() == null) ? 0 : getDeliveryFee().hashCode());
        result = prime * result + ((getTotalPay() == null) ? 0 : getTotalPay().hashCode());
        result = prime * result + ((getPayMode() == null) ? 0 : getPayMode().hashCode());
        result = prime * result + ((getPayEndTime() == null) ? 0 : getPayEndTime().hashCode());
        result = prime * result + ((getPaidTime() == null) ? 0 : getPaidTime().hashCode());
        result = prime * result + ((getDeliveryStartTime() == null) ? 0 : getDeliveryStartTime().hashCode());
        result = prime * result + ((getDeliveryEndTime() == null) ? 0 : getDeliveryEndTime().hashCode());
        result = prime * result + ((getDeliveryAddress() == null) ? 0 : getDeliveryAddress().hashCode());
        result = prime * result + ((getDeliveryMode() == null) ? 0 : getDeliveryMode().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCommentStatusId() == null) ? 0 : getCommentStatusId().hashCode());
        result = prime * result + ((getCommentMode() == null) ? 0 : getCommentMode().hashCode());
        result = prime * result + ((getCommentTime() == null) ? 0 : getCommentTime().hashCode());
        result = prime * result + ((getRefundStatusId() == null) ? 0 : getRefundStatusId().hashCode());
        result = prime * result + ((getRefundMode() == null) ? 0 : getRefundMode().hashCode());
        result = prime * result + ((getRefundTime() == null) ? 0 : getRefundTime().hashCode());
        result = prime * result + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOrderKind() == null) ? 0 : getOrderKind().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userFullName=").append(userFullName);
        sb.append(", orgUserNo=").append(orgUserNo);
        sb.append(", orgId=").append(orgId);
        sb.append(", statusId=").append(statusId);
        sb.append(", title=").append(title);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", shopId=").append(shopId);
        sb.append(", shopTitle=").append(shopTitle);
        sb.append(", itemIconUrl=").append(itemIconUrl);
        sb.append(", shopIconUrl=").append(shopIconUrl);
        sb.append(", totalItem=").append(totalItem);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", totalPaid=").append(totalPaid);
        sb.append(", packFee=").append(packFee);
        sb.append(", deliveryFee=").append(deliveryFee);
        sb.append(", totalPay=").append(totalPay);
        sb.append(", payMode=").append(payMode);
        sb.append(", payEndTime=").append(payEndTime);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", deliveryStartTime=").append(deliveryStartTime);
        sb.append(", deliveryEndTime=").append(deliveryEndTime);
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append(", deliveryMode=").append(deliveryMode);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", commentStatusId=").append(commentStatusId);
        sb.append(", commentMode=").append(commentMode);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", refundStatusId=").append(refundStatusId);
        sb.append(", refundMode=").append(refundMode);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", sessionId=").append(sessionId);
        sb.append(", remark=").append(remark);
        sb.append(", orderKind=").append(orderKind);
        sb.append("]");
        return sb.toString();
    }
}