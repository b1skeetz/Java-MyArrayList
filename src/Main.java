public class Main {
    public static void main(String[] args) {
        MyList mylist = new MyArrayList();

        for(int i = 0; i < 20; i++){
            mylist.add("item #" + i);
        }

        mylist.set(18, "Roman");
        mylist.remove(19);
        for(int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + " ");
        }

        System.out.println();

        mylist.add(10, "added item 10");
        mylist.add(10, "added item 155");
        mylist.add(10, "added item 109");

        for(int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + " ");
        }

        System.out.println(mylist.contains("item #55"));
    }
}