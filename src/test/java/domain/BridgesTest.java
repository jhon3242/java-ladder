package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class BridgesTest {
    //TODO 더 적합한 클래스 이름 고민하기

    @DisplayName("객체가 정상적으로 생성된다.")
    @Test
    void constructSuccessTest() {
        assertThatNoException()
                .isThrownBy(() -> new Bridges(List.of()));
    }

    //TODO : DisplayName 에서 자료형 제거
    @DisplayName("Bridges 가 올바른 길이의 List 를 반환해야 한다.")
    @Test
    void bridgesLengthTest() {
        //given
        List<Boolean> booleans = List.of(false, false, false, false, false);

        //when
        int length = booleans.size();
        Bridges bridges = new Bridges(booleans);

        //then
        assertThat(bridges.getBridges()).hasSize(length);
    }

    @MethodSource("provier")
    @ParameterizedTest
    void getBridgeTest(List<Boolean> expectedBridges) {
        Bridges bridges = new Bridges(expectedBridges);

        Assertions.assertThat(bridges.getBridges())
                .isEqualTo(expectedBridges);
    }


    static Stream<Arguments> provier() {
        return Stream.of(
                Arguments.of(List.of(true, false, false, true))
        );
    }
}
