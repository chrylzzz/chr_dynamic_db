package com.chryl;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChrDynamicDbApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String orgPwd = "chryl";//原始密码
        String encPwd = ConfigTools.encrypt(orgPwd);//加密后的密码
        System.out.println("加密密码:" + encPwd);
        String password = ConfigTools.decrypt(encPwd);
        System.out.println("解密密码：" + password);
    }


    public void show() throws Exception {
        //privateKey:MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAuLMVAFmcew+mPfVnzI6utEvhHWO2s6e4R1bVW3a9IpH+pEypeNV6KtZ/w9PuysPfdPxW5fN3BmnKFZUAIMvWhQIDAQABAkA6rnsfr1juKFyzFsMx1KthETKmucWUctczoz0KYEFbN+joNsd/ApQqsS/2MVG1QWbDJLUsSLWkchvRbtiqOlVJAiEA6KmgVeLR2qUU9gv6DJfuWk4Ol1M9GJnTamgyDttsSGcCIQDLOdjcht29s954vApG1fiPTP/kMvZ5aLrccw1lEuEGMwIhAKoe3c3u++MTsi/2se9jaDU/vguIIbRLRfsYFQIoDxUhAiAnCm/cvZPvk5RTgVxAC276qIIoJpou7K2pF/kkx6Gu/QIgKUVFiM8GVZkOWZC+nUm3UIfpGjrKXjvGrlHNvt89uBA=
        //publicKey:MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALizFQBZnHsPpj31Z8yOrrRL4R1jtrOnuEdW1Vt2vSKR/qRMqXjVeirWf8PT7srD33T8VuXzdwZpyhWVACDL1oUCAwEAAQ==
        //password:gkYlljNHKe0/4z7bbJxD7v/txWJIFbiGWwsIPo176Q7fG0UjcSizNxuRUI2ll27ZPQf2ekiHFptus2/Rc4cmvA==
        String password = ConfigTools.decrypt(
                "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALizFQBZnHsPpj31Z8yOrrRL4R1jtrOnuEdW1Vt2vSKR/qRMqXjVeirWf8PT7srD33T8VuXzdwZpyhWVACDL1oUCAwEAAQ==",//私钥
                "gkYlljNHKe0/4z7bbJxD7v/txWJIFbiGWwsIPo176Q7fG0UjcSizNxuRUI2ll27ZPQf2ekiHFptus2/Rc4cmvA=="//密码
        );
        System.out.println("解密密码：" + password);
    }

}
