package factory

import buttons.Button
import buttons.HtmlButton

class HtmlDialog : Dialog {

    override fun createButton(): Button {
        return HtmlButton()
    }
}