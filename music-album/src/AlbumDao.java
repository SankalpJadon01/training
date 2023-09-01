import java.util.List;

public interface AlbumDao {

	void persist(Album a);
	List<Album> findByTitle(String title)throws InvalidAlbumException;
	List <Album> list();
	List <Album> findByArtist(String artist);
	List <Album> findByGenre(String genre);
	boolean update(Album a);
	boolean delete(String s)throws InvalidAlbumException;
	
	}
	

