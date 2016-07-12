package net.zerocoding.tutorials;

public class SimpleCalculator implements ICalculator {

	@Override
	public void add(int num1, int num2) {
		System.out.println("더하기 연산");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		int result = num1 + num2;
		System.out.println("Result : " + result);
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println("빼기 연산");
		int result = num1 - num2;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Result : " + result);
	}

	@Override
	public void mul(int num1, int num2) {
		System.out.println("곱하기 연산");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		int result = num1 * num2;
		System.out.println("Result : " + result);
	}

	@Override
	public void div(int num1, int num2) {
		System.out.println("나누기 연산");
		System.out.println("주의사항 : 0으로 나누지 않기");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		int result = num1 / num2;
		System.out.println("Result : " + result);
	}
}