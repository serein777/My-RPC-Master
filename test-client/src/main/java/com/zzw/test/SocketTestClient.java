package com.zzw.test;

import com.zzw.rpc.api.ByeService;
import com.zzw.rpc.api.HelloObject;
import com.zzw.rpc.api.HelloService;
import com.zzw.rpc.serializer.CommonSerializer;
import com.zzw.rpc.transport.RpcClientProxy;
import com.zzw.rpc.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 *
 * @author zzw
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
