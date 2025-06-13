/**
 * A generic fixed-size circular buffer.
 *
 * @param capacity The maximum number of elements the buffer can hold. Must be greater than 0.
 * @param T The type of elements to store in the buffer.
 *
 * @author Davis Riedel
 */
class CircularBuffer<T>(private val capacity: Int) {
  init {
    require(capacity > 0) { "Capacity must be greater than 0." }
  }

  private val elements: Array<T?> = arrayOfNulls(capacity)

  private var head: Int = 0
  private var tail: Int = 0
  private var currentSize: Int = 0

  /**
   * Adds a new element to the buffer.
   * If the buffer is full, the oldest element is removed (and returned)
   * before the new element is added.
   *
   * @param element The element to add.
   * @return The element that was removed from the buffer if it was full,
   *         or `null` if the buffer was not full.
   */
  fun add(element: T): T? {
    var removedElement: T? = null

    if (currentSize == capacity) {
      // Buffer full, remove the oldest element (head).
      removedElement = elements[head]
      head = (head + 1) % capacity
    } else {
      // Buffer not yet full, increment currentSize.
      currentSize++
    }

    // Add new element at 'tail' position and move tail forward.
    elements[tail] = element
    tail = (tail + 1) % capacity

    return removedElement
  }

  /**
   * Retrieves the element at a specific relative index within the buffer.
   * Index 0 is the oldest element currently in the buffer, and index (currentSize - 1)
   * is the newest element.
   *
   * @param index The relative index of the element.
   * @return The element at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of bounds.
   */
  fun get(index: Int): T? {
    if (index < 0 || index >= capacity) {
      throw IndexOutOfBoundsException(
        "Index $index is out of bounds 0 to $capacity"
      )
    }
    if (index >= currentSize) return null

    val actualIndex = (head + index) % capacity
    return elements[actualIndex]
  }

  /**
   * Returns a new list containing all elements currently in the buffer,
   * ordered from oldest to newest.
   */
  fun toList(): List<T> {
    return (0 until currentSize).mapNotNull { get(it) }
  }

  /**
   * Returns the current number of elements in the buffer.
   */
  fun size(): Int = currentSize

  /**
   * Checks if the buffer is empty.
   */
  fun isEmpty(): Boolean = currentSize == 0

  /**
   * Checks if the buffer is full.
   */
  fun isFull(): Boolean = currentSize == capacity
}