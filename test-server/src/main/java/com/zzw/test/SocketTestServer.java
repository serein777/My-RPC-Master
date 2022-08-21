package com.zzw.test;

import com.zzw.rpc.annotation.ServiceScan;
import com.zzw.rpc.serializer.CommonSerializer;
import com.zzw.rpc.transport.RpcServer;
import com.zzw.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 *
 * @author zzw
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
