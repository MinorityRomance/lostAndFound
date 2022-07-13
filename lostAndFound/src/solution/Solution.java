package solution;

import lost.BookLost;
import lost.Lost;
import lost.CardLost;

/**
 * 实现失物排序以及搜索
 * @author Jay Zhou
 * @version 1.0
 */
public class Solution {
    static final int total = 5;
    public static void helper() {
        Lost[] lostArray = new Lost[total];
        Lost[] receive = new Lost[total];

        lostArray[0] = new BookLost("20190910","查理九世","樱花食堂二楼");
        lostArray[1] = new CardLost("20200101","永恩","软件学院","2021212222","莘莘食堂二楼");
        lostArray[2] = new BookLost("20210328","三体一","樱花食堂二楼");
        lostArray[3] = new CardLost("20180909","亚索","体育","2018215003","" +"千喜鹤");
        lostArray[4] = new BookLost("20220101","Jvav开发","樱花食堂二楼");

        sortLost(lostArray);
        receive = selectByKeyword(lostArray,"樱花食堂二楼");
        for (int i = 0 ; i <= receive.length ;i++ ){
            System.out.println(receive[i].data(receive[i]));
        }
    }

    /**
     * 失物排序方法
     * @param lostArray 待排序的失物数组
     */
    public static void sortLost( Lost lostArray[]){
        int temp = 0;
        int index = 0;
        Lost lost;

        //选择排序
        for(int i = 0 ; i < lostArray.length - 1 ; i++){
            temp = i;
            for(int j = i+1 ; j < lostArray.length ; j++ ){
                if( lostArray[temp].detailData(lostArray[temp] ) >= lostArray[j].detailData(lostArray[j])){
                    index = temp ;
                }else{
                    temp = j ;
                    index = j ;
                }
            }

            lost = lostArray[i];
            lostArray[i] = lostArray[index] ;
            lostArray[index] = lost;
        }
    }

    /**
     * 按关键字搜索失物
     * @param lostArray 失物数组
     * @param keyword 用输入的关键词
     * @return 返回查到的失物
     */
    public static Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        Lost[] found = new Lost[total];
        int j = 0;
        for(int i = 0 ; i < lostArray.length ; i++ ){
            if( lostArray[i].data(lostArray[i]).indexOf(keyword) != -1 ){
                found[j] = lostArray[i];
                j++;
            }
        }
        return found;
    }
}
