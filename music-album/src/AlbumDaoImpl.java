import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlbumDaoImpl implements AlbumDao {

	List<Album> albums;

	public AlbumDaoImpl() throws Exception {
		Stream<String> lines = Files.lines(Paths.get("src/albums.txt"));

		albums = lines.map(line -> {
			String[] record = line.split(",");
			return new Album(record[0], record[1], record[2]);
		}).collect(Collectors.toList());

	}

	@Override
	public void persist(Album a) {
		albums.add(a);

	}

	@Override
	public List<Album> findByTitle(String title) throws InvalidAlbumException {

		return albums.stream().filter(p -> p.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
	}

	@Override
	public List<Album> list() {
		return albums;
	}

	@Override
	public List<Album> findByArtist(String artist) {
		return albums.stream().filter(p -> p.getArtist().equalsIgnoreCase(artist)).collect(Collectors.toList());
	}

	@Override
	public List<Album> findByGenre(String genre) {

		return albums.stream().filter(p -> p.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());

	}

	@Override
	public boolean update(Album a) {
		if (albums.add(a)) {
			albums.add(a);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String title) throws InvalidAlbumException {
		return albums.removeIf(p -> p.getTitle().equalsIgnoreCase(title)) ? true : false;
	}

}
