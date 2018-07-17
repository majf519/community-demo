package com.recon.community.interceptor;

import com.recon.community.entity.Operation;
import com.recon.community.entity.User;
import com.recon.community.enums.OperationEnum;
import com.recon.community.exception.InvalidException;
import com.recon.community.service.OperationService;
import com.recon.community.service.UserService;
import com.recon.community.util.RedisTemplateUtil;
import com.recon.community.util.UuidUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

/**
 * @author daniel.xue
 * @date 18/7/16
 */
@Component
public class CommunityInterceptor implements HandlerInterceptor {

    @Autowired
    private OperationService operationService;

    @Autowired
    private RedisTemplateUtil redisTemplateUtil;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

//        String token = httpServletRequest.getHeader("token");
//        if (StringUtils.isBlank(token)) {
//            throw new InvalidException("no token");
//        }
//        if (StringUtils.isBlank(redisTemplateUtil.get(token))) {
//            throw new InvalidException("token过期");
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

//        String token = httpServletRequest.getHeader("token");
//        String servletPath = httpServletRequest.getServletPath();
//        String method = httpServletRequest.getMethod();
//        String[] operation = servletPath.split("community");
//        if (operation.length > 1) {
//            String operationModule = operation[1].toLowerCase().replace("/", "");
//
//            if (!StringUtils.isEmpty(token)) {
//                String userId = redisTemplateUtil.get(token);
//                String module = OperationEnum.getDescByCode(operationModule);
//                String operationMethod = OperationEnum.getDescByCode(operationModule + "_" + method.toLowerCase());
//                String id = UuidUtil.getUuid();
//                Operation operation1 = new Operation(id, userId, module, operationMethod, new Date(), "0");
//                operationService.insert(operation1);
//            }
//        }
    }
}
