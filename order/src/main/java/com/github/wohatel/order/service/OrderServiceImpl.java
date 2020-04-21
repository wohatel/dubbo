package com.github.wohatel.order.service;

import com.github.wohatel.common.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Component
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String order(int numbers) {
        return String.format("you have down %d 商品", numbers);
    }
}
