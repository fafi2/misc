/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
import spock.lang.Specification

class UnpushedBranchesSpec extends Specification {
    def "someLibraryMethod returns true"() {
        when:
        println 'ls'.execute().text

        then:
        true
    }
}
