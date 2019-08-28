package xyz.suiwo;

import xyz.suiwo.server.HelloService;
import xyz.suiwo.server.HelloServiceImpl;
import xyz.suiwo.server.RegisterServerCenter;
import xyz.suiwo.server.RegisterServerCenterImpl;

/**
 * @author zhangjia
 * @title RPCServerTest
 * @date 2019-08-28 14:22
 */
public class RPCServerTest {

    public static void main(String[] args) {
        //开启一个线程
        new Thread(() -> {
            //服务中心
            RegisterServerCenter server = new RegisterServerCenterImpl(9999);
            //将HelloService接口及实现类 注册到 服务中心
            server.register(HelloService.class, HelloServiceImpl.class);
            server.start();
        }).start();//start()
    }

}
