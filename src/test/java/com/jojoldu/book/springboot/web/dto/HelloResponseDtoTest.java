package com.jojoldu.book.springboot.web.dto;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        // assertThat : assertj 라는 테스트 검증 라이브러리의 검증 메소드
        // 검증하고 싶은 대상을 메소드 인자로 받음
        // 메소드 체이닝이 지원되어 isEqualTo 와 같이 메소드를 이어서 사용 가능
        // isEqualTo : assertj 의 동등 비교 메소드
        // assertThat 에 있는 값과 isEqualTo 의 값을 비교해서 같을 때만 성공

        // Junit 와 비교하여 assertj 의 장점
        // CoreMatchers 와 달리 추가적으로 라이브러리가 필요하지 않음
        // 자동완성이 확실하게 지원 됨
    }
}
