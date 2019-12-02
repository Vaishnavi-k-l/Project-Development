package com.example.demo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.ApiResponse;
import com.example.demo.model.AuthToken;
import com.example.demo.model.LoginUser;


@FeignClient("login-service")
public interface LoginService 
{
	
	@RequestMapping(value = "/token/generate-token", method = RequestMethod.POST)
	public ApiResponse<AuthToken> register(@RequestBody LoginUser loginUser);
	 
	 
	@RequestMapping(value="token/send-email")
	public boolean signupSuccess(@RequestBody LoginUser user);

}
