import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel

fun main(){
    var window = JFrame()
    window.setSize(2000, 800)
    window.contentPane = Game()

    window.isVisible = true
}

class Game: JPanel(){

    override fun paintComponent(g: Graphics) {

        for(i in 0..10){
            drawSnowman(g, readLine()!!.toInt(), readLine()!!.toInt())
        }
    }

    private fun drawSnowman(g: Graphics, x:Int, y:Int) {
        g.color = Color.BLUE
        g.fillOval(x, y, 100, 100)
        g.fillOval(x - 50, y + 90, 200, 200)
        g.fillOval(x - 100, y + 280, 300, 300)
        g.color = Color.BLACK
        g.fillRect(x + 10, y - 60, 80, 75)
        g.fillOval(x + 45, y + 115, 10, 10)
        var y = y + 115
        for (i in 0..7) {
            g.fillOval(x + 45, y, 10, 10)
            y += 50
        }
    }
}

class Snowman{

}