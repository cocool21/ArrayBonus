import java.util.Scanner;

public class ArrayBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[200];
		int counter = 0;
		boolean complete = false;

		System.out.println("Please enter information: ");
		String line = sc.next();
		if (line.toLowerCase().equals("history")) {
			for (int i = counter - 1; i >= 0; i--) {
				System.out.println(data[i]);
			}
		} else {
			data[counter] = line;
			counter++;
		}
		line = sc.next();

		do {
			for(int i=0;i<=counter-1;i++){
				for(int j=1;j<counter-i;j++){
					if(Integer.valueOf(data[j-1].toLowerCase().charAt(0))>Integer.valueOf(data[j].toLowerCase().charAt(0))){
					String swap;
					swap=data[j-1];
					data[j-1]=data[j];
					data[j]=swap;
					}
				}
			}
			if (line.toLowerCase().equals("history")) {
				for (int i = 0; i < counter; i++) {
					System.out.println(data[i]);
				}
			} else {
				data[counter] = line;
				counter++;
			}
			line = sc.next();

			if ((counter+1) % 10 == 0 && counter > 1) {
				System.out.println("Are you finished?(y/n)");
				String yn = sc.next();
				if (yn.toLowerCase().equals("y")) {
					complete = true;
				}

			}

		} while (complete == false);
		for(int i=0;i<=counter-1;i++){
			for(int j=1;j<counter-i;j++){
				if(Integer.valueOf(data[j-1].toLowerCase().charAt(0))>Integer.valueOf(data[j].toLowerCase().charAt(0))){
				String swap;
				swap=data[j-1];
				data[j-1]=data[j];
				data[j]=swap;
				}
			}
		}
		for (int i = 0; i <counter; i++) {
			System.out.println(data[i]);
		}

		sc.close();
	}

}
