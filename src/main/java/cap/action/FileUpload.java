package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

class FileUploadAction extends ActionSupport {
    private File file;
    private String fileFileName;

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String upload() {
        try{
            InputStream is = new FileInputStream(file);
            OutputStream os= new OutputStream("d:\\" + fileFileName) {
                @Override
                public void write(int b) throws IOException {

                }
            };
            byte[]buffer=new byte[1024];
            int length=0;
            while ((length=is.read(buffer))!=-1){
                os.write(buffer,0,length);
                }
        }catch (FileNotFoundException e){
            e.printStackTrace();
            }catch (IOException e){
            e.printStackTrace();
        }
        return SUCCESS;

        }



    {
    }
}
