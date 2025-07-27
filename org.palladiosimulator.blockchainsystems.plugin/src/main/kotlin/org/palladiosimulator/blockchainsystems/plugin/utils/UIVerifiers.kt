package org.palladiosimulator.blockchainsystems.plugin.utils

import org.eclipse.swt.events.VerifyEvent
import org.eclipse.swt.events.VerifyListener
import org.eclipse.swt.widgets.Text

abstract class NumberVerifier : VerifyListener {
  fun getNewText(e: VerifyEvent): String {
    val oldText = (e.widget as Text).text
    return oldText.substring(0, e.start) + e.text + oldText.substring(e.end)
  }
}

object LongVerifier : NumberVerifier() {
  override fun verifyText(e: VerifyEvent) {
    getNewText(e).toLongOrNull() ?: run { e.doit = false }
  }
}

object DoubleVerifier : NumberVerifier() {
  override fun verifyText(e: VerifyEvent) {
    getNewText(e).toDoubleOrNull() ?: run { e.doit = false }
  }
}
