package lost;

import java.util.Collection;

/**
 * 失物父类
 * @author Jay Zhou
 * @version 1.0
 */
public abstract class Lost implements Comparable<Lost> {
    private String name;//失物名字或失物上的名字
    private String placeToReceive;//失物放置的地点
    private String lostDate;//遗失日期

    /**
     * 创建一个失物默认值
     */
    public Lost(){
        this("无","无","无");
    }

    /**
     * 创建一个失物
     * @param name 失物名字或失物上的名字
     * @param lostDate 遗失日期
     * @param placeToReceive 失物的领取地点
     */
    public Lost(String lostDate,String name,String placeToReceive){
        this.setLostDay(lostDate);
        this.setName(name);
        this.setPlaceToReceive(placeToReceive);
    }

    /**
     * 改变失物名字
     * @param name 失物名字或失物上的名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回失物名字
     * @return 失物名字或失物上的名字
     */
    public String getName(){
        return this.name;
    }


    /**
     * 改变遗失日
     * @param lostDate 遗失日期
     */
    public void setLostDay(String lostDate) {
        this.lostDate = lostDate;
    }

    /**
     * 返回遗失日
     * @return 返回遗失日
      */
    public String getLostDate() {
        return this.lostDate;
    }

    /**
     * 改变失物的领取地点
     * @param placeToReceive 失物的领取地点
     */
    public void setPlaceToReceive(String placeToReceive) {
        this.placeToReceive = placeToReceive;
    }

    /**
     * 返回失物的领取地点
     * @return 失物的领取地点
     */
    public String getPlaceToReceive() {
        return placeToReceive;
    }

    /**
     * 对日期由大到小排序
     * @param obj
     * @return 指定的数与参数相等返回 0，指定的数小于参数返回 -1，指定的数大于参数返回
     */
    @Override
    public int compareTo(Lost obj) {
        return Integer.parseInt(obj.lostDate) - Integer.parseInt(this.lostDate);
    }

    /**
     * 以int形式返回日期
     * @param obj 接受传入的对象
     * @return
     */
    public abstract int detailData(Lost obj);

    /**
     * 返回失物的具体信息
     * @param obj 引用失物
     * @return 失物的具体信息
     */
    public abstract String data(Lost obj);
}
