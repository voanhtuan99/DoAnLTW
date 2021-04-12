package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	@RequestMapping(value={"", "index"})
	public String index() {
		return "user/index";
	}
	@RequestMapping("shop-details")
	public String shopdetails() {
		return "user/shop-details";
	}
	@RequestMapping("shop-grid")
	public String shopgrid() {
		return "user/shop-grid";
	}
	@RequestMapping("shoping-cart")
	public String shopcard() {
		return "user/shoping-cart";
	}
	@RequestMapping("contact")
	public String contact() {
		return "user/contact";
	}
	@RequestMapping("checkout")
	public String checkout() {
		return "user/checkout";
	}
	@RequestMapping("blog")
	public String blog() {
		return "user/blog";
	}
}
