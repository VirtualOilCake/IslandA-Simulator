package IASimulator;
import java.util.*;
public class MemeEnum {
    /*
    这里添加枚举
    初始化时第一个参数是输入值
    第二个参数是输出值
    特殊处理可以在getResponse中重载
    */


    //bog梗关键字
    static MemeEnum bog = new MemeEnum(new String[]{"bili", "Bili", "pili", "xili", "批站", "哔哩", "b站", "B站", "干杯", "( ゜- ゜)つロ ", "ビリ", "乾杯" },
    new String[]{"守?护?最?好?的?霹?雳?霹?雳", "pxj不要上岛！", "bog越来越多了", "钓鱼不可取", "(　^ω^)", "哪里来的bog？"});

    //二次元关键字
    static MemeEnum ecy = new MemeEnum(new String[]{"二次元", "呐", "米娜桑", "啊诺", "！？", "动漫", "三次元", "？！", "(?????)", "☆"},
    new String[]{"守?护?最?好?的?二?次?元", "呐呐呐呐呐", "呐，就硬呐", "小殇君不要?彡☆))д`)", "(　^ω^)给二次元的你一个微笑", "您就是二刺螈？", "二刺螈二刺螈", "纯度，太高了",
    "你把大家叫出来就是为了这一点事情啊.jpg", "新人石雕三月(つд?)", "真是什么人都可以上岛了"});

    //xp关键字
    static MemeEnum xp = new MemeEnum(new String[]{"喜欢", "我可以", "suki", "xp", "XP", "Xp", "hso"},
    new String[]{"兄啊，你的xp真的好鸡掰怪啊！", "？？？？？", "人不能，至少不应该", "说实话，我可以", "？？？？？？", "(　д ) ? ?",
    "你把大家叫出来就是为了这一点事情啊.jpg", "新人石雕三月(つд?)", "真是什么人都可以上岛了"}){
        @Override
        public ArrayList getResponse(){
            //responseList.add("恋"+inputString.substring(inputString.indexOf("喜欢")+1,inputString.indexOf("喜欢")+2)+"癖不要上岛");
            //responseList.add("恋"+inputString.substring(inputString.indexOf("我可以")-1,inputString.indexOf("我可以"))+"癖不要上岛");
            return super.responseList;
        }
    };

    //inm梗检测
    static MemeEnum inm = new MemeEnum(new String[]{"先辈", "野兽前辈", "  ", "あああああ", "目力", "homo", "Homo", "木毛", "田所", "ホモ"},
    new String[]{"淫梦小鬼不要上岛！", "你是一个一个一个", "唐突恶臭不要"});
    
    //齐齐哈尔检测
    static MemeEnum hhh = new MemeEnum(new String[]{"今天我", "σ", "来蛤我", "( ′_ゝ`)", "我竟然"},
    new String[]{"哈哈哈哈哈哈哈哈哈", "蛤蛤蛤蛤蛤蛤蛤", "σ`?′)UCCU", " ???)σ哈哈哈哈哈哈", "po好蠢啊( ???)σ",
    "你把大家叫出来就是为了这一点事情啊.jpg", "新人石雕三月(つд?)", "真是什么人都可以上岛了"});

    //致癌物检测
    static MemeEnum zaw = new MemeEnum(new String[]{"这都是什么神仙", "宝藏男孩", "妈妈爱你"},
    new String[]{"呕呕呕呕呕", "D区", "欢乐恶搞不是法外地", "D区", "致", "A岛核物理研究所(　д ) ? ?", "a岛×\n福岛√", "福岛JK不要上岛"});

    //岛主检测
    static MemeEnum atm = new MemeEnum(new String[]{"ATM", "A主席", "a主席", "岛主", "momo"},
    new String[]{"继续说，岛主很高兴", "继续说，a哥很喜欢"});
    
    //日语检测
    static MemeEnum jap = new MemeEnum(new String[]{"は", "を", "へ", "の", "な"},
    new String[]{"君日本语本当上手", "真就日语岛呗", "上手、上手", "a岛人均N1",
    "你把大家叫出来就是为了这一点事情啊.jpg", "新人石雕三月(つд?)", "真是什么人都可以上岛了"});
    
    //炼铜梗检测
    static MemeEnum loli = new MemeEnum(new String[]{"在炼", "铜", "loli", "萝莉", "Loli"},
    new String[]{"炼铜Biss", "炼铜术士GKD", "在炼啦！", "人人都有铜炼\n全世界的炼铜者联合起来！",
    "你把大家叫出来就是为了这一点事情啊.jpg", "新人石雕三月(つд?)", "真是什么人都可以上岛了"});

    static MemeEnum unoriginal = new MemeEnum(new String[]{"转自", "转载", "分享图片"},
    new String[]{"日本国投降矣.jpg", "天翼3G，太快了！"});
    
    static MemeEnum gf = new MemeEnum(new String[]{"女朋友", "女友", "彼女" },
    new String[]{"禁止晒妹", "(　^ω^)您说您??呢？", "(　^ω^)祝福你有一个美好的生活", "线虫不要上岛！"});
    
    static MemeEnum jgg = new MemeEnum(new String[]{"轮到我", "今天", "生日", "举高高"},
    new String[]{"锯睾睾(ノ???)ノ"}){
        @Override
        public ArrayList getResponse(){
            for(int jggTimes=0;jggTimes<5;jggTimes++)
            {
                super.responseList.add("举高高(ノ???)ノ");
                super.responseList.add("举高高(ノ???)ノ");
            }
            return super.getResponse();
        }
    };

    //这里将枚举添加进来
    public static MemeEnum[] Memes = {bog, ecy, xp, inm, hhh, zaw, atm, jap, loli, unoriginal, gf, jgg};

    private String[] stringArray;
    private ArrayList<String> responseList;
    public MemeEnum(String[] stringArray, String[] responseArray){
        this.stringArray = stringArray;
        //array to ArrayList
        this.responseList = new ArrayList<String>(Arrays.asList(responseArray));
    }

    public ArrayList getResponse(){
        return responseList;
    }

    public boolean isMeme(String input){
        for(String str : stringArray){
            //是否可以直接使用小写检测，枚举中就不需要写太多大小写
            //String strLowerCase = str.toLowerCase();
            if(input.indexOf(str) != -1){
                return true;
            }
        }
        return false;
    }
}