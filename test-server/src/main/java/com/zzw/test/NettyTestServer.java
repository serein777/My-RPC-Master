package com.zzw.test;

import com.zzw.rpc.annotation.ServiceScan;
import com.zzw.rpc.serializer.CommonSerializer;
import com.zzw.rpc.transport.RpcServer;
import com.zzw.rpc.transport.netty.server.NettyServer;

/**
 * 测试用Netty服务提供者（服务端）
 *
 * @author zzw
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
