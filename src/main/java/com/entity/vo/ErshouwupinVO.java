package com.entity.vo;

import com.entity.ErshouwupinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 二手物品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-04
 */
@TableName("ershouwupin")
public class ErshouwupinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物品名称
     */

    @TableField(value = "ershouwupin_name")
    private String ershouwupinName;


    /**
     * 物品类型
     */

    @TableField(value = "ershouwupin_types")
    private Integer ershouwupinTypes;


    /**
     * 物品图片
     */

    @TableField(value = "ershouwupin_photo")
    private String ershouwupinPhoto;


    /**
     * 发布用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 价格
     */

    @TableField(value = "ershouwupin_money")
    private Double ershouwupinMoney;


    /**
     * 详情信息
     */

    @TableField(value = "ershouwupin_content")
    private String ershouwupinContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow.
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物品名称
	 */
    public String getErshouwupinName() {
        return ershouwupinName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setErshouwupinName(String ershouwupinName) {
        this.ershouwupinName = ershouwupinName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getErshouwupinTypes() {
        return ershouwupinTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setErshouwupinTypes(Integer ershouwupinTypes) {
        this.ershouwupinTypes = ershouwupinTypes;
    }
    /**
	 * 设置：物品图片
	 */
    public String getErshouwupinPhoto() {
        return ershouwupinPhoto;
    }


    /**
	 * 获取：物品图片
	 */

    public void setErshouwupinPhoto(String ershouwupinPhoto) {
        this.ershouwupinPhoto = ershouwupinPhoto;
    }
    /**
	 * 设置：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：价格
	 */
    public Double getErshouwupinMoney() {
        return ershouwupinMoney;
    }


    /**
	 * 获取：价格
	 */

    public void setErshouwupinMoney(Double ershouwupinMoney) {
        this.ershouwupinMoney = ershouwupinMoney;
    }
    /**
	 * 设置：详情信息
	 */
    public String getErshouwupinContent() {
        return ershouwupinContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setErshouwupinContent(String ershouwupinContent) {
        this.ershouwupinContent = ershouwupinContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow.
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow.
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
