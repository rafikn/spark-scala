import wikipedia.WikipediaArticle
import wikipedia.WikipediaRanking._

val langs = List("Scala", "Java", "Groovy", "Haskell", "Erlang")
val articles = List(
  WikipediaArticle("1","Groovy is pretty interesting, and so is Erlang"),
  WikipediaArticle("2","Scala and Java run on the JVM"),
  WikipediaArticle("3","Scala is not purely functional"),
  WikipediaArticle("4","The cool kids like Haskell more than Java"),
  WikipediaArticle("5","Java is for enterprise developers")
)
val rdd = sc.parallelize(articles)