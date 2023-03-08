public class Main {
    public static void main(String[] args) {

        int money = 100;                             // колличество денег до пополнения счёта
        int sum = 2230;                            // пополняемая сумма
        short counter = 100;                       // делитель для начисления бонустного рубля
        int bonus;                                 // бонусные рубли


        System.out.println("Здравствуйте!");
        System.out.println("На вашем счету было " + money + " рубля(ей).");
        System.out.println("Вы пополнили свой счёт на " + sum + " рубля(ей)");

        if (sum > 1000) {                           // проверка выполненого условия для начисления бонусных рублей.
            bonus = sum / counter;
            System.out.println("Мы вам дарим ещё " + bonus + " бонусных рубля(ей).");
            System.out.println("Теперь у вас на счету " + (money + sum + bonus) + " рубля(ей).");
        } else {                                // далее, если условия для начисления бонусных рублей не было выполнено.
            System.out.println("Теперь у вас на счету " + (money + sum) + " рубля(ей).");
        }
        ;

        System.out.println("Спасибо, что пользуетесь нашим оператором стовой связи!");


    }
}