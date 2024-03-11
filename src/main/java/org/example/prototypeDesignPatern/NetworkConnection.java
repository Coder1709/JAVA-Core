package org.example.prototypeDesignPatern;

public class NetworkConnection implements Cloneable{

    //we have to make this class cloneable


    private String ip;

    private int port ;

    private String importantData;


        NetworkConnection(){

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }



    public void loadVeryImportantData (){
        this.importantData = "Ver=y Very Important data";
        //it will take 5min

    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
