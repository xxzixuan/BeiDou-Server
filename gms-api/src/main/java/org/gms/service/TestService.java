package org.gms.service;

import lombok.AllArgsConstructor;
import org.gms.dto.BaseNettyRequest;
import org.gms.dto.BaseNettyResponse;
import org.gms.dao.mapper.AccountsMapper;
import org.gms.netty.NettyClient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TestService {
    private final NettyClient nettyClient;
    private final AccountsMapper accountMapper;

    public String test() {
        BaseNettyResponse<String> response = nettyClient.sendJson(BaseNettyRequest.<String>builder()
                .requestKey("test")
                .requestId(UUID.randomUUID().toString())
                .requestData("")
                .build());
        if ("error".equals(response.getResponseCode())) {
            throw new RuntimeException(response.getResponseMessage());
        }
        return response.getResponseData();
    }

    public String testAccount() {
        return accountMapper.selectAll().toString();
    }

    public void testPackage() {
        nettyClient.sendPacket("test".getBytes());
    }
}