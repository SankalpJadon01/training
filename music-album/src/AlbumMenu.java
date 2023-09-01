import java.util.Scanner;

public class AlbumMenu {

	private static AlbumDaoImpl dao;

	static {

		try {
			dao = new AlbumDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		while (true) {

			System.out.println("Main Menu");

			System.out.println(
					"1- Persist Album\n2- Find By Artist\n3- Find By Title\n4- Find By Genre\n5- List\n6- Delete\n7- Update\n8- Exit");

			System.out.println("Enter Choice");

			int choice = console.nextInt();

			switch (choice) {

			case 1:
				persistProduct();
				break;

			case 2:
				findByArtist();
				break;

			case 3:
				findByTitle();
				break;

			case 4:
				findByGenre();
				break;

			case 5:
				list();
				break;

			case 6:
				delete();
				break;

			case 7:
				update();
				break;
			case 8:
				System.exit(0);

			default:
				System.out.println("Invalid option");

			}

		}

	}

	private static void update() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Album details to update: ");

		String update = console.next();
		String update1 = console.next();
		String update2 = console.next();

		Album a = new Album(update, update1, update2);
		System.out.println(dao.update(a));

	}

	private static void delete() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Album's Title to delete: ");

		String delete = console.next();

		try {
			System.out.println(dao.delete(delete));
		} catch (InvalidAlbumException e) {
			e.printStackTrace();
		}

	}

	private static void list() {
		dao.list().forEach(System.out::println);
	}

	private static void findByGenre() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Genre to find: ");

		String genre = console.next();

		System.out.println(dao.findByGenre(genre));

	}

	private static void findByTitle() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Title to find: ");

		String title = console.next();

		try {
			System.out.println(dao.findByTitle(title));
		} catch (InvalidAlbumException e) {
			e.printStackTrace();
		}

	}

	private static void findByArtist() {
		Scanner console = new Scanner(System.in);

		System.out.println("Enter Artist name to find: ");

		String artist = console.next();

		System.out.println(dao.findByArtist(artist));

	}

	private static void persistProduct() {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter Genre: ");

		String genre = console.next();

		System.out.println("Enter Title: ");

		String artist = console.next();

		System.out.println("Enter Artist: ");

		String title = console.next();

		Album p = new Album(genre, artist, title);

		dao.persist(p);
		System.out.println("\nAdded successfully");

	}

}
