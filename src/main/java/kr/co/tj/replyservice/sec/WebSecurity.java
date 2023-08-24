package kr.co.tj.replyservice.sec;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		 .cors()
		 .and()
		 .csrf()
		 .disable()
		 .httpBasic()
		 .disable()
		 .sessionManagement()
		 .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		http.authorizeRequests().antMatchers("/reply-service/replys/**").permitAll();
		
		http.headers().frameOptions().disable();
	}

}
