package teakit;

import teakit.ingredient.Lemon;
import teakit.ingredient.Sugar;
import teakit.ingredient.TeaLeaf;
import teakit.liquid.Tea;
import teakit.liquid.Water;
import teakit.tank.Cup;
import teakit.tank.Kettle;
import teakit.tank.TeaKettle;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class Main {

    public static void main (String[] args) {

//Hello User. Тут ты сможешь узнать рецепт вкусного чая, и сделать его у себя дома или в офисе.
//Обычно в рецептах сразу после текстового описания действия добавляют фотографии, а тут будет код Java.
//Добавь капельку воображения и Ты User сможешь создать вкусный чай.

        //1)User Attention. Перед началом работ убедись что у тебя есть минимальный набор для приготовления чая.
        //Starter kit includes - Воду, Чайный лист, устройство для нагрева воды и емкость для употребления напитка.
        //Much better if you have емкость для заваривания чайного листа и дополнительные ингридиенты например сахар, фрукты, мята и тп.
        //Plz don't use водопроводную воду, заказывай бутилированную или очищай через хорошие фильтры.

        Kettle testKettle = new Kettle();
        Cup testCup = new Cup();
        Water testWater = new Water();
        TeaLeaf teaLeaf = new TeaLeaf(1);
        Sugar sweetSugar = new Sugar(1);

        //2) User дальше тебе надо нагреть воду. Используй для этого чайник.
        //От того насколько чистая вода будет зависеть конечный вкус Чая.
        //Внимательно посмотри и запомни максимальную вместимость чайника.
        int maxVolumeFromKettle = testKettle.getMaxVolume();

        //Убедись что тебя есть необходимое количество воды для заполнения емкости.
        testWater.setVolumeWater(maxVolumeFromKettle);
        //Заполни емкость до максимального знеачения. Можно меньше максимума, но не больше.
        testKettle.setWater(testWater);

        //После выпонения всех действий описанных выше, у тебя должен быть чайник наполненный водой
        //Надеюсь эта вода не из под водопроводного крана....Ее конечно пить можно, но вкусовые качеста у этой воды...
        //Теперь надо нагреть воду в чайнике, и получить горячую воду, иначе чайный лист не сможет завариться.
        testKettle.setMaxTempWater(testWater);
        System.out.println(testWater);

        //Now you have minimal kit for creating Tea. Of course you can make ordinary tea inside cup.
        testCup.createOfOrdinaryTea(testWater,teaLeaf);
        System.out.println(testCup.getTea());

        //So.. that tea it would not completely boring, it is best to add a little bit sugar.
        Tea tea = testCup.getTea();
        tea.setTeaSugar(sweetSugar);
        System.out.println(tea);

        //Don't think that you USER can be surprised usual Tea with sugar inside cup...But what if add slice Lemon?
        //Check whether perhaps you have a lemon. Lemon is excellent fruit of the citrus family for tea.
        //Think its classic example of a particular style. Simply and Tasty.
        Lemon lemon = new Lemon(2);
        tea.setSliceLemon(lemon);
        System.out.println(tea);

        //But that tea is not comfort drink because too HOT
        //Think is add two or three piece ICE will get much better
        tea.addIce(3,tea);
        System.out.println(tea);

        //Offer make tasty Tea inside Tea Kettle with addition tasty ingredients
        //E.G. very tasty Tea with slice of lemon, grapefruit, lime and leaves mint with addition honey or sugar.











    }
}
