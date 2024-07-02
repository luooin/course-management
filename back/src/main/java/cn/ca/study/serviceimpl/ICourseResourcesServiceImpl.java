package cn.ca.study.serviceimpl;

import cn.ca.study.mapper.CourseResourcesMapper;
import cn.ca.study.entity.CourseResources;
import cn.ca.study.service.ICourseResourcesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
@Transactional
public class ICourseResourcesServiceImpl extends ServiceImpl<CourseResourcesMapper, CourseResources> implements ICourseResourcesService {

    @Autowired
    private CourseResourcesMapper courseResourcesMapper;
}