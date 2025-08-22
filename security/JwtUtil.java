package com.foodapp.security;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.security.Key;
import java.util.Date;


@Component
public class JwtUtil {
@Value("${jwt.secret}") private String secret;
@Value("${jwt.expirationMs}") private long expirationMs;
private Key key(){ return Keys.hmacShaKeyFor(secret.getBytes()); }
public String generate(String subject){
Date now = new Date();
return Jwts.builder()
.setSubject(subject)
.setIssuedAt(now)
.setExpiration(new Date(now.getTime()+expirationMs))
.signWith(key())
.compact();
}
public String subject(String token){
return Jwts.parserBuilder().setSigningKey(key()).build()
.parseClaimsJws(token).getBody().getSubject();
}
}
