package com.common.http.base;

/**
 * 请求携带参数client
 * Created by anzhuo on 2016/1/25.
 */
public class AppClient {
    /**
     * 手机型号/制造商
     */
    public String model;
    /**
     * 操作系统及版本
     */
    public String os;
    /**
     * 浏览器信息
     */
    public String browser;
    /**
     * 设备唯一标识号
     */
    public String uniqid;
    /**
     * 屏幕分辨率
     */
    public String screen;
    /**
     * 字体
     */
    public String font;

    /**
     * 网卡MAC地址
     */
    public String mac;
    /**
     * 其他信息
     */
    public String other;
    /**
     * 推送消息token
     */
    public String pushTocken;
    /**
     * 是否企业版标志
     */
    public String ent;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AppClient [");
        if (model != null) {
            builder.append("model=");
            builder.append(model);
            builder.append(", ");
        }
        if (os != null) {
            builder.append("os=");
            builder.append(os);
            builder.append(", ");
        }
        if (browser != null) {
            builder.append("browser=");
            builder.append(browser);
            builder.append(", ");
        }
        if (uniqid != null) {
            builder.append("uniqid=");
            builder.append(uniqid);
            builder.append(", ");
        }
        if (screen != null) {
            builder.append("screen=");
            builder.append(screen);
            builder.append(", ");
        }
        if (font != null) {
            builder.append("font=");
            builder.append(font);
            builder.append(", ");
        }
        if (mac != null) {
            builder.append("mac=");
            builder.append(mac);
            builder.append(", ");
        }
        if (other != null) {
            builder.append("other=");
            builder.append(other);
            builder.append(", ");
        }
        if (pushTocken != null) {
            builder.append("pushTocken=");
            builder.append(pushTocken);
        }
        builder.append("]");
        return builder.toString();
    }
}
