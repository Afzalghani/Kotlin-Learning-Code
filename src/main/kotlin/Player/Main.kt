package Player
class Player(
    private val downloader:Download,
    private val player: play1
):Download by downloader,play1 by player{

}
