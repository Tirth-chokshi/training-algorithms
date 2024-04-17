package BlockChain;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockChain {
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<Block>();

        /* normal way to make blocks
        Block genesisBlock = new Block("Hi im the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);
        Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);
        Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
        */

        // array list blocks
        blockchain.add(new Block("First block","0"));
        blockchain.add(new Block("Second block",blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("Third block",blockchain.get(blockchain.size()-1).hash));

        System.out.println(Arrays.deepToString(blockchain.toArray()));
    }
}
