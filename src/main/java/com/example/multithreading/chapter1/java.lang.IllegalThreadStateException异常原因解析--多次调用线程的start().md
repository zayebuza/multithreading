# java.lang.IllegalThreadStateException异常原因解析--多次调用线程的start()

![](https://github.com/zayebuza/static-resources/blob/master/java%E5%A4%9A%E7%BA%BF%E7%A8%8B%E6%A0%B8%E5%BF%83%E7%BC%96%E7%A8%8B%E6%8A%80%E6%9C%AF/%E7%BA%BF%E7%A8%8B%E5%A4%9A%E6%AC%A1%E8%B0%83%E7%94%A8start.png)

线程的几种状态：图片来源：牛客网
![](https://github.com/zayebuza/static-resources/blob/master/java%E5%A4%9A%E7%BA%BF%E7%A8%8B%E6%A0%B8%E5%BF%83%E7%BC%96%E7%A8%8B%E6%8A%80%E6%9C%AF/%E7%BA%BF%E7%A8%8B%E7%9A%84%E5%87%A0%E7%A7%8D%E7%8A%B6%E6%80%81.png)

1. 新建( new )：新创建了一个线程对象。
2. 可运行( runnable )：线程对象创建后，其他线程(比如 main 线程）调用了该对象 的 start ()方法。该状态的线程位于可运行线程池中，等待被线程调度选中，获 取 cpu 的使用权 。
3. 运行( running )：可运行状态( runnable )的线程获得了 cpu 时间片（ timeslice ） ，执行程序代码。
4. 阻塞( block )：阻塞状态是指线程因为某种原因放弃了 cpu 使用权，也即让出了 cpu timeslice ，暂时停止运行。直到线程进入可运行( runnable )状态，才有 机会再次获得 cpu timeslice 转到运行( running )状态。阻塞的情况分三种：
(一). 等待阻塞：运行( running )的线程执行 o . wait ()方法， JVM 会把该线程放 入等待队列( waitting queue )中。
(二). 同步阻塞：运行( running )的线程在获取对象的同步锁时，若该同步锁 被别的线程占用，则 JVM 会把该线程放入锁池( lock pool )中。
(三). 其他阻塞: 运行( running )的线程执行 Thread . sleep ( long ms )或 t . join ()方法，或者发出了 I / O 请求时， JVM 会把该线程置为阻塞状态。            当 sleep ()状态超时、 join ()等待线程终止或者超时、或者 I / O 处理完毕时，线程重新转入可运行( runnable )状态。
5. 死亡( dead )：线程 run ()、 main () 方法执行结束，或者因异常退出了 run ()方法，则该线程结束生命周期。死亡的线程不可再次复生。


Thread报错的原因，并不是说，重新启动Thread导致的，而是因为共用一个Thread导致的
线程的状态除了【可运行状态】与【阻塞状态】可以来回切换，其余的不可逆转

解决方案：
	1，实现runable接口
	2，每次new一个新的线程对象