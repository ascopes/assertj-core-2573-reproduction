/**
 * Dummy declaration that enables building the project as a JPMS module.
 *
 * @author Ashley Scopes
 * @since 29th May 2022
 */
module io.github.ascopes.bugs.assertj_core_2573_reproduction {
  requires org.assertj.core;
  exports io.github.ascopes.bugs.assertj_core_2573_reproduction;
}