package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.DepartmentHeaderMapper;
import cn.ca.data.entity.DepartmentHeader;
import cn.ca.data.service.IDepartmentHeaderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IDepartmentHeaderServiceImpl extends ServiceImpl<DepartmentHeaderMapper, DepartmentHeader> implements IDepartmentHeaderService {

}
