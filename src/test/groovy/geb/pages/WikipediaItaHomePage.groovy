package geb.pages

import geb.Page

class WikipediaItaHomePage extends Page{
    
    static url = "https://it.wikipedia.org/wiki/Pagina_principale"

    static at = {heading.isDisplayed()}

    static content = {
        heading {$("span.main-page-header-title")}
    }

}
