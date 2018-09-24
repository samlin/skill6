package cn.skill6.website.dao.impl.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.skill6.common.entity.po.user.UserLoginRecord;
import cn.skill6.website.dao.intf.user.UserLoginRecordOper;
import cn.skill6.website.dao.mappers.user.UserLoginRecordMapper;

/**
 * 登录记录操作实现类
 *
 * @author 何明胜
 * @version 1.0.1
 * @since 2018年8月28日 上午12:18:47
 */
public class UserLoginRecordImpl implements UserLoginRecordOper {
  private static final Logger logger = LoggerFactory.getLogger(UserLoginRecordImpl.class);

  @Autowired private UserLoginRecordMapper userLoginRecordMapper;

  @Override
  public int deleteByLoginId(Long loginId) {
    logger.warn("删除id为{}的登录记录", loginId);

    return userLoginRecordMapper.deleteByPrimaryKey(loginId);
  }

  @Override
  public int addLoginRecord(UserLoginRecord userLoginRecord) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public UserLoginRecord findByLoginId(Long loginId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<UserLoginRecord> findAll() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int modifyByLoginId(UserLoginRecord userLoginRecord) {
    // TODO Auto-generated method stub
    return 0;
  }
}
