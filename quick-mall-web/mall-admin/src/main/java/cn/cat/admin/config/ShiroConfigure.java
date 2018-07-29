//package cn.cat.admin.config;
//
//import cn.cat.admin.shiro.MyShiroRealm;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @Author: cat-lin
// * @Description:
// * @Date: Created in 00:16 18/7/25
// * @Modified by:
// */
//@Configuration
//public class ShiroConfigure {
//
//        @Bean
//        public ShiroFilterFactoryBean shirFilter(DefaultWebSecurityManager securityManager) {
//            System.out.println("ShiroConfiguration.shirFilter()");
//            ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//            shiroFilterFactoryBean.setSecurityManager(securityManager);
//            //拦截器.
//            Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
//            filterChainDefinitionMap.put("/login", "anon");
//            filterChainDefinitionMap.put("/loginCheck", "anon");
//            // 配置不会被拦截的链接 顺序判断
//            filterChainDefinitionMap.put("/static/**", "anon");
//            //配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了
//            filterChainDefinitionMap.put("/logout", "logout");
//            //管理员，需要角色权限 “admin”
//            filterChainDefinitionMap.put("/admin/**", "roles[admin]");
//            //<!-- 过滤链定义，从上向下顺序执行，一般将/**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;
//            //<!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
//            filterChainDefinitionMap.put("/**", "authc");
//            filterChainDefinitionMap.put("/static/**", "anon");
//            // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
//            shiroFilterFactoryBean.setLoginUrl("/login");
//            // 登录成功后要跳转的链接
//            shiroFilterFactoryBean.setSuccessUrl("/index");
//
//            //未授权界面;
//            shiroFilterFactoryBean.setUnauthorizedUrl("/403");
//            shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//            return shiroFilterFactoryBean;
//        }
//
//        @Bean
//        public MyShiroRealm myShiroRealm(){
//            MyShiroRealm myShiroRealm = new MyShiroRealm();
//            return myShiroRealm;
//        }
//
//
//        @Bean
//        public DefaultWebSecurityManager securityManager(){
//            DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
//            securityManager.setRealm(myShiroRealm());
//            return securityManager;
//        }
//}
