import java.util.Scanner;

public class Notebook extends Product implements IOperation{
    public Notebook(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }

    public Notebook() {
    }

    @Override
    public void runMenu() {
        boolean isRunning = true;
        while (isRunning) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Notebook Yönetim Paneli");
            System.out.println("1 - Notebook ekleme \n" +
                    "2 - Notebook silme \n" +
                    "3 - id ye göre filtreleme \n" +
                    "4 - markaya göre filtreleme \n" +
                    "5 - Notebook listeleme \n" +
                    "0 - Çıkış yap ");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addProduct();      //Notebook adding
                    break;
                case 2:
                    deleteProduct();    //Notebook deleting
                    break;
                case 3:
                    filterByProductId();    //Filter by ID
                    break;
                case 4:
                    filterByProductBrand();    //Filter by ID
                    break;
                case 5:
                    showProductList();      //Show the notebook list
                    break;
                default:
                    isRunning = false;
                    break;
            }
        }
    }

    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }

}
