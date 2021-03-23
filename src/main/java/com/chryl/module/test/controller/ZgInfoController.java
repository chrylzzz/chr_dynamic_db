package com.chryl.module.test.controller;

import com.chryl.module.test.service.ZgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chr.yl on 2021/3/23.
 *
 * @author Chr.yl
 */
@RestController
@RequestMapping("zginfo")
public class ZgInfoController {

    @Autowired
    private ZgService zgService;

    @GetMapping("select1")
    public Object show1() {
        return zgService.selectMaster();

    }

    @GetMapping("select2")
    public Object show2() {
        return zgService.selectSLAVE();

    }
}
