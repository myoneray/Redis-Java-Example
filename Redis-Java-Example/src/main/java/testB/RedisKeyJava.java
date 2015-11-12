package testB;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {
    public static void main(String[] args) {
        // 连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully！");

        // 创建key
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 100);
            jedis.set("name" + random, "new key" + random);
        }

        // 获取key 取值
        Set<String> list = jedis.keys("*");
        System.out.println("key总量: " + list.size());
    }
}