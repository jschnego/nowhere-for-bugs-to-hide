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

    @Test
    @DisplayName("For two users, their names should be separated by 'and'")
    void shouldConnectTwoUsersWithAnd() {
        String label = LikesFormatter.format(List.of("Jane", "John"));
        assertThat(label).isEqualTo("Jane and John like this");
    }

    @Test
    @DisplayName("For three users, the first two names should be separated by a comma")
    void shouldHaveCommaSeparationForThreeUsers() {
        String label = LikesFormatter.format(List.of("Jane", "John", "Gina"));
        assertThat(label).isEqualTo("Jane, John and Gina like this");
    }
}
