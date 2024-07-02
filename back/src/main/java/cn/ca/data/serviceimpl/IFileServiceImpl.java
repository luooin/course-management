package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.FileMapper;
import cn.ca.data.entity.File;
import cn.ca.data.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class IFileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
