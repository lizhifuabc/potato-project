package com.poato.jwt;

import com.potato.jwt.JwtToken;
import com.potato.jwt.config.JwtConfig;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * JwtToken
 *
 * @author lizhifu
 * @date 2021/5/19
 */
public class JwtTokenTest {
    @Test
    public void test(){
        Map<String, Object> payload = new HashMap<>();
        JwtConfig jwtConfig = new JwtConfig();
        jwtConfig.setJwtSecret("9NxhT1FPp55QgqSl");
        jwtConfig.setExpiredSeconds(50);

        JwtToken jwtToken = new JwtToken(jwtConfig);
        String toekn = jwtToken.createJWT(payload);
        System.out.println(jwtToken.parseJWT(toekn));
    }
}
