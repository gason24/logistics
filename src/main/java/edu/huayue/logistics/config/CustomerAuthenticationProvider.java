package edu.huayue.logistics.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.DigestUtils;

/**
 * @program: logistics
 * @description: 自定义身份验证组件
 * @author: Gason Lee
 * @create: 2019-02-17 15:26
 **/
public class CustomerAuthenticationProvider implements AuthenticationProvider {

    private UserDetailsService userDetailsService;

    public CustomerAuthenticationProvider(UserDetailsService userDetailsService){
        this.userDetailsService = userDetailsService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // 获取认证的用户名和密码
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();

        // 认证逻辑
        UserDetails userDetails = userDetailsService.loadUserByUsername(name);
        if(userDetails != null){
            // md5加密
            String encodePassword = DigestUtils.md5DigestAsHex(password.getBytes());
            if (userDetails.getPassword().equals(encodePassword)){
                // 这里设置权限和角色

            }
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
