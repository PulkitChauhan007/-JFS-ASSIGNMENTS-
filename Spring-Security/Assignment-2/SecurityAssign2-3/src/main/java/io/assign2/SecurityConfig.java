package io.assign2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	 @Autowired
	    CustomSuccessHandler customSuccessHandler;
	@Override protected void configure(AuthenticationManagerBuilder auth) throws
	Exception { 
		auth.inMemoryAuthentication()
		.withUser("test") .password("$2a$12$7mragpiYgIjREa550leOzOurMmmPxH.kKahW.Z/rIQABhFjWe8zX2") //pulk
		.roles("USER")
		.and() 
		.withUser("ADMIN")
		.password("$2a$12$7mragpiYgIjREa550leOzOurMmmPxH.kKahW.Z/rIQABhFjWe8zX2")  //pulk
		.roles("ADMIN");

	}
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN")
	                .antMatchers("/user").hasAnyRole("USER","ADMIN")
	                .antMatchers("/").permitAll()
	                .and().formLogin().successHandler(customSuccessHandler).permitAll().and()
	                .logout()
	                .permitAll()
	                .and()
	                 .rememberMe()
	                 .key("appSecret") // keyname
	                  .tokenValiditySeconds(30*30); //kept tokenvalidity for 1 hr 
	    }
  
    

   
	@Bean
    public PasswordEncoder getPasswordEncoder(){
		 return new BCryptPasswordEncoder();
    }
}