// 继承自Phone类，表示可换壳颜色的手机
public class ShellColorChangePhone extends Phone {
    // 支持的外壳颜色数组
    private String[] availableShellColors;
    // 当前的外壳颜色
    private String currentShellColor;

    // 无参构造函数
    public ShellColorChangePhone() {
    }

    // 有参构造函数
    public ShellColorChangePhone(String name, String id, double price, int stock, String brand, String model, int storageCapacity, String[] availableShellColors, String currentShellColor) {
        super(name, id, price, stock, brand, model, storageCapacity);
        this.availableShellColors = availableShellColors;
        this.currentShellColor = currentShellColor;
    }

    // 获取支持的外壳颜色数组
    public String[] getAvailableShellColors() {
        return availableShellColors;
    }

    // 设置支持的外壳颜色数组
    public void setAvailableShellColors(String[] availableShellColors) {
        this.availableShellColors = availableShellColors;
    }

    // 获取当前的外壳颜色
    public String getCurrentShellColor() {
        return currentShellColor;
    }

    // 设置当前的外壳颜色
    public void setCurrentShellColor(String currentShellColor) {
        this.currentShellColor = currentShellColor;
    }

    // 重写toString方法，方便打印可换壳颜色手机的信息
    @Override
    public String toString() {
        return "ShellColorChangePhone{" +
                "availableShellColors=" + java.util.Arrays.toString(availableShellColors) +
                ", currentShellColor='" + currentShellColor + '\'' +
                "} " + super.toString();
    }


    public static void staticMethod(){
        System.out.println("staticMethod in ShellColorChangePhone");
    }
}