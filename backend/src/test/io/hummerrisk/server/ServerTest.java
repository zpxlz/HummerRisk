package io.hummerrisk.server;

import io.hummerrisk.proxy.server.SshUtil;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.hummerrisk.proxy.server.SysListener.property;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServerTest {

    @org.junit.Test
    public void Test() throws Exception {
        try{
            SshUtil.login("81.70.253.80", "root", "k}nU+4X|58hmyC$");//通过ssh连接到服务器
            property();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
