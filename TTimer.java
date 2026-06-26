public class TTimer extends Thread{
    int anInt = 0;
    int time = 20;
    int stat = 0;
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
        System.exit(0);
    }
}
