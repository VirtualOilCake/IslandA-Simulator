package IASimulator;
import java.util.*;
import IASimulator.*;

public class IASimulator{
    //自定义区
    private int times = 3;  //自动生成回复的次数
    private boolean isShowMyCookie = false; //是否显示自己的饼干(尚未完成)
    private boolean isShowResponseCookie = false;   //是否显示回复的饼干(尚未完成)
    private boolean isShowResponseTime = false;   //是否显示回复时间(尚未完成)

    private String input = "";
    private ArrayList<String> output = new ArrayList<String>();

    public IASimulator(String input){
        this.input = input;
        //default output
        output.add("( ??。)");
        output.add("( ′_ゝ`)旦");
        output.add("(|||?Д?)");
        output.add("(?Д?≡?Д?)");
        output.add("?彡☆))д`)");
        output.add("(　^ω^)");
        output.add("(　^ω^)您说您马呢");
        output.add("致");
        output.add("摩多摩多");
        output.add(input);
    }

    public ArrayList getResponse(){
        for(MemeEnum meme : MemeEnum.Memes){
            if(meme.isMeme(this.input)){
                output.addAll(meme.getResponse());
            }
        }
        return output;
    }

    public int getTimes(){
        return times;
    }
}