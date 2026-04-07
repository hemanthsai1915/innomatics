package com.sai.innomatics;


	import java.io.FileInputStream;
	import java.io.ObjectInputStream;

	public class ReadData {
	    public static void main(String[] args) {
	        try {
	            FileInputStream fis = new FileInputStream("objectdata.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);

	            Movie m = (Movie) ois.readObject(); // cast required

	            ois.close();
	            fis.close();

	            m.selectTheatre(); // use the object

	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

