package blackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda {

    private ArrayList<Card> koloda = new ArrayList<>();

    public void prepared(){
        koloda.add(new Card("Двойка трефа", 2));
        koloda.add(new Card("Четверка трефа", 4));
        koloda.add(new Card("Пятерка трефа", 5));
        koloda.add(new Card("Шестерка трефа", 6));
        koloda.add(new Card("Семерка трефа", 7));
        koloda.add(new Card("Восьмерка трефа", 8));
        koloda.add(new Card("Девятка трефа", 9));
        koloda.add(new Card("Десятка трефа", 10));
        koloda.add(new Card("Валет трефа", 10));
        koloda.add(new Card("Дама трефа", 10));
        koloda.add(new Card("Король трефа", 10));
        koloda.add(new Card("Туз трефа", 11));
        koloda.add(new Card("Двойка бубен", 2));
        koloda.add(new Card("Четверка бубен", 4));
        koloda.add(new Card("Пятерка бубен", 5));
        koloda.add(new Card("Шестерка бубен", 6));
        koloda.add(new Card("Семерка бубен", 7));
        koloda.add(new Card("Восьмерка бубен", 8));
        koloda.add(new Card("Девятка бубен", 9));
        koloda.add(new Card("Десятка бубен", 10));
        koloda.add(new Card("Валет бубен", 10));
        koloda.add(new Card("Дама бубен", 10));
        koloda.add(new Card("Король бубен", 10));
        koloda.add(new Card("Туз бубен", 11));
        koloda.add(new Card("Двойка червей", 2));
        koloda.add(new Card("Четверка червей", 4));
        koloda.add(new Card("Пятерка червей", 5));
        koloda.add(new Card("Шестерка червей", 6));
        koloda.add(new Card("Семерка червей", 7));
        koloda.add(new Card("Восьмерка червей", 8));
        koloda.add(new Card("Девятка червей", 9));
        koloda.add(new Card("Десятка червей", 10));
        koloda.add(new Card("Валет червей", 10));
        koloda.add(new Card("Дама червей", 10));
        koloda.add(new Card("Король червей", 10));
        koloda.add(new Card("Туз червей", 11));
        koloda.add(new Card("Двойка пик", 2));
        koloda.add(new Card("Четверка пик", 4));
        koloda.add(new Card("Пятерка пик", 5));
        koloda.add(new Card("Шестерка пик", 6));
        koloda.add(new Card("Семерка пик", 7));
        koloda.add(new Card("Восьмерка пик", 8));
        koloda.add(new Card("Девятка пик", 9));
        koloda.add(new Card("Десятка пик", 10));
        koloda.add(new Card("Валет пик", 10));
        koloda.add(new Card("Дама пик", 10));
        koloda.add(new Card("Король пик", 10));
        koloda.add(new Card("Туз пик", 11));

    }

    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return koloda.get(randomNum);

    }
}
