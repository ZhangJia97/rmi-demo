package xyz.suiwo;

import xyz.suiwo.client.Client;
import xyz.suiwo.server.HelloService;

import java.net.InetSocketAddress;

/**
 * @author zhangjia
 * @title ClientRPCTest
 * @date 2019-08-28 14:22
 */
public class ClientRPCTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过类反射机制类参数
        HelloService service = Client.getRemoteProxyObj(Class.forName("server.HelloService"), new InetSocketAddress("127.0.0.1", 9999));
        System.out.println((service.sayHi("zhangsan")));
    }
}
