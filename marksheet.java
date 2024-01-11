class Theory {
    private int java_th;
    private int php_th;
    private int web_th;
    private int c_th;

    private int java_prac;
    private int php_prac;
    private int web_prac;
    private int c_prac;

    private String name;
    private String F_name;
    private int Roll_NO;
    private int Enroll_NO;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getF_name() {
		return this.F_name;
	}

	public void setF_name(String F_name) {
		this.F_name = F_name;
	}

	public int getRoll_NO() {
		return this.Roll_NO;
	}

	public void setRoll_NO(int Roll_NO) {
		this.Roll_NO = Roll_NO;
	}

	public int getEnroll_NO() {
		return this.Enroll_NO;
	}

	public void setEnroll_NO(int Enroll_NO) {
		this.Enroll_NO = Enroll_NO;
	}


    public void setTheoryMarks(int j, int p, int w, int c) {
        this.java_th = j;
        this.php_th = p;
        this.web_th = w;
        this.c_th = c;
    }

    public void setPracticalMarks(int j, int p, int w, int c) {
        this.java_prac = j;
        this.php_prac = p;
        this.web_prac = w;
        this.c_prac = c;
    }

    public int[] getPracticalMarks() {
        int[] arr = new int[4];
        arr[0] = java_prac;
        arr[1] = php_prac;
        arr[2] = web_prac;
        arr[3] = c_prac;

        return arr;
    }

    public int[] getTheoryMarks() {
        int[] arr = new int[4];
        arr[0] = java_th;
        arr[1] = php_th;
        arr[2] = web_th;
        arr[3] = c_th;

        return arr;
    }
    public int sum(){
        return this.java_prac+this.php_prac+this.web_prac+this.c_prac+this.java_th+this.php_th+this.web_th+this.c_th;
    }
    public int percentage(){
        return (this.java_prac+this.php_prac+this.web_prac+this.c_prac+this.java_th+this.php_th+this.web_th+this.c_th)*100/400;
    }

   
}

public class marksheet {
    public static void main(String[] args) {
        Theory t1 = new Theory();

        // Set theory and practical marks
        t1.setTheoryMarks(34, 30, 40, 45);
        t1.setPracticalMarks(40, 35, 20, 30);
        t1.setEnroll_NO(242);
        t1.setF_name("John");
        t1.setName("Mohit");
        t1.setRoll_NO(101);

        // Display marksheet
        System.out.println("Candidate Name: " + t1.getName());
        System.out.println("Roll No: "+ t1.getRoll_NO());
        System.out.println("Father Name: "+t1.getF_name());
        System.out.println("Enrollment No: "+t1.getEnroll_NO());
        System.out.println("Subject: MAX MIN Theory  Practical  Total ");
        System.out.println("JAVA:    100  40   " + t1.getTheoryMarks()[0] + "       " + t1.getPracticalMarks()[0] + "       " + (t1.getTheoryMarks()[0] + t1.getPracticalMarks()[0]));
        System.out.println("C:       100  40   " + t1.getTheoryMarks()[3] + "       " + t1.getPracticalMarks()[1] + "       " + (t1.getTheoryMarks()[3] + t1.getPracticalMarks()[1]));
        System.out.println("PHP:     100  40   " + t1.getTheoryMarks()[1] + "       " + t1.getPracticalMarks()[2] + "       " + (t1.getTheoryMarks()[1] + t1.getPracticalMarks()[2]));
        System.out.println("Web:     100  40   " + t1.getTheoryMarks()[2] + "       " + t1.getPracticalMarks()[3] + "       " + (t1.getTheoryMarks()[2] + t1.getPracticalMarks()[3]));
        System.out.println("---------------------------------------------");


        System.out.println("Max Marks   Min Marks   Obtained Marks  Percentage");
        System.out.println("400 \t\t200    "+"  "+t1.sum() +"  \t\t" + t1.percentage());
    }
}
