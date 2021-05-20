package dao;

import entity.RecruitmentList;

public interface RecruitmentListMapper {

    void uploadRecruitmentList(RecruitmentList recruitmentList,String path);

    RecruitmentList downloadRecruitmentList();

}
