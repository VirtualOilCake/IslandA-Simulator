import java.util.*;
public class main {
    public static void main(String[] args) {
        //自定义区
        int times = 3;//自动生成回复的次数
        boolean myCookie=false;//是否显示自己的饼干(尚未完成)
        boolean responseCookie=false;// 是否显示回复的饼干(尚未完成)
        boolean responseTime=false;//是否显示回复时间(尚未完成)
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
    output.add("⊂彡☆))д`)");
    output.add("(　^ω^)");
    output.add("(　^ω^)您说您马呢");
    output.add("致");
    output.add("摩多摩多");
    output.add(inputString);
/////////////////////////////////////////////////////////
//关键字语句： inputString.indexOf("关键字") != -1
        //bog梗关键字
        boolean bog=(
inputString.indexOf("bili") != -1||
inputString.indexOf("Bili") != -1||
inputString.indexOf("pili") != -1||
inputString.indexOf("xili") != -1||
inputString.indexOf("批站") != -1||
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
inputString.indexOf("(｡◕∀◕｡)") != -1||
inputString.indexOf("☆") != -1);
        //xp关键字
boolean xp1 = inputString.indexOf("喜欢") != -1;
boolean xp2 = inputString.indexOf("我可以") != -1;
boolean xp3 = inputString.indexOf("suki") != -1;
boolean xp4 = (inputString.indexOf("xp") !=-1||inputString.indexOf("XP") !=-1||inputString.indexOf("Xp") !=-1||inputString.indexOf("hso") !=-1);
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
        //致癌物检测
boolean zaw=(
inputString.indexOf("这都是什么神仙") != -1||
inputString.indexOf("宝藏男孩") != -1||
inputString.indexOf("妈妈爱你") != -1);
        //岛主检测
boolean atm=(
inputString.indexOf("ATM") != -1||
inputString.indexOf("A主席") != -1||
inputString.indexOf("a主席") != -1||
inputString.indexOf("岛主") != -1||
inputString.indexOf("momo") != -1);
        //日语检测
boolean japanese=(
inputString.indexOf("は") != -1||
inputString.indexOf("を") != -1||
inputString.indexOf("へ") != -1||
inputString.indexOf("の") != -1||
inputString.indexOf("な") != -1);
        //炼铜梗检测
boolean loli=(
inputString.indexOf("在炼") != -1||
inputString.indexOf("铜") != -1||
inputString.indexOf("loli") != -1||
inputString.indexOf("萝莉") != -1||
inputString.indexOf("Loli") != -1);
boolean unoriginal=(
inputString.indexOf("转自") != -1||
inputString.indexOf("转载") != -1||
inputString.indexOf("分享图片") != -1
);
boolean gf=(
inputString.indexOf("女朋友") != -1||
inputString.indexOf("女友") != -1||
inputString.indexOf("彼女") != -1);
boolean jgg=(
inputString.indexOf("轮到我") != -1||(
inputString.indexOf("今天") != -1&&inputString.indexOf("生日") != -1||
inputString.indexOf("举高高") != -1
)
);
//////////////////////////////////////////////
        ///////////回复区///////////
//回复区语句: output.add("回复的话");
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
output.add("二刺螈二刺螈");
output.add("纯度，太高了");
}
if((xp1||xp2||xp3||xp4)&&(!loli))
{
output.add("兄啊，你的xp真的好鸡掰怪啊！");
output.add("？？？？？");
output.add("人不能，至少不应该");
output.add("说实话，我可以");
output.add("？？？？？？");
output.add("(　д ) ﾟ ﾟ");
}
if(xp1)
{
    output.add("恋"+inputString.substring(inputString.indexOf("喜欢")+1,inputString.indexOf("喜欢")+2)+"癖不要上岛");
}
if(xp2)
{
    output.add("恋"+inputString.substring(inputString.indexOf("我可以")-1,inputString.indexOf("我可以"))+"癖不要上岛");
}
if(inm)
{
output.add("淫梦小鬼不要上岛！");
output.add("你是一个一个一个");
output.add("唐突恶臭不要");
}
if(hhh)
{
output.add("哈哈哈哈哈哈哈哈哈");
output.add("蛤蛤蛤蛤蛤蛤蛤");
output.add("σ`∀´)UCCU");
output.add(" ﾟ∀ﾟ)σ哈哈哈哈哈哈");
output.add("po好蠢啊( ﾟ∀ﾟ)σ");
}
if(zaw||ecy)
{
output.add("呕呕呕呕呕");
output.add("D区");
output.add("欢乐恶搞不是法外地");
output.add("D区");
output.add("致");
output.add("A岛核物理研究所(　д ) ﾟ ﾟ");
output.add("a岛×\n福岛√");
output.add("福岛JK不要上岛");
}
if(atm)
{
output.add("继续说，岛主很高兴");
output.add("继续说，a哥很喜欢");
}
if(japanese)
{
output.add("君日本语本当上手");
output.add("真就日语岛呗");
output.add("上手、上手");
output.add("a岛人均N1");
}
if(loli)
{
output.add("炼铜Biss");
output.add("炼铜术士GKD");
output.add("在炼啦！");
output.add("人人都有铜炼\n全世界的炼铜者联合起来！");
}
if(unoriginal)
{
output.add("日本国投降矣.jpg");
output.add("天翼3G，太快了！");
}
if(gf)
{
    output.add("禁止晒妹");
    output.add("(　^ω^)您说您🐎呢？");
    output.add("(　^ω^)祝福你有一个美好的生活");
    output.add("线虫不要上岛！");
}
if(jgg)
{
    for(int jggTimes=0;jggTimes<5;jggTimes++)
    {
        output.add("举高高(ノﾟ∀ﾟ)ノ");
        output.add("举高高(ノﾟ∀ﾟ)ノ");
    }
    output.add("锯睾睾(ノﾟ∀ﾟ)ノ");
}
if(!(ecy||xp1||xp2||xp3||xp4||hhh||japanese||loli))
{
output.add("你把大家叫出来就是为了这一点事情啊.jpg");
output.add("新人石雕三月(つд⊂)");
output.add("真是什么人都可以上岛了");
}



        //输出

        for (int i = 0; i < times; i++) {
            System.out.println("---------------------");
            System.out.println(output.get((int) (Math.random() * output.size())));
        }

    }
}
