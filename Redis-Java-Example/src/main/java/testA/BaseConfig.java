package testA;

public class BaseConfig {

    public static int retryNum;

    public static int getRetryNum() {
        return retryNum;
    }

    public static void setRetryNum(int retryNum) {
        BaseConfig.retryNum = retryNum;
    }

}
