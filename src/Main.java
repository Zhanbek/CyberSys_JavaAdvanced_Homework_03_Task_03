public class Main {
    public static void main(String[] args) {

        String text = "Я буду защищать ваши интересы в Версале и попытаюсь уладить все трудности протокола встречи. А можете ли вы пообещать мне сохранить все двадцать католических миссий в Персии?";
        int length = text.length();
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println();
        stringBuilder.append("Початковий рядок: '").append(text).append("' має довжину ").append(length);
        System.out.println(stringBuilder.toString());


        System.out.println();
        String firstPart = text.substring(0, length / 2);
        System.out.println("Перша підрядок: '" + firstPart + "' має довжину " + firstPart.length());

        System.out.println();
        String secondPart = text.substring(length / 2);
        System.out.println("Друга підрядка: '" + secondPart + "' має довжину " + secondPart.length());    }
}