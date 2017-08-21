package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

/**
 * @author xyy
 * @create 2017-08-17 11:17
 **/
public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse queryOrderPayStatus(Integer id, Long orderNo);

    ServerResponse createOrder(Integer id, Integer shippingId);

    ServerResponse cancel(Integer id, Long orderNo);

    ServerResponse getOrderCartProduct(Integer id);

    ServerResponse getOrderDetail(Integer id, Long orderNo);

    ServerResponse getOrderList(Integer id, int pageNum, int pageSize);


    //backend
    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);
    ServerResponse<OrderVo> manageDetail(Long orderNo);
    ServerResponse<PageInfo> manageSearch(Long orderNo,int pageNum,int pageSize);
    ServerResponse<String> manageSendGoods(Long orderNo);
}
