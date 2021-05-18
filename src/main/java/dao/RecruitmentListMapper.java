package dao;

import entity.RecruitmentList;

public interface RecruitmentListMapper {

    void uploadRecruitmentList(RecruitmentList recruitmentList);

    RecruitmentList downloadRecruitmentList();

}
