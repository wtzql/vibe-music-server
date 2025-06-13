package cn.edu.seig.vibemusic.service;

import cn.edu.seig.vibemusic.model.dto.CommentPlaylistDTO;
import cn.edu.seig.vibemusic.model.dto.CommentSongDTO;
import cn.edu.seig.vibemusic.model.entity.Comment;
import cn.edu.seig.vibemusic.result.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sunpingli
 * @since 2025-01-09
 */
public interface ICommentService extends IService<Comment> {

    // 新增歌曲评论
    Result addSongComment(CommentSongDTO commentSongDTO);

    // 新增歌单评论
    Result addPlaylistComment(CommentPlaylistDTO commentPlaylistDTO);

    // 点赞评论
    Result likeComment(Long commentId);

    // 取消点赞评论
    Result cancelLikeComment(Long commentId);

    // 删除评论
    Result deleteComment(Long commentId);

}
