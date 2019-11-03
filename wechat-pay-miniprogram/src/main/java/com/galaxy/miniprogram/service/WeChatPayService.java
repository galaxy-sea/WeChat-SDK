package com.galaxy.miniprogram.service;

import com.galaxy.miniprogram.bean.unifiedorder.PaySignDTO;
import com.galaxy.miniprogram.bean.closeorder.CloseOrder;
import com.galaxy.miniprogram.bean.orderquery.OrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.UnifiedOrder;
import com.galaxy.miniprogram.bean.closeorder.ResultCloseOrder;
import com.galaxy.miniprogram.bean.orderquery.ResultOrderQuery;
import com.galaxy.miniprogram.bean.unifiedorder.ResultUnifiedOrder;
import com.galaxy.miniprogram.util.SignType;

/**
 * @author galaxy
 */
public interface WeChatPayService {


    /**
     * 统一下单
     * 应用场景
     * 商户在小程序中先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易后调起支付。
     * 接口链接
     * URL地址：https://api.mch.weixin.qq.com/pay/unifiedorder
     */

    ResultUnifiedOrder unifiedOrder(UnifiedOrder unifiedOrder, SignType signType, String key) throws Exception;


    /**
     * 小程序调起支付数据签名字段列表：
     * 字段名	变量名	必填	类型	示例值	描述
     * 小程序ID	appId	是	String	wxd678efh567hg6787	微信分配的小程序ID
     * 时间戳	timeStamp	是	String	1490840662	时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间
     * 随机串	nonceStr	是	String	5K8264ILTKCH16CQ2502SI8ZNMTM67VS	随机字符串，不长于32位。推荐随机数生成算法
     * 数据包	package	是	String	prepay_id=wx2017033010242291fcfe0db70013231072	统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=wx2017033010242291fcfe0db70013231072
     * 签名方式	signType	是	String	MD5	签名类型，默认为MD5，支持HMAC-SHA256和MD5。注意此处需与统一下单的签名类型一致
     *
     * @param resultUnifiedOrder
     * @param signType
     * @param key
     * @return
     * @throws Exception
     */
    PaySignDTO toPaySignDTO(ResultUnifiedOrder resultUnifiedOrder, SignType signType, String key) throws Exception;


    ResultOrderQuery orderQuery(OrderQuery orderQuery, SignType signType, String key) throws Exception;


    ResultCloseOrder closeOrder(CloseOrder closeOrder, SignType signType, String key) throws Exception;
}
