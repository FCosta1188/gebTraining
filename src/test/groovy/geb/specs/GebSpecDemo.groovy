package geb.specs

import geb.pages.WikipediaHomePage
import geb.pages.WikipediaItaHomePage
import geb.spock.GebSpec

class GebSpecDemo extends GebSpec {

    def "Wikipedia.org -> Wikipedia.it"() {

        given: "Wikipedia homepage"
        to WikipediaHomePage //to: navigates to the page and checks the correct page has been reached (using Page at and content properties)

//            def browser = new Browser(driver: new ChromeDriver())
//            browser.drive {
//                    to WikipediaHomePage
//                    assert page instanceof WikipediaHomePage
//            }

        when: "clicking on 'Italiano'"
        linkboxIta.click()

        then: "landing on Wikipedia ITA homepage"
        at WikipediaItaHomePage //at: verifies that the correct page has been reached

    }

}
