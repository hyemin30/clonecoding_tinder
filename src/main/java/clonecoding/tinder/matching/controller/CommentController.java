package clonecoding.tinder.matching.controller;

import clonecoding.tinder.matching.model.dto.CommentRequestDto;
import clonecoding.tinder.matching.model.dto.CommentResponseDto;
import clonecoding.tinder.matching.service.CommentService;
import clonecoding.tinder.security.UserDetailsImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    //상대방과 나 사이의 댓글 다 가져오기
    @ApiOperation(value = "나와 매칭된 회원 댓글 조회")
    @GetMapping("/comments")
    public List<CommentResponseDto> getComments(@AuthenticationPrincipal UserDetailsImpl userDetails, @RequestBody CommentRequestDto requestDto) {
        return commentService.getComments(userDetails.getMember().getPhoneNum(), requestDto);
    }

    //댓글 작성하기
    @ApiOperation(value = "댓글달기")
    @PostMapping("/comments")
    public CommentResponseDto createComments(@AuthenticationPrincipal UserDetailsImpl userDetails, @RequestBody CommentRequestDto requestDto) {
        return commentService.createComments(userDetails.getMember().getPhoneNum(), requestDto);
    }
}
