import java.util.ArrayList;

public class myclass {


public static void main(String[] args) {
String[] ok={"cat", "rain","wait", "freeze","dog", "neeraj"};
ArrayList<ArrayList<String>> my=new ArrayList<>();

for (int i = 0; i < ok.length; i++) {
ArrayList<String> ls=new ArrayList<>();
for (int j = 0; j < i; j++) {
if(ok[i].length()==ok[j].length()){
System.out.println(ok[i]+"and"+ok[j]);
ls.add(ok[i]);
ls.add(ok[j]);
}
}

if(!ls.isEmpty()){
my.add(ls);

}
}

System.out.println(my);
}
}