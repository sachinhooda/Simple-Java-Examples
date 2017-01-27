package com.java.sachin.inheritance;

import java.util.logging.Logger;

public class TwistedInheritanceAndInterfaces {

	public static void main(String args[]) {

		Logger logger = Logger.getLogger("TwistedInheritanceAndInterfaces.class");
		
		logger.info("Child Implementation");
		
		Child child = new Child();
		child.richFamily();
		child.behaviour();
		child.build();
		child.treatment();

		logger.info("Father Implementation");
		
		Father father = new Father();
		father.richFamily();
		father.behaviour();
		father.treatment();

		logger.info("Engineer reference to Child");
		
		Engineer engineer = new Child();
		engineer.build();

		logger.info("Doctor reference to Father");
		
		Doctor doctor = new Father();
		doctor.treatment();

		logger.info("GrandFather reference to Father");
		
		AbstractGrandFather sonFather = new Father();
		sonFather.behaviour();
		sonFather.richFamily();

		logger.info("GrandFather reference to Grandson");
		
		AbstractGrandFather grandson = new Child();
		grandson.behaviour();
		grandson.richFamily();

		logger.info("Father reference to Child");
		
		Father fatherOfSon = new Child();
		fatherOfSon.behaviour();
		fatherOfSon.richFamily();
		fatherOfSon.treatment();

	}
}
