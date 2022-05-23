/**
 * A network server responds with this information about blog articles
 * Title
 * Content
 * Number of readers
 * You receive 2 articles from the server.
 * Update the title to suit your blog but also keep the originals.
 * Print out all the article information.
 */

data class Article(val title: String, val content: String, val numOfReader: Int) {

}

fun main(args: Array<String>) {
    var article= arrayListOf<Article>()
    article.add(Article("Blog 1","Kotlin",200))
    article.add(Article("Blog 2","Python",300))
    for (art in article){
        println(art)
    }
}
