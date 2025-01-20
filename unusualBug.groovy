```groovy
def unusualBug() {
  def list = [1, 2, 3]
  list.eachWithIndex { item, index ->
    if (item == 2) {
      list.remove(item) 
    }
  }
  println list
}

unusualBug() // Output: [1, 3] 
```