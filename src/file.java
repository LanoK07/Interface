public abstract class file {

    String Filename;

    double creationTime;

    String Filetype;

    public file(){
        Filename = "";
        creationTime = 1900;
        Filetype = "";
    }

    public file(String Filename, double creationTime, String Filetype){
        this.Filename = Filename;
        this.creationTime = creationTime;
        this.Filetype = Filetype;

    }

    public void setCreationTime(double creationTime){
        this.creationTime = creationTime;

    }

    public double getCreationTime() {
        return creationTime;
    }
    public abstract void OpenAndExecute();



}
