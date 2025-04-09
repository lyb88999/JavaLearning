public class Phone extends Merchandise {
    // 手机的品牌
    private String brand;
    // 手机的型号
    private String model;
    // 手机的存储容量
    private int storageCapacity;

    // 无参构造函数
    public Phone() {
    }

    // 有参构造函数
    public Phone(String name, String id, double price, int stock, String brand, String model, int storageCapacity) {
        super(name, id, price, stock);
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    // Getter和Setter方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    // 重写toString方法，方便打印手机信息
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", storageCapacity=" + storageCapacity +
                "} " + super.toString();
    }

//    public static void staticMethod(){
//        System.out.println("staticMethod in Phone");
//    }
}