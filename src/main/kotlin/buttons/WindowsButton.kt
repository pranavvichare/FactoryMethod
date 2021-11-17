package buttons

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.*


class WindowsButton : Button{

    var panel : JPanel = JPanel()
    var frame : JFrame= JFrame()
    lateinit var button: JButton

    override fun render() {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        val label = JLabel("Hello World!")
        label.isOpaque = true
        label.background = Color(235, 233, 126)
        label.font = Font("Dialog", Font.BOLD, 44)
        label.horizontalAlignment = SwingConstants.CENTER
        panel.layout = FlowLayout(FlowLayout.CENTER)
        frame.contentPane.add(panel)
        panel.add(label)
        onClick()
        panel.add(button)
        frame.setSize(320, 200)
        frame.isVisible = true
        onClick()
    }

    override fun onClick() {
        button = JButton("Exit")
        button.addActionListener {
            frame.isVisible = false
            System.exit(0)
        }
    }
}