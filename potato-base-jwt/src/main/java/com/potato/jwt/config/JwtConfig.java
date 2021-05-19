package com.potato.jwt.config;

/**
 * jwt配置
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class JwtConfig {
    /**
     * 秘钥
     */
    private String jwtSecret;

    /**
     * 过期时间（秒）
     */
    private int expiredSeconds;

    public String getJwtSecret() {
        return jwtSecret;
    }

    public void setJwtSecret(String jwtSecret) {
        this.jwtSecret = jwtSecret;
    }

    public int getExpiredSeconds() {
        return expiredSeconds;
    }

    public void setExpiredSeconds(int expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
    }
}
