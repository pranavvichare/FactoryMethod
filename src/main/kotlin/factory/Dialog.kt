package factory

import buttons.Button

interface Dialog {

    fun renderWindow() {
        val okButton: Button = createButton()
        okButton.render()
    }

    fun createButton(): Button
}