/*
        * Complete the function below.
        *//*

public static String[] findPathToNode(Node node, Integer pixelX, Integer pixelY) {

        // System.out.println("Pixel X"+pixelX);
        // System.out.println("Pixel Y"+pixelY);


        ArrayList<String> outputPath = new ArrayList<>();

        int index = 0;
        if (node != null) {

        outputPath = PathToNodeRecursive(node,pixelX,pixelY);
        if(outputPath == null){
        return new String[]{};
        }else{
        String[] out = new String[outputPath.size()];
        out = outputPath.toArray(out);
        return out;
        }

        }
        return new String[]{};
        }


public static ArrayList<String> PathToNodeRecursive(Node node, Integer pixelX, Integer pixelY) {

        // System.out.println("Pixel X"+pixelX);
        // System.out.println("Pixel Y"+pixelY);


        ArrayList<String> outputPath = new ArrayList<>();

        int index = 0;
        if (node != null) {
        if ((pixelX >= node.left && pixelX <= node.width-1)  &&
        (pixelY >= node.top && pixelY <= node.height-1)) {
        outputPath.add(node.nodeId);
        } else {
        return null;
        }
        if (node.children.length > 0) {
        String childOutput = null;
        Node[] children = node.children;
        for (Node childNode : children) {
        //System.out.println("Pixel X " +pixelX);
        //System.out.println("childLeft " +childNode.left);

        if (pixelX >= childNode.left && (pixelX <= (childNode.left + childNode.width-1))) {
        if (pixelY >= childNode.top && (pixelY <= (childNode.top + childNode.height-1))) {
        childOutput = childNode.nodeId;
        }
        }
        }
        if(childOutput!=null)
        outputPath.add(childOutput);
        }

        }
        //String[] out = new String[outputPath.size()];
        //out = outputPath.toArray(out);
        return outputPath;


        }

*/
