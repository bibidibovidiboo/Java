// < Ä¸½¶È­  >
// lombok ¶óÀÌºê·¯¸® »ç¿ë
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MovieVO {
	// ¸ðµç ¸â¹öº¯¼ö ==> private
	private int mno;
	private String title;
	private String director;
	private String actor;
	private String genre;
	private String grade;
	private double score;
	private String story;

}
