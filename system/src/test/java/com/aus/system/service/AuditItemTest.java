package com.aus.system.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @Author WongChy
 * @Date 2020/10/25 13:51
 */
@Slf4j
@SpringBootTest
public class AuditItemTest {

    private IAuditItemService iAuditItemService;

    @BeforeEach
    void setUp(){
        iAuditItemService=mock(IAuditItemService.class);
    }

    @Test
    public void should_mock_service_return_123(){
        when(iAuditItemService.count()).thenReturn(123);
        Assert.assertEquals(iAuditItemService.count(),123);
    }

}
