package testA;

public class RedisConfig {

    public static int maxactive;
    public static int maxidle;
    public static long maxwait;
    public static int timeout;

    public static int maxActive;
    public static int maxIdle;
    public static int maxWait;

    public static int getMaxActive() {
        return maxActive;
    }

    public static void setMaxTotal(int maxActive) {
        RedisConfig.maxActive = maxActive;
    }

    public static int getMaxIdle() {
        return maxIdle;
    }

    public static void setMaxIdle(int maxIdle) {
        RedisConfig.maxIdle = maxIdle;
    }

    public static int getMaxWait() {
        return maxWait;
    }

    public static void setMaxWait(int maxWait) {
        RedisConfig.maxWait = maxWait;
    }

    public static int getTimeout() {
        return timeout;
    }

    public static void setTimeout(int timeout) {
        RedisConfig.timeout = timeout;
    }

    public static int getMaxactive() {
        return maxactive;
    }

    public static void setMaxactive(int maxactive) {
        RedisConfig.maxactive = maxactive;
    }

    public static int getMaxidle() {
        return maxidle;
    }

    public static void setMaxidle(int maxidle) {
        RedisConfig.maxidle = maxidle;
    }

    public static long getMaxwait() {
        return maxwait;
    }

    public static void setMaxwait(long maxwait) {
        RedisConfig.maxwait = maxwait;
    }

}
