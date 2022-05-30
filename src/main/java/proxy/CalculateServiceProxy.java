package proxy;

public class CalculateServiceProxy implements CalculateService{
    private CalculateService calculateService = new CalculateServiceImpl();
    @Override
    public int add(int a, int b) {
        System.out.println("方法执行前打印");
        int result = calculateService.add(a,b);
        System.out.println("方法执行后打印");
        return result;
    }
    @Override
    public int sub(int a, int b) {
        System.out.println("方法执行前打印");
        int result = calculateService.sub(a,b);
        System.out.println("方法执行后打印");
        return result;
    }
}
