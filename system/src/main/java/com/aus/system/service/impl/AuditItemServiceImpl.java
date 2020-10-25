package com.aus.system.service.impl;

import com.aus.system.entity.AuditItem;
import com.aus.system.mapper.AuditItemMapper;
import com.aus.system.service.IAuditItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WongChy
 * @since 2020-10-25
 */
@Service
public class AuditItemServiceImpl extends ServiceImpl<AuditItemMapper, AuditItem> implements IAuditItemService {

}
