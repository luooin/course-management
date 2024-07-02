package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.DictMapper;
import cn.ca.data.entity.Dict;
import cn.ca.data.service.IDictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IDictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

}
