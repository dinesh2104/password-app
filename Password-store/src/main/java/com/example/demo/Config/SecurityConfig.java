package com.example.demo.Config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/signup").permitAll();
//		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll();
//		http.csrf().disable();

		http.authorizeRequests().anyRequest().permitAll();
	}

}
