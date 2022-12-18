package com.jhunlab.study_suvlets;

import java.util.ArrayList;

public class SurveyDatasInfor {
    public static ArrayList<String> getSurveyArrayList(){
        ArrayList<String> surveyArrayList = new ArrayList<String>();

        surveyArrayList.add("해당 매장을 방문시 매장은 청결 하였습니까?");
        surveyArrayList.add("주문시 직원은 고객님께 친절 하였습니까?");
        surveyArrayList.add("주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        surveyArrayList.add("직원이 제조한 음료에 대해 맛은 좋았습니까?");
        surveyArrayList.add("해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");


        return surveyArrayList;
    }

    public static ArrayList<String> getAnswerArrayList(){
        ArrayList<String> answerArrayList = new ArrayList<String>();

        answerArrayList.add("(1) 매우 그렇다");
        answerArrayList.add("(2) 그렇다");
        answerArrayList.add( "(3) 보통이다");
        answerArrayList.add( "(4) 아니다");
        answerArrayList.add( "(5) 전혀 아니다");

        return answerArrayList;
    }
}
