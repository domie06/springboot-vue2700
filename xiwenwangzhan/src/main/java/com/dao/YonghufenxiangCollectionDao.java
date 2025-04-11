package com.dao;

import com.entity.YonghufenxiangCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghufenxiangCollectionView;

/**
 * 用户分享收藏 Dao 接口
 *
 * @author 
 */
public interface YonghufenxiangCollectionDao extends BaseMapper<YonghufenxiangCollectionEntity> {

   List<YonghufenxiangCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
