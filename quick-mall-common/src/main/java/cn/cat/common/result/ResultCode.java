package cn.cat.common.result;

/**
 * @Author:
 * @Description:
 * @Date: Create in 00:05 17/7/4
 * @Modified by: 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {

    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    public Integer code;

    ResultCode(Integer code) {
        this.code = code;
    }
}
