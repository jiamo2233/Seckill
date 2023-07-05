package com.jiamo.seckill.util;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CookieUtil用来管理Cookie
 *
 * */
@Slf4j
public class CookieUtil {
    private final static String COOKIE_DOMAIN = "localhost";
    private final static String COOKIE_NAME = "seckill_login_token";

    //获取所有的cookie然后返回key为COOKIE_NAME的值
    public static String readLoginToken(HttpServletRequest request){
        Cookie[] cookies=request.getCookies();
        if(cookies!=null){
            for(Cookie cookie : cookies) {
                if(COOKIE_NAME.equals(cookie.getName())){ return cookie.getValue();}
            }
        }
        return null;
    }

    //向response写入cookie
    public static void wirteLoginToken(HttpServletResponse response, String token){
        Cookie ck = new Cookie(COOKIE_DOMAIN,token);
        ck.setDomain(COOKIE_DOMAIN);
        ck.setPath("/");
        ck.setHttpOnly(true);
        ck.setMaxAge(60 * 60 * 24 * 365);//如果是-1，代表永久
        response.addCookie(ck);
    }

    //删除cookie,response中将cookiemaxAge跟新为0
    public static void deleteLoginToken(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie:cookies){
                if(COOKIE_NAME.equals(cookie.getName())){
                    cookie.setDomain(COOKIE_DOMAIN);
                    cookie.setPath("/");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    return;
                }
            }
        }
    }
}
