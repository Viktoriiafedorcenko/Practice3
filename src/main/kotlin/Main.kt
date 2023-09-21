
 import kotlin.random.Random
 import kotlin.math.sqrt
 fun main(args: Array<String>) {
     // 1 zadacha
     val myAge = 18
     val isTeenager = 13 < myAge && 19 > myAge // использую булеву логику
     println(isTeenager)
     // 2 zadacha
     val theirAge = 30
     val bothTeenagers = 13 < myAge && 19 > myAge || 13 < theirAge && 19 > theirAge // использую булеву логику и определяю являются ли оба подростками
     println(bothTeenagers)
     // 3 zadacha
     val reader = "Viktoria"
     val author = "Richard Lucas"
     val authorlsReader = reader == author // использую равенство строк и определяю равны ли
     println(authorlsReader)
     // 4 zadacha
     val readerBeforeAuthor = reader < author // использую сравнение строк , чтобы определить  следует ли по алфавиту
     println(readerBeforeAuthor)
     // 5 zadacha
     val myAge2 = 18
     if (13 < myAge2 && 19 > myAge2) // использую булеву логику  и исп if выражение для вывода ответа
      {
         println("Это подросток ")
     } else {
         println("Это не подросток ")
     }
     // 6 zadacha
     val answer = if (13 < myAge2 && 19 > myAge2) "Подросток" else "Не подросток" // создаю однострочное выражение if
     // установить его равным результату, который вы выводили для 5 задачи используя замыкание

     println(answer)
     // 7 zadacha
     var counter = 0
     while (counter < 10) {
         counter = counter + (counter + 1)
     }
     // 8 zadacha
     counter = 0
     var roll = 0
     do {

         roll = Random.nextInt(6) // выбор  случайного числа  между 0 и 5
         counter += 1
         println(" После $counter , roll равен $roll ") //
     } while (roll != 0)

//  9 zadacha
 val range=1..10 // интервал
     for (i in range){
         val squart = i*i //цикл  выполняющий итерацию  по этому интервалу
         println(squart)}
         // 10 zadacha
         for (i in range){
             val  squart2=sqrt(i.toDouble()) //выводит квадрат каждого числа
             println(squart2)
     }
     var sum=0
     for (row in  1 until 8 step 2) // 1,3,5,7 использует шаг чтобы пропускать  четные строки
     {
         for (column in 0 until 8){
             sum+= row*column}} //
     println(sum)
         }


