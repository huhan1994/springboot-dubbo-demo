package com.hh.springboot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hh.springboot.dubbo.TicketService;
import org.springframework.stereotype.Component;

/**
 * @author huhan
 * @date 2019/6/26 15:42
 * @Description
 */
@Component
@Service
public class TicketServiceImpl implements TicketService {
	@Override public String buyTicket() {
		return "1234";
	}
}
