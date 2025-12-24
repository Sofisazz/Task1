import java.util.Scanner;

public class ATM {
    public int countValuta20;
    public int countValuta50;
    public int countValuta100;

    public ATM(int countValuta20, int countValuta50, int countValuta100){
        this.countValuta20 = countValuta20;
        this.countValuta50 = countValuta50;
        this.countValuta100 = countValuta100;
    }

    public void addBanknote20(int count){
        this.countValuta20 += count;
    }

    public void addBanknote50(int count){
        this.countValuta50 += count;
    }

    public void addBanknote100(int count){
        this.countValuta100 += count;
    }

    public int getCash(){
        return 20 * this.countValuta20 + 50 * this.countValuta50 + 100 * this.countValuta100;
    }

    public boolean getBanknote(){
        int cash = getCash();
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько желаете снять денег?\nСумма: ");

        int withdraw = in.nextInt();
        if(withdraw < 20) {
            System.out.print("\nОшибка снятия денег. Выбрана маленькая сумма (сумма должна быть 20 рублей и выше)\nОперация: ");
            return false;
        }

        if(cash < withdraw) {
            System.out.print( "\nОшибка снятия денег. Не хватает средств!\nОперация: ");
            return false;
        }

        String sms;
        if(withdraw >= 100) {
            System.out.print("\nВыберите какой купюрой:\n1. Номиналом 20;\n2. Номиналом 50;\n3. Номиналом 100.\nВвод: ");
            int valuta = in.nextInt();

            switch (valuta){
                case 1:
                    if(withdraw % 20 != 0 || withdraw / 20 > this.countValuta20) {
                        System.out.print( "\nОшибка снятия денег.\nОперация: ");
                        return false;
                    }
                    this.countValuta20 -= withdraw / 20;
                    sms = "\nУспешное снятие денег: " + withdraw / 20 + " купюр(ы) номиналом 20";
                    break;

                case 2:
                    if(withdraw % 50 != 0 || withdraw / 50 > this.countValuta50) {
                        System.out.print( "\nОшибка снятия денег.\nОперация: ");
                        return false;
                    }
                    this.countValuta50 -= withdraw / 50;
                    sms = "\nУспешное снятие денег: " + withdraw / 50 + " купюр(ы) номиналом 50";
                    break;

                case 3:
                    if(withdraw % 100 != 0 || withdraw / 100 > this.countValuta100) {
                        System.out.print( "\nОшибка снятия денег.\nОперация: ");
                        return false;
                    }
                    this.countValuta100 -= withdraw / 100;
                    sms = "\nУспешное снятие денег: " + withdraw / 100 + " купюр(ы) номиналом 100";
                    break;
                default:
                    sms = "\nВыберите один из предложенных пунктов!";
                    break;
            }
        } else {
            if (withdraw == 20 && withdraw / 20 <= this.countValuta20){
                this.countValuta20 -= 1;
                sms = "\nУспешное снятие денег: 1 купюра номиналом " + withdraw;
            } else if(withdraw > 20 && withdraw % 20 == 0 && withdraw / 20 <= this.countValuta20){
                this.countValuta20 -= withdraw / 20;
                sms = "\nУспешное снятие денег: " + withdraw / 20 + " купюр(ы) номиналом 20";
            } else if(withdraw % 50 == 0 && this.countValuta50 >= 1) {
                this.countValuta50 -= 1;
                sms = "\nУспешное снятие денег: 1 купюра номиналом " + withdraw;
            } else {
                System.out.print( "\nОшибка снятия денег.\nОперация: ");
                return false;
            }
        }
        System.out.print(sms + "\nОперация: ");
        return true;
    }
}
