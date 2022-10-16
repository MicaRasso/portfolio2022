package com.portfolio.MR.Security.JWT;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JWTEntryPoint implements AuthenticationEntryPoint{
    @Autowired
    private final static Logger logger = LoggerFactory.getLogger(JWTEntryPoint.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        logger.error("Error metodo commence");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }
    
    
}
