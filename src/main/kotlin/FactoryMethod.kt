import factory.Dialog
import factory.HtmlDialog
import factory.WIndowsDialog

fun main(){

    lateinit var dialog : Dialog

    fun runBusinessLogic(){
        dialog.renderWindow()
    }

    fun configure(){
        if(System.getProperty("os.name").equals("windows 10")){
            dialog = WIndowsDialog()
        }else{
            dialog = HtmlDialog()
        }
    }

    configure()
    runBusinessLogic()
}
