import java.util.*;

class display {
    public int display(String s1, String s2, int c1, int c2) {
        System.out.println("\n\n------------------------------------");
        System.out.println("\n\nThe diagnosis is conducted safey!!");
        System.out.println(s1 + " :Rs." + c1 + "\n" + s2 + " :Rs." + c2);
        System.out.println("The diagnosis taken and the cost: " + (c1 + c2));
        return c1 + c2;
    }

    void showdetails(String[] details, int t) {
        System.out.println("\n\n------------------------------------");
        System.out.println("Patient: " + details[0] + " Bill");
        System.out.println("------------------------------------");
        System.out.println("\nName: " + details[0]);
        System.out.println("Age: " + details[1]);
        System.out.println("Address:" + details[2]);
        System.out.println("Blood Group: " + details[3]);
        System.out.println("Mobile number: " + details[4]);
        System.out.println("total amount to pay: " + t);
    }

    void showdetails(String[] details, int t, int no) {
        System.out.println("\n\n------------------------------------");
        System.out.println("Patient: " + details[0] + " Bill");
        System.out.println("------------------------------------");
        System.out.println("Room number: " + no);
        System.out.println("\nName: " + details[0]);
        System.out.println("Age: " + details[1]);
        System.out.println("Address:" + details[2]);
        System.out.println("Blood Group: " + details[3]);
        System.out.println("Mobile number: " + details[4]);
        System.out.println("total amount to pay: " + t);
    }
}

class NotvalidbgException extends Exception {
    String bloodgroup;

    public NotvalidbgException(String bg) {
        this.bloodgroup = bg;
    }
}

class check_bg {
    void check_bg(String bg) throws NotvalidbgException {
        if (bg.equals("A+ve") == true || bg.equals("A-ve") == true || bg.equals("AB+ve") == true
                || bg.equals("AB-ve") == true || bg.equals("B+ve") == true || bg.equals("B-ve") == true
                || bg.equals("O+ve") == true || bg.equals("O-ve") == true) {
        } else {
            throw new NotvalidbgException(bg); // throw an object of user defined exception
        }
    }
}

class docselec {
    Scanner sc = new Scanner(System.in);
    String doc1, doc2, docselec;
    int appcost = 500;
    String[] details = new String[5];
    double time1, time2; // enter railway time

    void cardio() {
        doc1 = "cardio_doc_1";
        time1 = 15.30;
        doc2 = "cardio_doc_2";
        time2 = 20.45;
    }

    void ortho() {
        doc1 = "ortho_doc_1";
        time1 = 15.30;
        doc2 = "ortho_doc_2";
        time2 = 20.45;
    }

    void gynec() {
        doc1 = "gynec_doc_1";
        time1 = 15.30;
        doc2 = "gynec_doc_2";
        time2 = 20.45;
    }

    void pedia() {
        doc1 = "ped_doc_1";
        time1 = 15.30;
        doc2 = "ped_doc_2";
        time2 = 20.45;
    }

    void gen() {
        doc1 = "general_doc_1";
        time1 = 15.30;
        doc2 = "general_doc_2";
        time2 = 20.45;
    }

    void display() {
        System.out.println("\n1.Doctor name:   " + doc1 + "\t\tTiming:       " + time1 + "\n2.Doctor name:   " + doc2
                + "\t\tTiming:       " + time2);
        System.out.println("\nEnter 1 to choose: " + doc1 + "\nEnter 2 to choose: " + doc2);
        int s = sc.nextInt();
        if (s == 1) {
            docselec = doc1;
            System.out.println(
                    "Appointment booked successfully with doctor " + doc1 + "\nThe Appointment cost: " + appcost);
        }
        if (s == 2) {
            docselec = doc2;
            System.out.println(
                    "Appointment booked successfully with doctor " + doc2 + "\nThe Appointment cost: " + appcost);
        }
    }

    void getdetails() {
        System.out.println("Patient data entry: ");
        System.out.println("Enter your name,age,address,blood group,mobile");
        for (int i = 0; i < 5; i++) {
            details[i] = sc.nextLine();
            if (i == 3) {
                try {
                    check_bg bloodgroup = new check_bg();
                    bloodgroup.check_bg(details[3]);
                } catch (NotvalidbgException e) {
                    System.out.println("It is an invalid bloodgroup:" + e.bloodgroup + "\n");
                    System.out.println("Enter a proper bloodgroup:");
                    details[3] = sc.nextLine();
                    System.out.println("Enter your mobile number:");
                }
            }
        }
    }
}

class diagnosis {
    int diagcost;
    String test1, test2;
    int cost1, cost2;
    display d = new display();

    void cardio() {
        Scanner tc = new Scanner(System.in);
        System.out.println("\n\n------------------------------------");
        System.out.println("Data entered by the doctor\n");
        System.out.print("enter the name of the test1: ");
        test1 = tc.nextLine();
        System.out.print("cost of the test: ");
        cost1 = tc.nextInt();
        System.out.print("enter the name of the test2: ");
        Scanner hi = new Scanner(System.in);
        test2 = hi.nextLine();
        System.out.print("cost of the test: ");
        cost2 = tc.nextInt();
        diagcost = d.display(test1, test2, cost1, cost2);
    }

