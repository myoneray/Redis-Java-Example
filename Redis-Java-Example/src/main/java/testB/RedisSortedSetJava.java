package testB;
import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

//Redis Java List(列表) 实例
public class RedisSortedSetJava {
    public static void main(String[] args) {
        // 连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        // 存储数据到列表中
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            for (int j = 0; j < 5; j++) {
                int vrandom = (int) (Math.random() * 100);
                jedis.zadd("SortedSetKey" + random, i + vrandom, "SortedSet" + vrandom);
            }
        }
    }
}