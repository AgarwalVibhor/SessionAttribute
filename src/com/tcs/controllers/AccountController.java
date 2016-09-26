package com.tcs.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.model.Account;

@Controller
@SessionAttributes("account")
public class AccountController {
	
	@ModelAttribute
	public void addAccountToModel(Model model)
	{
		if(!model.containsAttribute("account"))
		{
			Account account = new Account();
			model.addAttribute("account", account);
		}
	}
	
	@RequestMapping(value = "/createAccount.spring", method = RequestMethod.GET)
	public ModelAndView displayCreateAccount(HttpServletRequest request, HttpServletResponse response)
	{
		Account account = new Account();
		ModelAndView model = new ModelAndView("CreateAccount");
		model.addObject("account", account);
		return model;
	}
	
	@RequestMapping(value = "/createAccount.spring", method = RequestMethod.POST)
	public ModelAndView executeCreateAccount(HttpServletRequest request, HttpServletResponse response,
			@Valid @ModelAttribute("account") Account account, BindingResult result)
	{
		ModelAndView model = null;
		if(result.hasErrors())
		{
			model = new ModelAndView("CreateAccount");
		}
		else
		{
			System.out.println(account.getFirstName());
			System.out.println(account.getLastName());
			System.out.println(account.getAddress());
			System.out.println(account.getEmail());
			
			model = new ModelAndView("redirect:accountConfirm.spring");
			
		}
		return model;
	}
	
	
	@RequestMapping(value = "/accountConfirm.spring")
	public ModelAndView accountConfirm(@ModelAttribute("account") Account account)
	{
		ModelAndView model = null;
		System.out.println("Welcome " + account.getFirstName());
		model = new ModelAndView("AccountSuccess");
		return model;
	}

}
