package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.DictDataMapper;
import cn.ca.data.entity.DictData;
import cn.ca.data.service.IDictDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IDictDataServiceImpl extends ServiceImpl<DictDataMapper, DictData> implements IDictDataService {

}
