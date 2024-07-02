package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.DepartmentMapper;
import cn.ca.data.entity.Department;
import cn.ca.data.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class IDepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
