using System;
using System.Collections.Generic;
using System.IO;

class Person {
    public int age;     
	public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        this.age = initialAge;
     }
     public void amIOld() {
         // Initial check
         if(age < 0){
            print("Age is not valid, setting age to 0.");
            age = 0;
         }
         
         // Do some computations in here and print out the correct statement to the console 
         if(age < 13) print("You are young.");
         else if(age >= 13 && age < 18) print("You are a teenager.");
         else if(age >= 18) print("You are old.");
     }
        
     private void print(string text) => Console.WriteLine(text);
     
     public void yearPasses() {
        // Increment the age of the person in here
        ++age;
     }

static void Main(String[] args) {
