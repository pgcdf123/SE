package service.impl;

import dao.RecruitmentListMapper;
import dao.impl.RecruitmentListMapperImpl;
import entity.RecruitmentList;

public class ClassDirectorServiceImpl implements service.ClassDirectorService {

    RecruitmentListMapper recruitmentListMapper = new RecruitmentListMapperImpl();

    public void uploadRecruitmentList(RecruitmentList recruitmentList) {
        recruitmentListMapper.uploadRecruitmentList(recruitmentList);
    }
}
