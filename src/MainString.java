
import java.util.HashSet;
import java.util.Set;

/**
 * @auther: sjg
 * @date: 2018/5/9 15:47
 * @description:
 */
public class MainString {

    public static int maxLength(String str){
        if(str==null||str.equals("")){
            return 0;
        }
        Set<Character> set=new HashSet<Character>();
        int maxLength=0;
        //定义两个指针
        int pre=0;
        int after=0;
        while(after<str.length()){
            if(!set.contains(str.charAt(after))){
                set.add(str.charAt(after));
                after++;
            }else{
                set.clear();
                if((after-pre)>maxLength){
                    maxLength=after-pre;
                }
                pre++;
                after=pre;
            }
        }

        if((after-pre)>maxLength){
            maxLength=after-pre;
        }
        return maxLength;
    }

}
