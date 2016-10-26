import java.util.*;
import java.io.*;
public class FileNerd {

	public static void main(String[] args) throws IOException{
		Scanner Fn = new Scanner(new File("C:\\temp_Larry\\NerdData.txt"));
		String []a = new String[1000];
		int maxIndx = -1;
		while(Fn.hasNext()){
			maxIndx++;
			a[maxIndx] = Fn.nextLine();}
		Fn.close();
		for (int b = 0; b <= maxIndx; b++){
			if (a[b].substring(0,3).equals("The")){
				System.out.println(a[b]);}}}}