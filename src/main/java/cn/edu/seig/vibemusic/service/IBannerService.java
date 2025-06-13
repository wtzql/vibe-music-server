package cn.edu.seig.vibemusic.service;

import cn.edu.seig.vibemusic.model.dto.BannerDTO;
import cn.edu.seig.vibemusic.model.entity.Banner;
import cn.edu.seig.vibemusic.model.vo.BannerVO;
import cn.edu.seig.vibemusic.result.PageResult;
import cn.edu.seig.vibemusic.result.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
public interface IBannerService extends IService<Banner> {

    // 获取轮播图列表
    Result<PageResult<Banner>> getAllBanners(BannerDTO bannerDTO);

    // 添加轮播图
    Result addBanner(String bannerUrl);

    // 更新轮播图
    Result updateBanner(Long bannerId, String bannerUrl);

    // 更新轮播图状态
    Result updateBannerStatus(Long bannerId, Integer bannerStatus);

    // 删除轮播图
    Result deleteBanner(Long bannerId);

    // 批量删除轮播图
    Result deleteBanners(List<Long> bannerIds);

    // 获取轮播图列表（用户端）
    Result<List<BannerVO>> getBannerList();
}
