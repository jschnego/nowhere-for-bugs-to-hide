import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LikesFormatterTest {

    @Test
    @DisplayName("For an empty list, a predefined message should be returned")
    void shouldPrintNoOneLikesThisForEmptyList() {
        String label = LikesFormatter.format(List.of());
        assertThat(label).isEqualTo("No one likes this");
    }

    @Test
    @DisplayName("For a single user, their name should be indicated")
    void shouldGiveTheNameForSingleUser() {
        String label = LikesFormatter.format(List.of("Jane"));
        assertThat(label).isEqualTo("Jane likes this");
    }
}
