package com.chryl.module.test.service;

import com.chryl.config.annotation.DataSource;
import com.chryl.config.enums.DataSourceType;
import com.chryl.module.test.mapper.ZgInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chr.yl on 2021/3/23.
 *
 * @author Chr.yl
 */
@Service
public class ZgService {
    @Autowired
    private ZgInfoMapper zgInfoMapper;

    @DataSource(DataSourceType.MASTER)
    public Object selectMaster() {
        return zgInfoMapper.selectZg();

    }

    @DataSource(DataSourceType.SLAVE)
    public Object selectSLAVE() {
        return zgInfoMapper.selectZg();
    }
}
