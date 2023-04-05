package basic.homeworks;

public class homework3 {
   // Создайте две переменные isWeekend и isRain.
    // Создайте переменную canWalk, значение которой должно быть истинным,
    // если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
    //Создайте две переменные isEdekaOpen и isReweOpen,
    // значения которых зависят от того, открыты магазины или нет.
    // Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true,
    // если хотя бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.


//    static void hikingCondition(boolean isWeekend, boolean isRainy, boolean isCanWalk) {
//        if (isCanWalk && !isRainy && isWeekend) {
//            System.out.println("let's go to walk!");
//        } else {
//            if (isWeekend && isRainy) {
//                System.out.println("I am busy today, sorry");
//            } else if (isWeekend && isCanWalk) {
//                System.out.println("let's go to walk!");
//
//            }
//        }
//    }


    public static void main(String[] args) {
//        boolean isEdekaOpen = false;
//        boolean isRewaOpen = true;
//        boolean isCanBuy;
//
//        if (isEdekaOpen || isRewaOpen) {
//            isCanBuy = true;
//        }
//
//        Shop shop = new Shop(isEdekaOpen, isRewaOpen);
//        String shopName = "";
//        if (shop.canBuy()) {
//            if (shop.isEdekaOpen && !shop.isRewaOpen) {
//                shopName = "Edeka";
//            } else if (!shop.isEdekaOpen && shop.isRewaOpen) {
//                shopName = "Rewe";
//            } else if (shop.isEdekaOpen && shop.isRewaOpen) {
//                shopName = "Edeka или Rewe";
//            }
//            System.out.println("Я могу купить еду в " + shopName);
//        } else {
//            System.out.println("Я не могу купить еду ");
//        }
//    }
//
//    static class Shop {
//        private boolean isEdekaOpen;
//        private boolean isRewaOpen;
//
//        public Shop(boolean isEdekaOpen, boolean isRewaOpen) {
//            this.isEdekaOpen = isEdekaOpen;
//            this.isRewaOpen = isRewaOpen;
//        }
//
//        public boolean canBuy() {
//            return isEdekaOpen || isRewaOpen;
//        }
//    }
//}
//
//class Shop {
//    private boolean isEdekaOpen;
//    private boolean isRewaOpen;
//
//    public Shop(boolean isEdekaOpen, boolean isRewaOpen) {
//        this.isEdekaOpen = isEdekaOpen;
//        this.isRewaOpen = isRewaOpen;
//    }
//
//    public boolean canBuy() {
//        return isEdekaOpen || isRewaOpen;
//    }


//        Второй вариант решения(короткий)
//        boolean isWeekend = true;
//        boolean isRain = false;
//
//        boolean canWalk = false;
//        if (isWeekend && !isRain) {
//            canWalk = true;
//        }
//
//
//        boolean isEdekaOpen = true;
//        boolean isReweOpen = false;
//
//
//        boolean canBuy = false;
//        if (isEdekaOpen || isReweOpen) {
//            canBuy = true;
//        }
//
//
//        if (canBuy) {
//            System.out.println("Я могу купить еду, это true ");
//        } else {
//            System.out.println("Я могу купить еду, это false");
//        }
//
//
//    }


//        Представим, что у нас есть устройство, в котором две колбы.
//        Прибор работает корректно, если температура первой колбы выше 100 градусов,
//        а температура второй колбы меньше 100 градусов. Вы должны написать метод,
//        который проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
//        В результате он выводит сообщение true или false.


//        int Temperature1 = 110;
//        int Temperature2 = 90;
//
//// Проверяем корректность работы прибора
//        if (Temperature1 > 100 && Temperature2 < 100) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//    }


//        Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
//        Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
//        когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
//        а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
//        Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
//        Итак: требуется написать программу,
//            которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
//        сколько полных часов осталось до конца рабочего дня.
//                Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//        Обьяснение: в переменную n должно записываться случайное (на время тестирования программы)
//        целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто понимает в секундах)
//        и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов,
//                содержащихся в n секундах.


        int n = (int) (Math.random() * 28801);
        System.out.println("Осталось " + n + " секунд");
        int hoursLeft = (28800 - n) / 3600;

        if (hoursLeft > 1) {
            System.out.println("Осталось " + hoursLeft + " часов");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }

    }










