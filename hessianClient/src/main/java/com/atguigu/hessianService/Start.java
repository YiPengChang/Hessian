package com.atguigu.hessianService;

import com.caucho.hessian.client.HessianProxyFactory;

public class Start {
	public static void main(String[] args) throws Exception {
		String url = "http://127.0.0.1:8080/hessianProvider/IHessianService";
		HessianProxyFactory factory = new HessianProxyFactory();
		IHessianService create = (IHessianService)factory.create(IHessianService.class, url);
		String say = create.say("������");
		System.out.println(say);
	}
}
