package net.zerocoding.tutorials;

public interface ICalculator {

	/**
	 * 더하기 기능
	 * @param num1
	 * @param num2
	 */
	public void add(int num1, int num2);

	/**
	 * 빼기 기능
	 * @param num1
	 * @param num2
	 */
	public void sub(int num1, int num2);

	/**
	 * 곱하기 기능
	 * @param num1
	 * @param num2
	 */
	public void mul(int num1, int num2);

	/**
	 * 나누기 기능
	 * @param num1
	 * @param num2
	 */
	public void div(int num1, int num2);

}