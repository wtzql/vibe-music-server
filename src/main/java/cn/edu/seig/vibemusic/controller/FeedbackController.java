package cn.edu.seig.vibemusic.controller;


import cn.edu.seig.vibemusic.model.dto.FeedbackDTO;
import cn.edu.seig.vibemusic.model.entity.Feedback;
import cn.edu.seig.vibemusic.result.PageResult;
import cn.edu.seig.vibemusic.result.Result;
import cn.edu.seig.vibemusic.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
@RestController
public class FeedbackController {

    @Autowired
    private IFeedbackService feedbackService;

    /**
     * 获取反馈列表
     *
     * @return 反馈列表
     */
    @PostMapping("/admin/getAllFeedbacks")
    public Result<PageResult<Feedback>> getAllFeedbacks(@RequestBody FeedbackDTO feedbackDTO) {
        return feedbackService.getAllFeedbacks(feedbackDTO);
    }

    /**
     * 删除反馈
     *
     * @param feedbackId 反馈id
     * @return 结果
     */
    @DeleteMapping("/admin/deleteFeedback/{id}")
    public Result deleteFeedback(@PathVariable("id") Long feedbackId) {
        return feedbackService.deleteFeedback(feedbackId);
    }

    /**
     * 批量删除反馈
     *
     * @param feedbackIds 反馈id列表
     * @return 结果
     */
    @DeleteMapping("/admin/deleteFeedbacks")
    public Result deleteFeedbacks(@RequestBody List<Long> feedbackIds) {
        return feedbackService.deleteFeedbacks(feedbackIds);
    }

    /**
     * 添加反馈
     *
     * @param content 反馈内容
     * @return 结果
     */
    @PostMapping("/feedback/addFeedback")
    public Result addFeedback(@RequestParam(value = "content") String content) {
        return feedbackService.addFeedback(content);
    }

}
