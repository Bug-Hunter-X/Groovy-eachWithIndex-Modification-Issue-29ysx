```groovy
def safeListModification() {
  def list = [1, 2, 3]
  def itemsToRemove = []
  list.eachWithIndex { item, index ->
    if (item == 2) {
      itemsToRemove.add(index)
    }
  }

  //Remove items safely
  itemsToRemove.reverse().each { index ->
    list.remove(index)
  }
  println list
}

safeListModification() // Output: [1, 3]
```