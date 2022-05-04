package com.decoxm.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.decoxm.common.config.MonitorConfig;
import com.decoxm.common.utils.StringUtils;

/**
 * 首页
 *
 * @author chuno
 */
@RestController
public class SysIndexController
{
    /** 系统基础配置 */
    @Autowired
    private MonitorConfig MonitorConfig;

    /**
     * 访问首页，提示语
     */
    @RequestMapping("/")
    public String index()
    {
        return StringUtils.format("欢迎使用{}后台管理框架，当前版本：v{}，请通过前端地址访问。", MonitorConfig.getName(), MonitorConfig.getVersion());
    }
}
