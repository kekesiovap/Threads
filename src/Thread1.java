class Thread1 implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep((long)(Math.random() * 1000));
                System.out.println("Thread 1: "+i);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception..." + e);
        }
    }
}