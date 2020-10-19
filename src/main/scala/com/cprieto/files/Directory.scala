package com.cprieto.files

class Directory(
    override val parent: String,
    override val name: String,
    val contents: List[DirEntry]
) extends DirEntry(parent, name)

object Directory {
  val SEPARATOR = "/"
  val ROOT_PATH = "/"

  def empty(parent: String, name: String): Directory =
    new Directory(parent, name, List())

  def ROOT: Directory = empty("", "")
}
