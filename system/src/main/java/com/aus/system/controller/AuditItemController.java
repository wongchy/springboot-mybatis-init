package com.aus.system.controller;

import com.aus.common.api.vo.Result;
import com.aus.common.aspect.annotation.AutoLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WongChy
 * @since 2020-10-25
 */
@Slf4j
@RestController
@RequestMapping("/audit-item")
public class AuditItemController {

    @AutoLog
    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public Object demo() throws Exception {
        throw new Exception("ccc");
        // return Result.ok();
    }
}
