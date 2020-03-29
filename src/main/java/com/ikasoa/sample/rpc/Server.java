package com.ikasoa.sample.rpc;

import java.util.List;

import com.ikasoa.core.utils.ListUtil;
import com.ikasoa.rpc.DefaultIkasoaFactory;
import com.ikasoa.rpc.RpcException;
import com.ikasoa.rpc.IkasoaServer;
import com.ikasoa.rpc.ImplWrapper;

/**
 * IKASOA服务端例子程序
 * 
 * @author <a href="mailto:larry7696@gmail.com">Larry</a>
 * @version 0.3
 */
public class Server {

	private static IkasoaServer ikasoaServer;

	// public static void main(String[] args) {
	// start();
	// }

	// 启动服务
	public static void start() {
		try {
			if (ikasoaServer == null) {
				List<ImplWrapper> sList = ListUtil.newArrayList(1);
				sList.add(new ImplWrapper(SampleServiceImpl.class));
				ikasoaServer = new DefaultIkasoaFactory().getIkasoaServer(sList, 9999);
			}
			ikasoaServer.run();
		} catch (RpcException e) {
		}
	}

	// 停止服务
	public static void stop() {
		if (ikasoaServer != null && ikasoaServer.isServing()) {
			ikasoaServer.stop();
		}
	}
}
