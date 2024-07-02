package cn.ca.study.serviceimpl;

import cn.ca.study.mapper.AppraiseMapper;
import cn.ca.study.entity.Appraise;
import cn.ca.study.service.IAppraiseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
@Transactional
public class IAppraiseServiceImpl extends ServiceImpl<AppraiseMapper, Appraise> implements IAppraiseService {

    @Autowired
    private AppraiseMapper appraiseMapper;
}