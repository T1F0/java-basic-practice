package com.supconit.study.generationAlgorithm.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class CustomSpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /** permitAll，全部跳过，直接访问，其余的都需要跳转到密码登录
         * denyAll，密码验证，验证成功之后也全部拒绝，403
         * 没有配置的路径就全部进入权限验证，验证成功之后即可访问
         * super.configure(http);也可以用http.formLogin();权限验证失败登录页面，弹出框用http.httpBasic();
         */
        http.
            authorizeRequests()
                .antMatchers("/user/all")
                .permitAll()
                .and()
            .authorizeRequests()
                .antMatchers("/page/findSize/*")
                .permitAll()
                .and()
            .authorizeRequests()
                .antMatchers("/swagger-ui.html")
                .permitAll()
                .and()
            .authorizeRequests()
                .antMatchers("/magic/web/*")
                .permitAll()
                .and()
            .authorizeRequests()
                .antMatchers("/user/createUser")
                .permitAll();
//                .and()
//            .authorizeRequests()
//                .antMatchers("/resources/**", "/signup", "/about").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .usernameParameter("admin")
//                .passwordParameter("111")
//                .failureForwardUrl("/login?error")
//                .loginPage("/login")
//                .permitAll()
//                .and()
//            .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/index")
//                .permitAll()
//                .and()
//                .httpBasic()
//                .disable();
        super.configure(http);
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

}
