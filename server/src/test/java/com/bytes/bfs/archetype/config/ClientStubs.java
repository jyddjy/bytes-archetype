package com.bytes.bfs.archetype.config;

import com.hope.saas.bfs.archetype.client.Biz2Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

/**
 * 该类用于在单元测试的场景下，对一些外部依赖打桩。
 * TODO: 添加一个bizClient后完善stub,方便单元测试的编写.
 */
@TestConfiguration
@Slf4j
public class ClientStubs {

    @Bean
    @Primary
    public Biz2Client biz2Client() {
        return new Biz2Client() {
            @Override
            public BizEntity get(GetReq req) {
                log.info("dummy get invoked. req={}", req);
                Biz2Client.BizEntity bizEntity = Biz2Client.BizEntity.builder().build();
                // construct test data
                return bizEntity;
            }

            @Override
            public List<BizEntity> list(ListReq req) {
                log.info("dummy list invoked. req={}", req);
                List<BizEntity> list = new ArrayList<>();
                // construct test data
                // list.add();
                return list;
            }
        };
    }
}
