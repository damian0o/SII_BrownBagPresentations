package pl.apso.optional.basic;

import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Optional_2_assign_null_Test {

  @Test
  public void should_not_assign_null_to_optional() {
    var uut = (Optional<String>) null;

    assertThatThrownBy(() -> {
      uut.isPresent();
    }).isInstanceOf(NullPointerException.class);
  }

  @Test
  public void should_not_return_null_when_optional_is_expected() {
    var uut = someMethodReturningOptional();
    assertThatThrownBy(() -> uut.isPresent())
        .isInstanceOf(NullPointerException.class);
  }

  private Optional<String> someMethodReturningOptional() {
    return null;
  }

}
