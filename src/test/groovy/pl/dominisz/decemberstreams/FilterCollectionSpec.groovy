package pl.dominisz.decemberstreams

import spock.lang.Specification

/*
Filter collection so that only elements with less then 4 characters are returned.
 */
class FilterCollectionSpec extends Specification {

    def "filter collection should return words shorter than 4 characters"() {
        setup:
        def collection = ["My", "name", "is", "John", "Doe"]
        def expected = ["My", "is", "Doe"]

        when:
        def filteredCollection = FilterCollection.transform(collection)

        then:
        filteredCollection == expected
    }

}
