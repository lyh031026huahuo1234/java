public class VendingMachine{
    int price = 80;
    int balance; 
    int total;

    VendingMachine()   // 构造函数
    {
        total = 0;
    }

    VendingMachine(int price)
    {
        this.price = price;
    }


    void setPrice(int price)
    {
        this.price = price;
    }


    void showPrompt()
    {
        System.out.println("Welcome");
    }

    void insertMoney(int amout)
    {
        balance+=amout;
    }

    void showBalance()
    {
        System.out.println(balance);
    }

    void getFood()
    {
        if(balance>=price){
            System.out.println("Here you are.");
            balance -= price;
            total += price;
        }
    }

    public static void main(String[] args){
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
    }
}