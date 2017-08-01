package com.mmall.service;

import com.mmall.common.ServerResponse;

/**
 * @author xyy
 * @create 2017-08-01 13:55
 **/
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
