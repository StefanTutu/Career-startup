package com.cgm.threads.main;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

import com.cgm.threads.classes.FindClass;
import com.cgm.threads.classes.RunnableThread;
import com.cgm.threads.classes.ThreadSubcalss;

public class FindThreads {

	static ForkJoinPool fjPool = new ForkJoinPool();

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		// extending thread
		ThreadSubcalss threadSubcalss = new ThreadSubcalss();
		threadSubcalss.start();

		Thread runnableThread = new Thread(new RunnableThread());
		runnableThread.start();

		// tread implementation
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread Running");
			}
		};
		thread.start();

		// executor service
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Executor service thread running");
			}
		});

		executorService.shutdown();

		int option;
		String root = null;
		Scanner in = new Scanner(System.in);
		do {
			do {
				String menu = "\n Please select an option to perform" + "\n1 (1) Select a root directory"
						+ "\n2 (2) Search for files containing a given word." + "\n0 (0) Exit Program";
				System.out.println(menu);
				option = in.nextInt();
			} while (option < 0 || option > 2); // This will make the menu repeat if option is higher than 3 or lowen
												// than 0.

			switch (option) {
			case 1:
				System.out.println("Enter a root format like this: C:\\Program Files ");
				root = in.next();
				break;
			case 2:
				if (root == null) {
					System.out.println("Please select a root");
				} else {
					System.out.println("Enter the word for search in file");
					final String word = in.next();
					File dir = new File(root);
					if (dir.exists()) // Directory exists then proceed.
					{
						FilenameFilter filter = new FilenameFilter() {
							public boolean accept(File dir, String name) {
								return name.startsWith(word);
							}
						};

						String[] children = dir.list(filter);
						if (children == null) {
							System.out.println("Either dir does not exist or is not a directory");
						} else {
							for (int i = 0; i < children.length; i++) {
								String filename = children[i];
								System.out.println(filename);
							}
						}
					} // IF directory exists then only process.
					else {
						System.out.print("\n Directory doesn't exist.");
					}

					// fork join
					ForkJoinPool pool = new ForkJoinPool();
					// create tree instances of folder process
					FindClass system = new FindClass(root);
					FindClass rootSearch = new FindClass (root+word);
					// execute the instances
					pool.execute(system);
					pool.execute(rootSearch);

					// fancy display of tasks
					while ((!system.isDone()|| (!rootSearch.isDone()))) {
						System.out.printf("======================================================\n");
						System.out.printf("Main: Parallelism: %d\n", pool.getParallelism());
						System.out.printf("Main: Active Threads: %d\n", pool.getActiveThreadCount());
						System.out.printf("Main: Task Count: %d\n", pool.getQueuedTaskCount());
						try {
							// wait 1 second for visibility
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					// close fork join pool
					pool.shutdown();
					List<String> results;
					int totalResults = 0;
					// join results
					results = system.join();
					totalResults += results.size();
					System.out.printf("File in path: %d files found.\n", results.size());
					results = rootSearch.join();
					totalResults += results.size();
					System.out.printf("Folder and subfolder: %d .\n", results.size());

				}
				break;
			default:
				System.out.println("Bye Bye Baby");
				break;
			}
		} while (option != 0);
	}

}
