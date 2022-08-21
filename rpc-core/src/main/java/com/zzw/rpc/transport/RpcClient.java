package com.zzw.rpc.transport;

import com.zzw.rpc.serializer.CommonSerializer;
import com.zzw.rpc.entity.RpcRequest;

/**
 * 客户端类通用接口
 *
 * @author zzw
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
