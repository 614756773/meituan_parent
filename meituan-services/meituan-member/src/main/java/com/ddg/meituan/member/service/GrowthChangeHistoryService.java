package com.ddg.meituan.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ddg.meituan.common.utils.PageUtils;
import com.ddg.meituan.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author 
 * @email 
 * @date 2021-01-31 16:44:02
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

