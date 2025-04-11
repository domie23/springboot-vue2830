package com.dao;

import com.entity.YijianfankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YijianfankuiView;

/**
 * 意见反馈 Dao 接口
 *
 * @author 
 */
public interface YijianfankuiDao extends BaseMapper<YijianfankuiEntity> {

   List<YijianfankuiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
