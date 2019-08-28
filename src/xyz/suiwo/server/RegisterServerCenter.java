package xyz.suiwo.server;

/**
 * @author zhangjia
 * @title RegisterServerCenter
 * @date 2019-08-28 14:19
 */
public interface RegisterServerCenter {
    //服务启动
    void start();

    //服务终止
    void stop();

    //服务注册
    void register(Class service, Class serviceImpl);
}
