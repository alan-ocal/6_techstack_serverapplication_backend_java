package com.student.annotations.override;

class Dog extends Animal {
	
	@Override
	void makeSound() {
		System.out.println("Woof");
	}
}
