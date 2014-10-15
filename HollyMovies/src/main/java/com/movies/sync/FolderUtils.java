public class FolderUtils {

  private static final Logger logger = LoggerFactory.getLogger(FolderUtils.class);
  
  public static Set<Movie> createFolderList(String sourcePath, Set<String> folderNames) {
    Set<Movie> folderList = new HashSet<~>();
    for (String movie:folderNames) {
      folderList.add(new Movie(movie));
    }
  }
  
  public static Set<String> folderList = new HashSet<~>();

}
