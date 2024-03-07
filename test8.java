package test8;

import java.util.*;

public class test8 {
    public static void main(String[] args) {
        System.out.println("请给出需要合并的字符串的总个数：");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       List<Integer> list=new ArrayList<>();
        System.out.println("请给出每个字符串的长度：");
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
        int sum=0;
        if(list.size()==1){
            sum+= list.get(0);
        }
        while(list.size()>1){
            int t1,t2;
            t1= list.get(0);
            list.remove(0);
            t2= list.get(0);
            sum+=(t1+t2);
            list.remove(0);
            list.add(t1+t2);
            Collections.sort(list);
        }
        System.out.println(sum);
    }
}
