package io.github.zhangyumin.TestTHread1;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 15-10-17.
 */
public class TestThread1 {
    public static void main(String args[]){
        Runner1 r = new Runner1();
        r.start();
//        r.run();
//        Thread t = new Thread(r);
//        t.start();
        for(int i=0; i<100; i++){
            System.out.println("io.github.zhangyumin.io.github.zhangyumin.WordMaze.WordMaze thread:-----------"+i);
        }
    }
}
//class io.github.zhangyumin.TestTHread1.Runner1 implements Runnable{
class Runner1 extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("io.github.zhangyumin.TestTHread1.Runner1:-----------"+i);
        }
    }
}
