package com.potato.jwt;

import com.potato.jwt.config.JwtConfig;
import com.potato.util.time.DateUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

/**
 * jwt token操作
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class JwtToken {
    /**
     * jwt配置
     */
    private final JwtConfig jwtConfig;

    /**
     * 构造
     * @param jwtConfig
     */
    public JwtToken(JwtConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
    }

    /**
     * 一个JWT实际上就是一个字符串，它由三部分组成，头部(Header)、载荷(Payload)与签名(Signature)
     * @param payload jwt的载体信息
     * @return jwt token
     */
    public String createJWT(Map<String, Object> payload) {
        // 计算过期时间
        Date expirationDate = DateUtil.offsetSeconds(new Date(), jwtConfig.getExpiredSeconds());
        // 构造jwt token
        return Jwts.builder()
                .setClaims(payload)
                .setIssuedAt(new Date())
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, jwtConfig.getJwtSecret())
                .compact();
    }

    /**
     * 获取jwt的payload
     * @param token jwt的token
     * @return jwt的payload
     */
    public Claims parseJWT(String token) {
        return Jwts.parser()
                .setSigningKey(jwtConfig.getJwtSecret())
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * token是否过期，一般情况下还是采用比如redis存储比较好，因为jwt虽然有过期时间，但是对于一些复杂的，像踢人业务，就无能为力了
     * @param token jwt的token
     * @return 是否过期
     */
    public boolean tokenIsExpired(String token) {
        Claims claims = parseJWT(token);
        final Date expiration = claims.getExpiration();
        return expiration.before(new Date());
    }
}
