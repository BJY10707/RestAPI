package com.ohgiraffers.base64;

import java.util.Base64;
import java.util.Base64.*;


public class EncodingDecoding {

    public static void main(String[] args) {

        // Java v8부터 기본 제공하는 Base64 기반의 인코더와 디코더
        Encoder encoder = Base64.getEncoder();
        Decoder decoder = Base64.getDecoder();

        // 1. encoder 사용해보기
        String plainText = "신죠오 사사게요오오";
        byte[] plainTextToByteArr = plainText.getBytes();

        byte[] encodedArr = encoder.encode(plainTextToByteArr);

        String encodedStr = new String(encodedArr);
        System.out.println("심장을 바쳐라 = " + encodedStr);

        // 2. decoder 사용해보기
        byte[] decodedArr = decoder.decode(encodedStr);
        System.out.println("다시 디코딩된 글 = " + new String(decodedArr));
    }
}
