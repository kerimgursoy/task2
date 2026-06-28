public class TTimer extends Thread{
    int anInt = 0;
    int time = 20;
    int stat = 0;
    RandGame game;
    public TTimer(RandGame game){
        this.game = game;
    }
    @Override
    public void run() {
        while(anInt <= time){
            if(stat == 1) return;
            System.out.println(anInt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            anInt++;
        }
        System.out.println(game.num);
        System.exit(0);
    }
}
