import java.util.*;
public class main {
    public static void main(String[] args) {
        //自定义区
        int times = 3;//自动生成回复的次数
        boolean myCookie=false;//是否显示自己的饼干
        boolean responseCookie=false;// 是否显示回复的饼干
/////////////////////////////////////////////////////////
        //初始化
        java.util.Scanner input = new java.util.Scanner(System.in);
        String inputString = input.next();/*用户输入*/
        ArrayList output = new ArrayList();/*输出的list*/
/////////////////List中的默认内容////////////////////////
    output.add("( ﾟ∀。)");
    output.add("( ´_ゝ`)旦");
    output.add("(|||ﾟДﾟ)");
    output.add("(ﾟДﾟ≡ﾟДﾟ)");
    output.add("( ´_ゝ`)");
    output.add("⊂彡☆))д`)");
    output.add("(　^ω^)");
    output.add("(　^ω^)您说您马呢");
    output.add(inputString);
/////////////////////////////////////////////////////////
//关键字语句： inputString.indexOf("") != -1
        //bog梗关键字
        boolean bog=(
inputString.indexOf("bili") != -1||
inputString.indexOf("Bili") != -1||
inputString.indexOf("哔哩") != -1||
inputString.indexOf("b站") != -1||
inputString.indexOf("B站") != -1||
inputString.indexOf("干杯") != -1||
inputString.indexOf("( ゜- ゜)つロ ") != -1||
inputString.indexOf("ビリ") != -1||
inputString.indexOf("乾杯") != -1);
        //二次元关键字
        boolean ecy=(
inputString.indexOf("二次元") != -1||
inputString.indexOf("呐") != -1||
inputString.indexOf("米娜桑") != -1||
inputString.indexOf("啊诺") != -1||
inputString.indexOf("！？") != -1||
inputString.indexOf("动漫") != -1||
inputString.indexOf("三次元") != -1||
inputString.indexOf("？！") != -1||
inputString.indexOf("(｡◕∀◕｡)") != -1);
        //xp关键字
boolean xp1 = inputString.indexOf("好喜欢") != -1;
boolean xp2 = inputString.indexOf("我可以") != -1;
boolean xp3 = inputString.indexOf("我喜欢") != -1;
boolean xp4 = (inputString.indexOf("xp") !=-1||inputString.indexOf("XP") !=-1||inputString.indexOf("Xp") !=-1);
        //inm梗检测
boolean inm=(
inputString.indexOf("先辈") != -1||
inputString.indexOf("野兽前辈") != -1||
inputString.indexOf("  ") != -1||
inputString.indexOf("あああああ") != -1||
inputString.indexOf("目力") != -1||
inputString.indexOf("homo") != -1||
inputString.indexOf("Homo") != -1||
inputString.indexOf("木毛") != -1||
inputString.indexOf("田所") != -1||
inputString.indexOf("ホモ") != -1);
        //齐齐哈尔检测
boolean hhh=(
inputString.indexOf("今天我") != -1||
inputString.indexOf("σ") != -1||
inputString.indexOf("来蛤我") != -1||
inputString.indexOf("( ´_ゝ`)") != -1||
inputString.indexOf("我竟然") != -1);
        //致远星检测
boolean zyx=(
inputString.indexOf("这都是什么神仙") != -1||
inputString.indexOf("宝藏男孩") != -1||
inputString.indexOf("妈妈爱你") != -1);
        //岛主检测
boolean ATM=(
inputString.indexOf("ATM") != -1||
inputString.indexOf("A主席") != -1||
inputString.indexOf("a主席") != -1||
inputString.indexOf("岛主") != -1||
inputString.indexOf("momo") != -1);
        //日语检测
boolean Japanese=(
inputString.indexOf("は") != -1||
inputString.indexOf("を") != -1||
inputString.indexOf("へ") != -1||
inputString.indexOf("の") != -1||
inputString.indexOf("な") != -1);
        //炼铜梗检测
boolean loli=(
inputString.indexOf("在炼了") != -1||
inputString.indexOf("铜") != -1||
inputString.indexOf("loli") != -1||
inputString.indexOf("萝莉") != -1||
inputString.indexOf("Loli") != -1);
boolean unoriginal=(
inputString.indexOf("转自") != -1||
inputString.indexOf("转载") != -1);

//////////////////////////////////////////////
        ///////////回复区///////////
//回复区语句: output.add("")
if(bog)
{
output.add("守❤护❤最❤好❤的❤霹❤雳❤霹❤雳");
output.add("pxj不要上岛！");
output.add("bog越来越多了");
output.add("钓鱼不可取");
output.add("(　^ω^)");
output.add("哪里来的bog？");
}
if(bog)
{
output.add("守❤护❤最❤好❤的❤霹❤雳❤霹❤雳");
output.add("pxj不要上岛！");
output.add("bog越来越多了");
output.add("钓鱼不可取");
output.add("(　^ω^)");
output.add("哪里来的bog？");
}
if(ecy)
{
output.add("守❤护❤最❤好❤的❤二❤次❤元");
output.add("呐呐呐呐呐");
output.add("呐，就硬呐");
output.add("小殇君不要⊂彡☆))д`)");
output.add("(　^ω^)给二次元的你一个微笑");
output.add("您就是二刺螈？");
}
else
{
output.add("你把大家叫出来就是为了这一点事情啊.jpg");
output.add("新人石雕三月(つд⊂)");
output.add("真是什么人都可以上岛了");
}


        //输出

        for (int i = 0; i < times; i++) {
            System.out.println(output.get((int) (Math.random() * output.size())));
        }

    }
}
