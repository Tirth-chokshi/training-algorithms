package BlockChain;

import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timestamp;

    public Block(String data, String prevHash){
        this.data = data;
        this.previousHash = prevHash;
        this.timestamp = new Date().getTime();
        this.hash = calculateHash(); //Making sure we do this after we set the other values.
    }
    public String calculateHash(){
        String calculatedHash = StringUtil.applySha256(previousHash+Long.toString(timestamp)+data);
        return calculatedHash;
    }

}
