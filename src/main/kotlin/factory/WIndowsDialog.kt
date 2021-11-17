package factory

import buttons.Button
import buttons.WindowsButton

class WIndowsDialog : Dialog{

    override fun createButton(): Button {
        return WindowsButton()
    }
}