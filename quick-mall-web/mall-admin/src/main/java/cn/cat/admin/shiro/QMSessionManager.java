package cn.cat.admin.shiro;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 23:22 18/8/1
 * @Modified by:
 */
public class QMSessionManager extends DefaultWebSessionManager {

    private String AUTHOR = "authorization";

    public QMSessionManager(){
        super();
    }

    @Override
    public Serializable getSessionId(ServletRequest request, ServletResponse response){
        HttpServletRequest req = WebUtils.toHttp(request);
        String token = req.getHeader(AUTHOR);
        if(StringUtils.isNotEmpty(token)){
            req.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, token);
            req.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, AUTHOR);
            req.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
            return token;
        }else {
            return super.getSessionId(request, response);
        }
    }

}
