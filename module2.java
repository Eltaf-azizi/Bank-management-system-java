package Library Management System;

public class module2 {
    

    public void chemistry() {

        String chem[] = {"Organic chemistry", "Physical chemistry", "Bio chemistry", "Inorganic chemistry", "Polymer chemistry"};


        System.out.println("The books available i chemistry are as follow:");
        for (int i=0; i<chem.length; i++) {
            System.out.println("chem[i]");
        }
    }


    public void physics() {

        String phy[] = {"Mechanics", "Dynamics", "Solid State Phisics", "Astro Physics", "Electromagnetism"};


        System.out.println("The books available in Physics department are as follow");
        for (int j=0; j<phy.length;j++) {
            System.out.println(phy[j]);
        }
    }

    public void biology() {

        
        String bio[] = {"Zoology", "Botany", "Medical Science", "biotechnology", "Immunology"};

        System.out.println("The books available in biology department are as follow");
        for (int k=0; k<bio.length;k++) {
            System.out.println(bio[k]);
        }
    }
}
