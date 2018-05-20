package lk;

/**
 * Created by ${ lknny@163.com } on 2018/5/20.
 */
public class 两线程交替打印 {

	public static final Object lock = new Object();
	public static int i = 1;

	public static void main(String[] args) {

		new Thread(){
			@Override
			public void run() {
				for (;i<=100;){
					synchronized (lock){
						if (i%2!=0){
							System.out.println(i++);
						}else {
							lock.notifyAll();
							try {
								lock.wait(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}


			}
		}.start();
		new Thread(){
			@Override
			public  void run() {
				for (;i<=100;){
					synchronized (lock){
						if (i % 2 == 0) {
							System.out.println(i++);
						}else {
							lock.notifyAll();
							try {
								lock.wait(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}.start();



	}

}
