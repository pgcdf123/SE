package dao.impl;

import dao.RecruitmentListMapper;
import entity.RecruitmentList;
import utils.JsonData;

public class RecruitmentListMapperImpl implements RecruitmentListMapper {

    public void uploadRecruitmentList(RecruitmentList recruitmentList) {

        JsonData.GetClassDirector().add(recruitmentList);
    }

    public RecruitmentList downloadRecruitmentList(String GUID)
    {
        RecruitmentList temp=null;
        for(RecruitmentList list:JsonData.GetClassDirector())
        {
            if(list.equals(GUID))
            {
                temp=list;
            }
        }
        return temp;
    }
    public void downloadAll()
    {
        JsonData.commit();
    }
}
