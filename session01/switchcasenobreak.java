package session1.exercise3;

public class switchcasenobreak {

	public static void main(String[] args) {
		String name = "Ali";

switch (name) {
		case "Ali", "Milad" -> System.out.println("Welcome Men");
		case "Mahsa" -> System.out.println("Welcome Women");
		default -> System.out.println("Who are you ?!");
		}
