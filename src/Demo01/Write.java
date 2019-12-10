package Demo01;

import java.io.*;
import java.util.Date;

public class Write {
    private Integer id;
    private Integer writeManId;
    private Integer readManId;
    //private Date time;
    private String content;
    private String filePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWriteManId() {
        return writeManId;
    }

    public void setWriteManId(Integer writeManId) {
        this.writeManId = writeManId;
    }

    public Integer getReadManId() {
        return readManId;
    }

    public void setReadManId(Integer readManId) {
        this.readManId = readManId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Write{" +
                "id=" + id +
                ", writeManId=" + writeManId +
                ", readManId=" + readManId +
                ", content='" + content + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }

    public void  writeWords(String words,String path) throws IOException {
        File file=new File(path);
        Writer writer=new OutputStreamWriter(new FileOutputStream(file));
        writer.write(words);
        writer.close();
    }
}
