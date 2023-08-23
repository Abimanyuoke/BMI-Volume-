import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    String nama = "Fanani Akbar Abimanyu";
    int umur = 15;
    double tb = 1.70;
    int bb = 52;
    double BMI;

    System.out.println("Nama :" + nama);
    System.out.println("Umur :" + umur);
    System.out.println("Tinggi badan :" + tb);
    System.out.println("Berat Badan :" + bb);

    BMI = (bb/(tb*tb));

    if (BMI <18.5) {
      System.out.println(String.format ("BMI: %.2f", BMI));
      System.out.println("kurus");
    }

    else if (BMI <24.9) {
      System.out.println(String.format ("BMI: %.2f", BMI));
      System.out.println("Normal");
    }
    
    else if (BMI <29.9) {
      System.out.println(String.format ("BMI: %.2f", BMI));
      System.out.println("Gemuk");
    }

    else{
      System.out.println(String.format ("BMI: %.2f", BMI));
      System.out.println("Obesitas");
    }


    Scanner bola = new Scanner (System.in);

    System.out.println("input jari jari");
    double jari = bola.nextDouble();

    double phi = 3.14;

    double volbola = phi*(jari*jari*jari)*4/3;
    System.out.println("Hasil: " + volbola);
  


    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter username"); 
    userName = myObj.nextLine();   
       
    System.out.println("Username is: " + userName);  
    
    Scanner tabung = new Scanner (System.in);
    
    System.out.println("masukkan jari jari");
    int jari1 = myObj.nextInt();

    System.out.println("masukkan tinggi");
    int tinggi = myObj.nextInt();

    double rumus = (jari1*jari1*tinggi)*3.14;
    System.out.println(rumus);

    tabung.close();
  }
}

