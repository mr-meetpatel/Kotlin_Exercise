/**
 * You have a number of items on your desk.
 * val items = arrayListOf(“laptop”, “mouse”, “pen”, “paper”, “mug”, “phone”)
 * You clean up your desk and remove as many items as you can to be more productive.
 * val removedItems = listOf(“pen”, “paper”, “mug”, “phone”)
 * Print out the remaining items.
 */
fun main(args: Array<String>) {
    var itemsList= arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    var removeItemsList= listOf("pen","paper","mug","phone")
    itemsList.removeAll(removeItemsList)
    println(itemsList)
}
