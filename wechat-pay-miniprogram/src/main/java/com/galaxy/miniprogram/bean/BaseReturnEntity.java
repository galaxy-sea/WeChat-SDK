package com.galaxy.miniprogram.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 返回格式
 * <xml>
 * <return_code><![CDATA[SUCCESS]]></return_code>
 * <return_msg><![CDATA[OK]]></return_msg>
 * <appid><![CDATA[wx2421b1c4370ec43b]]></appid>
 * <mch_id><![CDATA[10000100]]></mch_id>
 * <nonce_str><![CDATA[IITRi8Iabbblz1Jc]]></nonce_str>
 * <openid><![CDATA[oUpF8uMuAJO_M2pxb1Q9zNjWeS6o]]></openid>
 * <sign><![CDATA[7921E432F65EB8ED0CE9755F0E86D72F]]></sign>
 * <result_code><![CDATA[SUCCESS]]></result_code>
 * <prepay_id><![CDATA[wx201411101639507cbf6ffd8b0779950874]]></prepay_id>
 * <trade_type><![CDATA[JSAPI]]></trade_type>
 * </xml>
 *
 *
 *
 * 错误代码	err_code的详细信息
 *
 * 字段名	变量名	必填	类型	示例值	描述
 * INVALID_REQUEST	参数错误	参数格式有误或者未按规则上传	订单重入时，要求参数值与原请求一致，请确认参数问题
 * NOAUTH	商户无此接口权限	商户未开通此接口权限	请商户前往申请此接口权限
 * NOTENOUGH	余额不足	用户帐号余额不足	用户帐号余额不足，请用户充值或更换支付卡后再支付
 * ORDERPAID	商户订单已支付	商户订单已支付，无需重复操作	商户订单已支付，无需更多操作
 * ORDERCLOSED	订单已关闭	当前订单已关闭，无法支付	当前订单已关闭，请重新下单
 * SYSTEMERROR	系统错误	系统超时	系统异常，请用相同参数重新调用
 * APPID_NOT_EXIST	APPID不存在	参数中缺少APPID	请检查APPID是否正确
 * MCHID_NOT_EXIST	MCHID不存在	参数中缺少MCHID	请检查MCHID是否正确
 * APPID_MCHID_NOT_MATCH	appid和mch_id不匹配	appid和mch_id不匹配	请确认appid和mch_id是否匹配
 * LACK_PARAMS	缺少参数	缺少必要的请求参数	请检查参数是否齐全
 * OUT_TRADE_NO_USED	商户订单号重复	同一笔交易不能多次提交	请核实商户订单号是否重复提交
 * SIGNERROR	签名错误	参数签名结果不正确	请检查签名参数和方法是否都符合签名算法要求
 * XML_FORMAT_ERROR	XML格式错误	XML格式错误	请检查XML参数格式是否正确
 * REQUIRE_POST_METHOD	请使用post方法	未使用post传递参数 	请检查请求参数是否通过post方法提交
 * POST_DATA_EMPTY	post数据为空	post数据不能为空	请检查post数据是否为空
 * NOT_UTF8	编码格式错误	未使用指定编码格式	请使用UTF-8编码格式
 *
 * ORDERNOTEXIST	此交易订单号不存在	查询系统中不存在此交易订单号	该API只能查提交支付交易返回成功的订单，请商户检查需要查询的订单号是否正确
 * SYSTEMERROR	系统错误	后台系统返回错误	系统异常，请再调用发起查询
 *
 *
 * ORDERPAID	订单已支付	订单已支付，不能发起关单	订单已支付，不能发起关单，请当作已支付的正常交易
 * SYSTEMERROR	系统错误	系统错误	系统异常，请重新调用该API
 * ORDERCLOSED	订单已关闭	订单已关闭，无法重复关闭	订单已关闭，无需继续调用
 * SIGNERROR	签名错误	参数签名结果不正确	请检查签名参数和方法是否都符合签名算法要求
 * REQUIRE_POST_METHOD	请使用post方法	未使用post传递参数 	请检查请求参数是否通过post方法提交
 * XML_FORMAT_ERROR	XML格式错误	XML格式错误	请检查XML参数格式是否正确
 *
 *
 * SYSTEMERROR	接口返回错误	系统超时等	请不要更换商户退款单号，请使用相同参数再次调用API。
 * BIZERR_NEED_RETRY	退款业务流程错误，需要商户触发重试来解决	并发情况下，业务被拒绝，商户重试即可解决	请不要更换商户退款单号，请使用相同参数再次调用API。
 * TRADE_OVERDUE	订单已经超过退款期限	订单已经超过可退款的最大期限(支付后一年内可退款)	请选择其他方式自行退款
 * ERROR	业务错误	申请退款业务发生错误	该错误都会返回具体的错误原因，请根据实际返回做相应处理。
 * USER_ACCOUNT_ABNORMAL	退款请求失败	用户帐号注销	此状态代表退款申请失败，商户可自行处理退款。
 * INVALID_REQ_TOO_MUCH	无效请求过多	连续错误请求数过多被系统短暂屏蔽	请检查业务是否正常，确认业务正常后请在1分钟后再来重试
 * NOTENOUGH	余额不足	商户可用退款余额不足	此状态代表退款申请失败，商户可根据具体的错误提示做相应的处理。
 * INVALID_TRANSACTIONID	无效transaction_id	请求参数未按指引进行填写	请求参数错误，检查原交易号是否存在或发起支付交易接口返回失败
 * PARAM_ERROR	参数错误	请求参数未按指引进行填写	请求参数错误，请重新检查再调用退款申请
 * APPID_NOT_EXIST	APPID不存在	参数中缺少APPID	请检查APPID是否正确
 * MCHID_NOT_EXIST	MCHID不存在	参数中缺少MCHID	请检查MCHID是否正确
 * REQUIRE_POST_METHOD	请使用post方法	未使用post传递参数 	请检查请求参数是否通过post方法提交
 * SIGNERROR	签名错误	参数签名结果不正确	请检查签名参数和方法是否都符合签名算法要求
 * XML_FORMAT_ERROR	XML格式错误	XML格式错误	请检查XML参数格式是否正确
 * FREQUENCY_LIMITED	频率限制	2个月之前的订单申请退款有频率限制	该笔退款未受理，请降低频率后重试
 *
 * @author galaxy
 */
public abstract class BaseReturnEntity extends BaseEntity {
    /**
     * 返回状态码
     * 是
     * SUCCESS/FAIL
     * 此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "return_code")
    protected String returnCode;

    /**
     * 返回信息
     * 否
     * 返回信息，如非空，为错误原因
     * 签名失败
     * 参数格式校验错误
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "return_msg")
    protected String returnMsg;

    // =======================以下字段在return_code为SUCCESS的时候有返回====================================

    /**
     * 业务结果
     * 是
     * SUCCESS/FAIL
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "result_code")
    protected String resultCode;

    /**
     * 业务结果
     * 是
     * SUCCESS/FAIL
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "result_msg")
    protected String resultMsg;

    /**
     * 错误代码
     * 否
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "err_code")
    protected String errCode;

    /**
     * 错误代码描述
     * 否
     * 错误信息描述
     */
    @JacksonXmlCData
    @JacksonXmlProperty(localName = "err_code_des")
    protected String errCodeDes;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    @Override
    public String toString() {
        return "BaseReturnEntity{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errCodeDes='" + errCodeDes + '\'' +
                "} " + super.toString();
    }
}
