package com.portfolio.MR.Security.JWT;

import com.portfolio.MR.Security.Entity.AdminUser;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JWTProvider {
    private final static Logger logger = LoggerFactory.getLogger(JWTProvider.class);
    
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private int expiration;
    
    public String generateToken(Authentication authentication){
        AdminUser adminUser;
        adminUser = (AdminUser) authentication.getPrincipal();
        return Jwts.builder().setSubject(adminUser.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+expiration*1000))
                .signWith(io.jsonwebtoken.SignatureAlgorithm.HS512, secret)
                .compact();
    }
    
    public String getUserNameFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();        
    }
    
    public boolean validateToken(String token){
        try{
            Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return true;
        }catch (MalformedJwtException e){
            logger.error("Token mal formado" + e);
        }catch (UnsupportedJwtException e){
            logger.error("Token no soportado" + e);
        }catch (ExpiredJwtException e){
            logger.error("Token expirado" + e);
        }catch (IllegalArgumentException e){
            logger.error("Token vacio" + e);
        }catch (SignatureException e){
            logger.error("Firma no valida" + e);
        }
        return false;
    }
}
