package com.hh.springboot.dubbo.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hh.springboot.dubbo.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huhan
 * @date 2019/6/26 15:53
 * @Description
 */
@RestController
public class CustomerController {
	@Reference
	private TicketService ticketService;
	@RequestMapping("/")
	public String index(){
		return ticketService.buyTicket();
	}
}
