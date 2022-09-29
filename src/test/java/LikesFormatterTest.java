import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LikesFormatterTest {

    @Test
    @DisplayName("For an empty list, a predefined message should be returned")
    void shouldPrintNoOneLikesThisForEmptyList() {
        assertThat(LikesFormatter.format(List.of())).isEqualTo("No one likes this");
    }
}
