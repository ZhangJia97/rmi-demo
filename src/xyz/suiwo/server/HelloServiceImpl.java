package xyz.suiwo.server;

import xyz.suiwo.server.HelloService;

/**
 * @author zhangjia
 * @title HelloServiceImpl
 * @date 2019-08-28 14:18
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "Hi " + name;
    }
}
