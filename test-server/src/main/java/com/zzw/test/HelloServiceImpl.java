package com.zzw.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zzw.rpc.annotation.Service;
import com.zzw.rpc.api.HelloObject;
import com.zzw.rpc.api.HelloService;

/**
 * @author zzw
 */
@Service
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到消息：{}", object.getMessage());
        return "这是Impl1方法";
    }

}
