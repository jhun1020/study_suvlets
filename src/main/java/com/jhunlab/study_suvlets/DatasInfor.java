package com.jhunlab.study_suvlets;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.HashMap;

import com.jhunlab.beans.MemberBean;

public class DatasInfor {
    public HashMap<String, String> getSearchFormData() {
        // 리턴을 키와 value로 리턴한다 ==>  hashmap사용
        HashMap<String, String> searchForm = new HashMap<String, String>();

        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "이정훈!");
        searchForm.put("id", "ID0001!");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();    
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");

        return tablesListWithString;
    }

    public HashMap<String, Object> getBundleData() {
      DatasInfor datasInfor = new DatasInfor();
      HashMap<String, String> searchForm = datasInfor.getSearchFormData();
      ArrayList<String> tablesListWithString = datasInfor.getTablesListWithString();
      
      HashMap<String, Object> bundlesData = new HashMap<>();
      
      bundlesData.put("searchForm", searchForm);
      bundlesData.put("tablesListWithString", tablesListWithString);
      
    //    public MemberBean getDataWithMemberBean(){ 여기의 부분 번들로 추가
      bundlesData.put("dataWithMemberBean", datasInfor.getDataListWithMemberBean());
//  밑의 리스트도 번들로 추가
bundlesData.put("dataListWithMemberBean", datasInfor.getDataListWithMemberBean());



        return bundlesData;

    }
    public MemberBean getDataWithMemberBean(){
        MemberBean memberbean = new MemberBean();
        memberbean.setFirstName("Mark");
        memberbean.setSecondName("Otto");
        memberbean.setHandleName("@mdo");

        return memberbean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean() {
        ArrayList<MemberBean> membersList = new ArrayList<>();
        //그동안 스트링만 넣었었는데 조상을 오브젝트로 갖고 있는 클래스는 제너릭에 다 들어감

        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        membersList.add(memberBean);

        MemberBean memberBean02 = new MemberBean();
        memberBean.setFirstName("jacob");
        memberBean.setSecondName("Thorton");
        memberBean.setHandleName("@fat");
        membersList.add(memberBean02);

        MemberBean memberBean03 = new MemberBean();
        memberBean.setFirstName("Larry");
        memberBean.setSecondName("Bird");
        memberBean.setHandleName("@twitter");
        membersList.add(memberBean03);

        return membersList;
    }
}

