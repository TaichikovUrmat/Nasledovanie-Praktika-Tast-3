import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

        Spartansy spartansy = new Spartansy("Kuba","20");
        System.out.println(STR."""
            Spartansy:
             Name: \{spartansy.getName()}
             Войска: \{spartansy.getAge()}
         *************************************
                """);
        Luchniki luchniki1 = new Luchniki("Ajybek","50","170","65");
        System.out.println(STR."""
            Luchniki:
               Name: \{luchniki1.getName()}
               Войска: \{luchniki1.getAge()}
               Рос: \{luchniki1.getHeight()}
               Вес: \{luchniki1.getWeight()}
         ***************************************
                """);
        Pytsyry pytsyry = new Pytsyry("Mirlan","60","25","40");
        System.out.println(STR."""
             Rytsyry:
               Name: \{pytsyry.getName()}
               Войска: \{pytsyry.getAge()}
               Атчандар: \{pytsyry.getHorsemen()}
               Жо баскандар: \{pytsyry.getJoBaskandar()}
        ****************************************
                """);
        Vsatneki vsatneki = new Vsatneki("Kairat","150","150","5-жыл");
        System.out.println(STR."""
           Vsatneki:
               Name: \{vsatneki.getName()}
               Войска: \{vsatneki.getAge()}
               Кылыччандар: \{vsatneki.getFecers()}
               Опут: \{vsatneki.getLevel()}
        ****************************************
                """);
    }
}