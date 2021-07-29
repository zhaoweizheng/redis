package com.demo.zwz.redis;

import com.demo.zwz.redis.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class RedisApplicationTests {


    @Autowired
    private RedisUtil redisUtil;
    @Test
    void contextLoads() {
        System.out.println("zhaoweizheng");

        Map<String, Object> map = new HashMap<>();
        map.put("z", "1");
        map.put("w", "2");
        redisUtil.hashMapSet("zwz", map);
        System.out.println(redisUtil.hashHasKey("zwz", "z"));
        System.out.println(redisUtil.hashGet("zwz", "z"));
        System.out.println(redisUtil.hashMapGet("zwz"));

    }

}
