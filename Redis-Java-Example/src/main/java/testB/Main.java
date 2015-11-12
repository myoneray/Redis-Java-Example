package testB;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Main {
    public static void main(String[] args) {
        // 连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully！");
        // 获取存储的数据并输出
        Set<String> list = jedis.keys("*");
        for (String string : list) {
            // System.out.println(jedis.type(string));
            if (jedis.type(string).equals("list")) {
                System.out.println(" list: " + string + " value: " + jedis.lrange(string, 0, -1));
            } else if (jedis.type(string).equals("set")) {
                System.out.println(" set: " + string + " value: " + jedis.smembers(string));
            } else if (jedis.type(string).equals("zset")) {
                System.out.println(" zset: " + string + " value: " + jedis.zrange(string, (long) 0, (long) -1));
                System.out.println(" zset: " + string + " value: " + jedis.zrevrange(string, (long) 0, (long) -1));
            } else if (jedis.type(string).equals("string")) {
                System.out.println(" string: " + string + " value: " + jedis.getrange(string, 0, -1));
            }
            jedis.del(string);
        }
        System.out.println("list size: " + list.size());
    }
}
