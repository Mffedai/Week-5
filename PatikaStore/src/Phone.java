import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product implements IOperation{
    private int camera;
    private int batteryCapacity;
    private String color;
    public Phone(int id, String name, double price, double discountRate, int stock, int camera, int batteryCapacity, String color, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public Phone(){
    }
    static ArrayList<Phone> phones = new ArrayList<>();
    static {
        phones.add(new Phone(1,"Samsung Galaxy A51", 3199,15,100,32,3000,"White","Samsung", "6", 6, "128"));
        phones.add(new Phone(2,"Iphone 11 64 GB", 7399,8,80,64,2000,"Black","Iphone", "6", 6, "128"));
        phones.add(new Phone(3,"Samsung Galaxy S9", 4999,10,70,24,3000,"Blue","Samsung", "8", 8, "64"));
    }

    @Override
    public void runMenu() {
        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Phone Yönetim Paneli");
            System.out.println("1 - Phone ekleme \n" +
                    "2 - Phone silme \n" +
                    "3 - Id ye göre filtreleme \n" +
                    "4 - Markaya göre filtreleme \n" +
                    "5 - Phone listeleme \n" +
                    "0 - Çıkış yap ");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addProduct();      //Phone adding
                    break;
                case 2:
                    deleteProduct();    //Phone deleting
                    break;
                case 3:
                    filterByProductId();    //Filter by ID
                    break;
                case 4:
                    filterByProductBrand();    //Filter by ID
                    break;
                case 5:
                    showProductList();      //Show the phone list
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }
    }

    @Override
    public void showProductList() {
        System.out.printf("%-8s %-22s %-10s %-12s %-10s %-10s %-6s %-6s %-6s %-6s %-6s %-6s%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Camera", "Ekran", "RAM", "Pil", "Renk", "Stok", "İndirim");
        for (Phone phone : phones){
            System.out.printf("%-8s %-22s %-10s %-12s %-10s %-10s %-6s %-6s %-6s %-6s %-6s %-6s%n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrandName(),
                    phone.getMemory(), phone.getCamera(), phone.getScreenSize(), phone.getRam(),
                    phone.getBatteryCapacity(), phone.getColor(), phone.getStock(), phone.getDiscountRate());
        }
        System.out.println();
    }
    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen silmek istediğiniz ID yi seçiniz.");
        try{
            int delete = scanner.nextInt();
            Phone deletePhone = findPhoneById(delete);
            phones.remove(deletePhone);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private Phone findPhoneById(int id){
        for (Phone phone : phones){
            if (phone.getId() == id){
                return phone;
            }
        }
    }
}
