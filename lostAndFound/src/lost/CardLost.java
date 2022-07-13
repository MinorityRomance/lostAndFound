package lost;

import java.text.SimpleDateFormat;

/**
 * 一卡通失物
 * @author Jay Zhou
 * @version 1.0
 */
public class CardLost extends Lost{
    private String college;//学院
    private String sno;//学号

    /**
     * 创建一卡通默认值
     */
    public CardLost(){
        this("无","无","无","无","无");
    }

    /**
     * 创建一卡通实例
     * @param lostDate 遗失日期
     * @param name 失主名
     * @param college 学院
     * @param sno 学号
     * @param placeToReceive 失物的领取地点
     */
    public CardLost(String lostDate, String name, String college, String sno, String placeToReceive){
        super(lostDate,name,placeToReceive);
        this.setCollege(college);
        this.setSno(sno);
    }
    /**
     * 改变学号
     * @param sno 学号
     */
    public void setSno(String sno){
        this.sno = sno;
    }

    /**
     * 返回学号
     * @return 学号
     */
    public String getSno(){
        return this.sno;
    }

    /**
     * 改变学院名
     * @param college 学院名
     */
    public void setCollege(String college){
        this.college = college;
    }

    /**
     * 返回学院名
     * @return 学院
     */
    public String getCollege(){
        return this.college;
    }

    /**
     * 将String类型的日期转换成int类型
     * @param obj 接受传入的对象
     * @return 返回以及转换成int类型的日期
     */
    @Override
    public int detailData(Lost obj) {
        //在把子类对象存入数组中时就完成了向上转型，为了调用子类成员变量，在此进行向下转型
        CardLost obj1 = (CardLost)obj;

        return Integer.parseInt(obj1.getLostDate());
    }

    /**
     * 返回一卡通的具体信息
     * @param obj 失物引用
     * @return 一卡通的具体信息
     */
    @Override
    public String data(Lost obj) {
        //在把对象存入数组中时就完成了向上转型，为了调用子类成员变量，在此进行向下转型
        CardLost obj1 = (CardLost) obj;

        return  "失主:"+obj1.getName()+
                "\n学院："+obj1.getCollege()+
                "\n学号："+obj1.getSno()+
                "\n领取地点："+obj1.getPlaceToReceive()+
                "\n遗失时间："+obj1.getLostDate();
    }
}
