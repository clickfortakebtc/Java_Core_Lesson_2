public class Something {

    public static void main(String[] args) {

        byte bt = 100;
        short shrt = 1000;
        int nt = 60000;
        long lng = 10000000;
        char cr = 'h';
        boolean tr = true;
        boolean fls = false;
        float flt = 5.6F;
        double dbl = 3.0;

        System.out.println(bt);
        System.out.println(shrt);
        System.out.println(nt);
        System.out.println(lng);
        System.out.println(cr);
        System.out.println("tr = " + tr);
        System.out.println("fls = " + fls);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < 10; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }

        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);

    }

}
