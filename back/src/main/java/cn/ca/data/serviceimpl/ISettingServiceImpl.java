package cn.ca.data.serviceimpl;

import cn.ca.data.dao.mapper.SettingMapper;
import cn.ca.data.entity.Setting;
import cn.ca.data.service.ISettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ISettingServiceImpl extends ServiceImpl<SettingMapper, Setting> implements ISettingService {

}