    void ortho() {
        Scanner tc = new Scanner(System.in);
        System.out.println("\n\n------------------------------------");
        System.out.println("Data entered by the doctor\n");
        System.out.print("enter the name of the test1: ");
        test1 = tc.nextLine();
        System.out.print("cost of the test: ");
        cost1 = tc.nextInt();
        System.out.print("enter the name of the test2: ");
        Scanner hi = new Scanner(System.in);
        test2 = hi.nextLine();
        System.out.print("cost of the test: ");
        cost2 = tc.nextInt();
        diagcost = d.display(test1, test2, cost1, cost2);
    }

    void gynec() {
        Scanner tc = new Scanner(System.in);
        System.out.println("\n\n------------------------------------");
        System.out.println("Data entered by the doctor\n");
        System.out.print("enter the name of the test1: ");
        test1 = tc.nextLine();
        System.out.print("cost of the test: ");
        cost1 = tc.nextInt();
        System.out.print("enter the name of the test2: ");
        Scanner hi = new Scanner(System.in);
        test2 = hi.nextLine();
        System.out.print("cost of the test: ");
        cost2 = tc.nextInt();
        diagcost = d.display(test1, test2, cost1, cost2);
    }

    void pedia() {
        Scanner tc = new Scanner(System.in);
        System.out.println("\n\n------------------------------------");
        System.out.println("Data entered by the doctor\n");
        System.out.print("enter the name of the test1: ");
        test1 = tc.nextLine();
        System.out.print("cost of the test: ");
        cost1 = tc.nextInt();
        System.out.print("enter the name of the test2: ");
        Scanner hi = new Scanner(System.in);
        test2 = hi.nextLine();
        System.out.print("cost of the test: ");
        cost2 = tc.nextInt();
        diagcost = d.display(test1, test2, cost1, cost2);
    }

    void gen() {
        Scanner tc = new Scanner(System.in);
        System.out.println("\n\n------------------------------------");
        System.out.println("Data entered by the doctor\n");
        System.out.print("enter the name of the test1: ");
        test1 = tc.nextLine();
        System.out.print("cost of the test: ");
        cost1 = tc.nextInt();
        System.out.print("enter the name of the test2: ");
        Scanner hi = new Scanner(System.in);
        test2 = hi.nextLine();
        System.out.print("cost of the test: ");
        cost2 = tc.nextInt();
        diagcost = d.display(test1, test2, cost1, cost2);
    }
}

class Main {
    public static void main(String args[]) {
        int total, admncost;
        int[] room = { 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260, 270, 280, 290, 300,
                310, 320, 330, 340, 350 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to TCE hospital!!");
        System.out.println("Do you want to make a appointment??yes/no");
        String a = sc.nextLine();
        if (a.equals("yes") == true) {
            docselec doc = new docselec();
            diagnosis dg = new diagnosis();
            doc.getdetails();
            System.out.println("\nchoose Your doctor and dept according to Your problem or symptoms: ");
            System.out.println("1]cardio\n2]ortho\n3]gynec\n4]pediatrics\n5]general");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    doc.cardio();
                    doc.display();
                    dg.cardio();
                    break;
                }
                case 2: {
                    doc.ortho();
                    doc.display();
                    dg.ortho();
                    break;
                }
                case 3: {
                    doc.gynec();
                    doc.display();
                    dg.gynec();
                    break;
                }
                case 4: {
                    doc.pedia();
                    doc.display();
                    dg.pedia();
                    break;
                }
                case 5: {
                    doc.gen();
                    doc.display();
                    dg.gen();
                    break;
                }
            }
            int i = 0, roomno, r;
            display c = new display();
            Scanner ran = new Scanner(System.in);
            System.out.print("enter the range of the tests from 1 to 10: ");
            r = ran.nextInt();
            if (0 < r && r < 4) {
                System.out.println("you are safe in both the tests! you can go home\n");
            } else if (3 < r && r < 8) {
                System.out.println("you are advised to get admitted, but still you can choose\n");
                System.out.println("Do you want to get admitted??yes/no");
                Scanner yn = new Scanner(System.in);
                String ans = yn.nextLine();
                if (ans.equals("yes") == true) {
                    roomno = room[i];
                    i++;
                    System.out.println("You have been assigned with room number : " + roomno + "\n");
                    admncost = 1500;
                    System.out.println("WE WILL TAKE CARE OF YOU!!");
                    System.out.println("Your admission cost: " + admncost);
                    total = doc.appcost + dg.diagcost + admncost;
                    c.showdetails(doc.details, total, roomno);
                } else {
                    total = doc.appcost + dg.diagcost;
                    c.showdetails(doc.details, total);
                }
            } else {
                System.out.println("you should be admitted right now!");
                roomno = room[i];
                i++;
                System.out.println("You have been assigned with room number : " + roomno + "\n");
                admncost = 1500;
                System.out.println("WE WILL TAKE CARE OF YOU!!");
                System.out.println("Your admission cost: " + admncost);
                total = doc.appcost + dg.diagcost + admncost;
                c.showdetails(doc.details, total, roomno);
            }
        } else {
            System.out.println("No appointment is made" + "\nVisit us if needed");
        }
    }
}
