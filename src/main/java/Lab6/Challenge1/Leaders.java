package Lab6.Challenge1;


import java.util.*;


public class Leaders {

    public static List<Integer> findLeaders(List<Integer> myList) {
        List<Integer> leaders = new ArrayList<>();
        Collections.reverse(myList);
        Iterator<Integer> it = myList.iterator();
        Integer max = myList.get(0);
        Integer current;
        leaders.add(max);
        while (it.hasNext()) {
            current = it.next();
            if(current > max) {
                max = current;
                leaders.add(current);
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(5, 7, 6, 2, 1, 4, 3));
        System.out.println(findLeaders(myList));

    }


}
