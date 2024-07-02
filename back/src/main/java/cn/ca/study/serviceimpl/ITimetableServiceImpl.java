package cn.ca.study.serviceimpl;

import cn.ca.study.mapper.TimetableMapper;
import cn.ca.study.entity.Timetable;
import cn.ca.study.service.ITimetableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
@Transactional
public class ITimetableServiceImpl extends ServiceImpl<TimetableMapper, Timetable> implements ITimetableService {

    @Autowired
    private TimetableMapper timetableMapper;
}