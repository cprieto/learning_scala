package com.cprieto.commands

import com.cprieto.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State =
    state.setMessage("Unknown command\n")
}
