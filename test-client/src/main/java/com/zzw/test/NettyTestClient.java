package com.zzw.test;

import com.zzw.rpc.api.ByeService;
import com.zzw.rpc.api.HelloObject;
import com.zzw.rpc.api.HelloService;
import com.zzw.rpc.serializer.CommonSerializer;
import com.zzw.rpc.transport.RpcClient;
import com.zzw.rpc.transport.RpcClientProxy;
import com.zzw.rpc.transport.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 *
 * @author zzw
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
