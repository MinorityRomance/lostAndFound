package lost;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 书籍失物
 * @author Jay Zhou
 * @version 1.0
 */
public class BookLost extends Lost{
    /**
     * 创建遗失书籍默认值
     */
    public BookLost(){
        this("无","无","无");
    }

    /**
     * 创建遗失书籍实例
     * @param lostDate 遗失日期
     * @param name 书名
     * @param placeToReceive 失物招领处
     */
    public BookLost(String lostDate,String name,String placeToReceive){
        super(lostDate,name,placeToReceive);
    }

    /**
     * 将String类型的日期转换成int类型
     * @param obj 接受传入的对象
     * @return 返回以及转换成int类型的日期
     */
    @Override
    public int detailData(Lost obj) {
        //在把对象存入数组中时就完成了向上转型，为了调用子类成员变量，在此进行向下转型
        BookLost obj1 = (BookLost) obj;

        return Integer.parseInt(obj1.getLostDate());
    }

    /**
     * 返回书籍的具体信息
     * @param obj 失物引用
     * @return 书籍的具体信息
     */
    @Override
    public String data(Lost obj) {
        //在把对象存入数组中时就完成了向上转型，为了调用子类成员变量，在此进行向下转型
        BookLost obj1 = (BookLost)obj;

        return "书名:"+obj1.getName()+
                "\n领取地点："+obj1.getPlaceToReceive()+
                "\n遗失时间："+obj1.getLostDate();
    }
}
