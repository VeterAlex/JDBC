/**
 * Created by IT_School on 04.12.2015.
 */
/**
public class Enum {

    enum Seasons {winter, spring, summer, autumn};
    enum Planets {Venus(2), Earth(3), Saturn(6), Mars(4);  int order;
        Planets(int order){
            this.order = order;
            }
        };

    public static void main(String[] args) {

        Seasons seasons = Seasons.winter;
        switch (seasons){

            case winter:
                    System.out.println("Winter");
                break;
            case spring:
                System.out.println("Spring");
                break;
            case summer:
                System.out.println("Summer");
                break;
            case autumn:
                System.out.println("Autumn");
                break;
        }
        //System.out.println(Seasons.valueOf("spring"));
         Seasons [] s = Seasons.values();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println(Seasons.summer.ordinal());
        System.out.println(Planets.Mars.order);


        // System.out.println(Seasons.winter);
       // System.out.println(Seasons.class.getName());
    }

}
**/