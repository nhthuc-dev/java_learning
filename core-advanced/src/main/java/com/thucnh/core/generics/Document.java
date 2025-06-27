package com.thucnh.core.generics;

public class Document <T>{

    private T content;

    public Document(T content){
        this.content = content;
    }
    public T getContent(){
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
    public static void main(String[] args) {
        Document<String> documentString = new Document<>("Excel");
        Document<Integer> documentInteger = new Document<>(36);
        System.out.println(documentString.getContent());
        System.out.println(documentInteger.getContent());
    }
}
