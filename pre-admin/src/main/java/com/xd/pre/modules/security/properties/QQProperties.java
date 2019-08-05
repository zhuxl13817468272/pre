package com.xd.pre.modules.security.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.social.autoconfigure.SocialProperties;

/**
 * @Classname QQProperties
 * @Description QQ第三方登录配置
 * @Author Created by Lihaodong (alias:小东啊) lihaodongmail@163.com
 * @Date 2019-07-08 20:16
 * @Version 1.0
 */
@Setter
@Getter
public class QQProperties extends SocialProperties {

    private String appId;
    private String appSecret;
    private String providerId = "qq";
}
