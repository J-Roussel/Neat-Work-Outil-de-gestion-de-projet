package security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConf extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/getProject/**").authenticated()
                .antMatchers(HttpMethod.POST, "/postProject/**").authenticated()
                .antMatchers(HttpMethod.DELETE, "/deleteProject/**").denyAll()
                .antMatchers(HttpMethod.GET, "/getMission/**").authenticated()
                .antMatchers(HttpMethod.POST, "/postMission/**").authenticated()
                .antMatchers(HttpMethod.DELETE, "/deleteMission/**").authenticated()
                .antMatchers(HttpMethod.GET, "/getStatus/**").authenticated()
                .antMatchers(HttpMethod.POST, "/postStatus/**").authenticated()
                .antMatchers(HttpMethod.GET, "/getTask/**").authenticated()
                .antMatchers(HttpMethod.DELETE, "/deleteTask/**").authenticated()
                .antMatchers(HttpMethod.POST, "/postTask/**").authenticated()
                .antMatchers(HttpMethod.GET, "/getUserType/**").authenticated()
                .antMatchers(HttpMethod.POST, "/postUserType/**").authenticated()
                .antMatchers(HttpMethod.DELETE, "/deleteUserType/**").denyAll()
                .antMatchers(HttpMethod.GET, "/getUser/**").authenticated()
                .antMatchers(HttpMethod.DELETE, "/deleteUser/**").denyAll()
                .antMatchers(HttpMethod.POST, "/postUser/**").authenticated()
                .and()
                .formLogin()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable()
                .httpBasic();
    }

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails admin = User.builder()
                .username("admin")
                .password("{noop}admin")
                .roles("administrator")
                .build();

        return new InMemoryUserDetailsManager(admin);
    }
}
