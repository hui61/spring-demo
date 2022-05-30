package proxy;

public class CalculateServiceImpl implements CalculateService {
    @Override
    public int add(int a, int b) {
        System.out.println("目前方法开始执行");
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
