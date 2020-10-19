package com.cprieto.filesystem

import java.util.Scanner

import com.cprieto.commands.Command
import com.cprieto.files.Directory

object FileSystem extends App {
  val root = Directory.ROOT
  val scanner = new Scanner(System.in)

  var state = State(root, root)
  while (true) {
    state.show()
    state = Command.from(scanner.nextLine()).apply(state)
  }
}
