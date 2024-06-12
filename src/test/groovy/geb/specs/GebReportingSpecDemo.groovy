package geb.specs

import geb.pages.WikipediaHomePage
import geb.pages.WikipediaItaHomePage
import geb.spock.GebReportingSpec

class GebReportingSpecDemo extends GebReportingSpec { //when using GebReportingSpec, a reporting dir must be set

    def "Wikipedia.org -> Wikipedia.it"() {

        given: "Wikipedia homepage"
        to WikipediaHomePage //to: navigates to the page and checks the correct page has been reached (using Page at and content properties)

        when: "clicking on 'Italiano'"
        linkboxIta.click()

        then: "landing on Wikipedia ITA homepage"
        at WikipediaItaHomePage //at: verifies that the correct page has been reached

    }

}
