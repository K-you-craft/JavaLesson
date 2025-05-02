package JavaTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ID初期化
		TASK id1 = new TASK("TASK001");
		TASK id2 = new TASK("TASK002");
		TASK id3 = new TASK("TASK003");
		TASK id4 = new TASK("TASK001");
		TASK id5 = new TASK("TASK004");
		TASK id6 = new TASK("TASK002");
		
		//重複のIDは外す必要がありますか？
		Set<String> taskId = new HashSet<String>();
		taskId.add(id1.getId());
		taskId.add(id2.getId());
		taskId.add(id3.getId());
		taskId.add(id4.getId());
		taskId.add(id5.getId());
		taskId.add(id6.getId());
		
		
		//ID一覧
		System.out.println("処理済みのタスクID一覧:");
		for(String id : taskId) {
			System.out.println(" - "+ id);
		}
		

		System.out.println();
		
		
		//宣言
		TASK id7 = new TASK("TASK003");
		TASK id8 = new TASK("TASK005");
		
		
		
		//メソッドに代入
		check(taskId , id7.getId());
		check(taskId , id8.getId());
		
		
	}

	  public static void check(Set<String> taskId, String id) {
	        if(taskId.contains(id)) {
	            System.out.println("タスクID" + id +"は既に処理済みです");
	        } else {
	            System.out.println("タスクID" + id + "は未処理です");
	        }
	    }
}
