package com.zzw.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * @author zzw
 */
public interface LoadBalancer {

    Instance select(List<Instance> instances);

}
