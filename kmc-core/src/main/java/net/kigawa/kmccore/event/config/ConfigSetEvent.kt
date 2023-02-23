package net.kigawa.kmccore.event.config

import net.kigawa.kmccore.config.ConfigKey
import net.kigawa.kmccore.event.CancelableEvent

class ConfigSetEvent<T: Any>(
  var key: ConfigKey<T, *>,
  val beforeValue: T,
  val changedValue: T,
): CancelableEvent {
  override var cancel: Boolean = false
}