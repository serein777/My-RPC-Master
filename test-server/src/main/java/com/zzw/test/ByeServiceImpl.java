package com.zzw.test;

import com.zzw.rpc.annotation.Service;
import com.zzw.rpc.api.ByeService;

/**
 * @author zzw
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
