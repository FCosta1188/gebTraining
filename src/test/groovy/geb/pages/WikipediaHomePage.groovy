package geb.pages

import geb.Page

class WikipediaHomePage extends Page {

    static url = "https://www.wikipedia.org/"

    static at = { //verifying the page based on content defined below
        heading.isDisplayed()
    }

    static content = {
        heading {$("h1.central-textlogo-wrapper")}
        linkboxIta {$("a#js-link-box-it.link-box")}
    }

}