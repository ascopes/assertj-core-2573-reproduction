package io.github.ascopes.bugs.assertj_core_2573_reproduction;

import org.assertj.core.api.AbstractAssert;

/**
 * Dummy assertion class that exists to test linkage to AssertJ Javadocs.
 *
 * <p>We expect links such as {@link AbstractAssert} and {@link org.assertj.core.api.Assertions}
 * to both work as expected without warnings.
 *
 * @author Ashley Scopes
 * @since 29th May 2022.
 */
public final class DummyAssert extends AbstractAssert<DummyAssert, Object> {

  /**
   * Initialize this dummy assertion object.
   */
  public DummyAssert() {
    super(new Object(), DummyAssert.class);
  }
}